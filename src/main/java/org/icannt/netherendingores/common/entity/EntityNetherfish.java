package org.icannt.netherendingores.common.entity;

import java.util.Random;

import org.icannt.netherendingores.common.registry.BlockRegistry;
import org.icannt.netherendingores.common.registry.RegistryEvents;
import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

/**
 * Created by ICannt on 09/02/18.
 */
public class EntityNetherfish extends EntitySilverfish {

	public static final ResourceLocation LOOT_TABLE = new ResourceLocation(Info.MOD_ID, "entities/netherfish");
	
	private EntityNetherfish.AISummonNetherfish summonNetherfish;
	
	public EntityNetherfish(World worldIn) {
		
		super(worldIn);
		
        this.isImmuneToFire = true;
        
	}

    @Override
    protected void applyEntityAttributes() {
    	
        super.applyEntityAttributes();
        
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(Config.netherfishMaxHealth);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(Config.netherfishMovementSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(Config.netherfishAttackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Config.netherfishKnockbackResistance);
        
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected void initEntityAI() {
		
		super.initEntityAI();
		
        this.summonNetherfish = new EntityNetherfish.AISummonNetherfish(this);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(3, this.summonNetherfish);
        this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(5, new EntityNetherfish.AIHideInNetherrack(this));
        
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        
	}
	
    @Override
    public void onLivingUpdate() {
    	
        if (world.isRemote) {
            double flameX = this.posX + (this.rand.nextDouble() - 0.5D) * this.width;
            double flameY = this.posY + this.rand.nextDouble() * this.height;
            double flameZ = this.posZ + (this.rand.nextDouble() - 0.5D) * this.width;
            this.world.spawnParticle(EnumParticleTypes.FLAME, flameX, flameY, flameZ, 0.0D, 0.0D, 0.0D);
        }
        
        super.onLivingUpdate();
        
    }
	
	@Override
	protected SoundEvent getAmbientSound() {
		
		return RegistryEvents.ENTITY_NETHERFISH_AMBIENT;
		
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		
		return RegistryEvents.ENTITY_NETHERFISH_HURT;
		
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		
		return RegistryEvents.ENTITY_NETHERFISH_DEATH;
		
	}
	
    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {

        if (this.isEntityInvulnerable(source)) return false;

        if ((source instanceof EntityDamageSource || source == DamageSource.MAGIC) && this.summonNetherfish != null) this.summonNetherfish.notifyHurt();

        return super.attackEntityFrom(source, amount);

    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
    	
        if (Config.netherfishSetFire) entityIn.setFire(3);
        
        return super.attackEntityAsMob(entityIn);
        
    }

    @Override
    protected ResourceLocation getLootTable() {
    	
        return LOOT_TABLE;
        
    }
	
	static class AISummonNetherfish extends EntityAIBase {

        private final EntityNetherfish netherfish;
        private int lookForFriends;

        public AISummonNetherfish(EntityNetherfish netherfish) {
            super();
            this.netherfish = netherfish;
        }

        public void notifyHurt() {
            if (this.lookForFriends == 0) this.lookForFriends = 40;
        }

        @Override
        public boolean shouldExecute() {
            return this.lookForFriends > 0;
        }

        @Override
        public void updateTask() {

            --this.lookForFriends;

            if (this.lookForFriends <= 0) {

                World world = this.netherfish.world;
                Random random = this.netherfish.getRNG();
                BlockPos blockpos = new BlockPos(this.netherfish);

                for (int y = 0; y <= 5 && y >= -5; y = (y <= 0 ? 1 : 0) - y) {
                    for (int x = 0; x <= 10 && x >= -10; x = (x <= 0 ? 1 : 0) - x) {
                        for (int z = 0; z <= 10 && z >= -10; z = (z <= 0 ? 1 : 0) - z) {

                            BlockPos friendBlock = blockpos.add(x, y, z);
                            IBlockState iblockstate = world.getBlockState(friendBlock);

                            if (iblockstate.getBlock() == BlockRegistry.BLOCK_NETHER_NETHERFISH) {

                                if (ForgeEventFactory.getMobGriefingEvent(world, this.netherfish)) world.destroyBlock(friendBlock, true);
                                else world.setBlockState(friendBlock, Blocks.NETHERRACK.getDefaultState(), 3);

                                if (random.nextBoolean()) return;

                            }
                        }
                    }
                }
            }
        }

    }
	
    static class AIHideInNetherrack extends EntityAIWander {

        private EnumFacing facing;
        private boolean doMerge;

        public AIHideInNetherrack(EntityNetherfish netherfish) {
            super(netherfish, 1.0D, 10);
            this.setMutexBits(1);
        }

        @Override
        public boolean shouldExecute() {

            if (this.entity.getAttackTarget() != null) return false;

            else if (!this.entity.getNavigator().noPath()) return false;

            else {

                World world = this.entity.world;
                Random random = this.entity.getRNG();

                if (ForgeEventFactory.getMobGriefingEvent(world, this.entity) && random.nextInt(10) == 0) {

                    this.facing = EnumFacing.random(random);

                    BlockPos blockPos = new BlockPos(this.entity.posX, this.entity.posY + 0.5D, this.entity.posZ).offset(this.facing);
                    IBlockState blockState = world.getBlockState(blockPos);

                    if (blockState == Blocks.NETHERRACK.getDefaultState()) {
                        this.doMerge = true;
                        return true;
                    }

                }

                this.doMerge = false;
                return super.shouldExecute();

            }

        }

        @Override
        public boolean shouldContinueExecuting() {
            return !this.doMerge && super.shouldContinueExecuting();
        }

        @Override
        public void startExecuting() {

            if (!this.doMerge) super.startExecuting();

            else {

                World world = this.entity.world;

                BlockPos blockPos = new BlockPos(this.entity.posX, this.entity.posY + 0.5D, this.entity.posZ).offset(this.facing);
                IBlockState blockState = world.getBlockState(blockPos);

                if (blockState == Blocks.NETHERRACK.getDefaultState()) {

                    world.setBlockState(blockPos, BlockRegistry.BLOCK_NETHER_NETHERFISH.getDefaultState(), 3);

                    this.entity.spawnExplosionParticle();
                    this.entity.setDead();

                }
            }
        }
        
    }

}
