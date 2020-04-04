package org.icannt.netherendingores.common.entity;

import org.icannt.netherendingores.lib.Config;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityPrimedOre extends Entity {

	private static final DataParameter<Integer> OREFUSE = EntityDataManager.<Integer>createKey(EntityPrimedOre.class, DataSerializers.VARINT);
	
	private int fuse;
	private int fuseLen = Config.ORE_EXPLOSION_FUSE_LENGTH_TICKS;
	private float strength = (float) Config.oreExplosionStrength;
	private String fuseKey = "OreFuse";
	
	public EntityPrimedOre(World worldIn) {
		
		super(worldIn);
		
        fuse = fuseLen;
        this.preventEntitySpawning = false;
        this.isImmuneToFire = false;
        this.setSize(0.0F, 0.0F);       
        this.noClip = true;
        
	}
	
    public EntityPrimedOre(World worldIn, double x, double y, double z, Block block)
    {
    	
        this(worldIn);
        
        this.setPosition(x, y, z);
        this.motionX = 0.0F;
        this.motionY = 0.0F;
        this.motionZ = 0.0F;
        setFuse(fuseLen);
        this.prevPosX = x;
        this.prevPosY = y;
        this.prevPosZ = z;
        
    }
    
	@Override
	protected void entityInit() {
        this.dataManager.register(OREFUSE, fuseLen);
	}
	
	@Override
    protected boolean canTriggerWalking()
    {
        return false;
    }

    @Override
    public boolean canBeCollidedWith()
    {
        return false;
    }
    
    @Override
    public void onUpdate()
    {
        --fuse;

        if (fuse <= 0)
        {
            this.setDead();

            if (!this.world.isRemote)
            {
                this.explode();
            }
        }
        else
        {
            this.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
        }
    }
    
    private void explode()
    {
        this.world.createExplosion(this, this.posX, this.posY, this.posZ, strength, true);
    }
    
    @Override
	protected void writeEntityToNBT(NBTTagCompound compound)
    {
        compound.setShort(fuseKey, (short)fuse);
    }

    @Override
	protected void readEntityFromNBT(NBTTagCompound compound)
    {
        setFuse(compound.getShort(fuseKey));
    }
    
    public void setFuse(int fuseIn)
    {
        this.dataManager.set(OREFUSE, fuseIn);
        fuse = fuseIn;
    }
    
    @Override
    public void notifyDataManagerChange(DataParameter<?> key)
    {
        if (OREFUSE.equals(key))
        {
            fuse = this.getFuseDataManager();
        }
    }

    public int getFuseDataManager()
    {
        return this.dataManager.get(OREFUSE);
    }

    public int getFuse()
    {
        return fuse;
    }


}
