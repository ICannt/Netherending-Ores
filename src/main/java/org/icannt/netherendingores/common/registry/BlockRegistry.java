package org.icannt.netherendingores.common.registry;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.icannt.netherendingores.client.block.ItemBlockBasic;
import org.icannt.netherendingores.client.block.itemblock.ItemBlockOreEndModded1;
import org.icannt.netherendingores.client.block.itemblock.ItemBlockOreEndModded2;
import org.icannt.netherendingores.client.block.itemblock.ItemBlockOreEndVanilla;
import org.icannt.netherendingores.client.block.itemblock.ItemBlockOreNetherModded1;
import org.icannt.netherendingores.client.block.itemblock.ItemBlockOreNetherModded2;
import org.icannt.netherendingores.client.block.itemblock.ItemBlockOreNetherVanilla;
import org.icannt.netherendingores.client.block.itemblock.ItemBlockOreOther1;
import org.icannt.netherendingores.common.block.BlockCreativeTab;
import org.icannt.netherendingores.common.block.BlockEndEndermite;
import org.icannt.netherendingores.common.block.BlockNetherNetherfish;
import org.icannt.netherendingores.common.block.blocks.BlockOreEndModded1;
import org.icannt.netherendingores.common.block.blocks.BlockOreEndModded2;
import org.icannt.netherendingores.common.block.blocks.BlockOreEndVanilla;
import org.icannt.netherendingores.common.block.blocks.BlockOreNetherModded1;
import org.icannt.netherendingores.common.block.blocks.BlockOreNetherModded2;
import org.icannt.netherendingores.common.block.blocks.BlockOreNetherVanilla;
import org.icannt.netherendingores.common.block.blocks.BlockOreOther1;
import org.icannt.netherendingores.common.entity.EntityPrimedOre;
import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Log;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by ICannt on 17/08/17.
 */

@GameRegistry.ObjectHolder(Info.MOD_ID)
public class BlockRegistry {

	@GameRegistry.ObjectHolder("creative_tab")
    public static final BlockCreativeTab CREATIVE_TAB = new BlockCreativeTab();

	@GameRegistry.ObjectHolder("block_end_endermite")
    public static final BlockEndEndermite BLOCK_END_ENDERMITE = new BlockEndEndermite();	
	
	@GameRegistry.ObjectHolder("block_nether_netherfish")
    public static final BlockNetherNetherfish BLOCK_NETHER_NETHERFISH = new BlockNetherNetherfish();	
       
    @GameRegistry.ObjectHolder("ore_end_modded_1")
    public static final BlockOreEndModded1 ORE_END_MODDED_1 = new BlockOreEndModded1();
    
    @GameRegistry.ObjectHolder("ore_end_modded_2")
    public static final BlockOreEndModded2 ORE_END_MODDED_2 = new BlockOreEndModded2();
    
    @GameRegistry.ObjectHolder("ore_end_vanilla")
    public static final BlockOreEndVanilla ORE_END_VANILLA = new BlockOreEndVanilla();
    
    @GameRegistry.ObjectHolder("ore_nether_modded_1")
    public static final BlockOreNetherModded1 ORE_NETHER_MODDED_1 = new BlockOreNetherModded1();
    
    @GameRegistry.ObjectHolder("ore_nether_modded_2")
    public static final BlockOreNetherModded2 ORE_NETHER_MODDED_2 = new BlockOreNetherModded2();
    
    @GameRegistry.ObjectHolder("ore_nether_vanilla")
    public static final BlockOreNetherVanilla ORE_NETHER_VANILLA = new BlockOreNetherVanilla();
    
    @GameRegistry.ObjectHolder("ore_other_1")
    public static final BlockOreOther1 ORE_OTHER_1 = new BlockOreOther1();

    private static final Block[] blocks = {
		CREATIVE_TAB,
		BLOCK_END_ENDERMITE,
		BLOCK_NETHER_NETHERFISH,
        ORE_END_MODDED_1,
        ORE_END_MODDED_2,
        ORE_END_VANILLA,
        ORE_NETHER_MODDED_1,
        ORE_NETHER_MODDED_2,
        ORE_NETHER_VANILLA,
        ORE_OTHER_1
    };
    
    /*
        Blocks.QUARTZ_ORE
    */
    
    private static Block[] oreBlocks = {
        ORE_END_MODDED_1,
        ORE_END_MODDED_2,
        ORE_END_VANILLA,
        ORE_NETHER_MODDED_1,
        ORE_NETHER_MODDED_2,
        ORE_NETHER_VANILLA,
        ORE_OTHER_1
    };
    
    private static final ItemBlock[] itemBlocks = {
    	new ItemBlockBasic(CREATIVE_TAB),
    	new ItemBlockBasic(BLOCK_END_ENDERMITE),
    	new ItemBlockBasic(BLOCK_NETHER_NETHERFISH),
        new ItemBlockOreEndModded1(ORE_END_MODDED_1),
        new ItemBlockOreEndModded2(ORE_END_MODDED_2),
        new ItemBlockOreEndVanilla(ORE_END_VANILLA),
        new ItemBlockOreNetherModded1(ORE_NETHER_MODDED_1),
        new ItemBlockOreNetherModded2(ORE_NETHER_MODDED_2),
        new ItemBlockOreNetherVanilla(ORE_NETHER_VANILLA),
        new ItemBlockOreOther1(ORE_OTHER_1)
    };
    
    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
    	
        public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
        	
        	Log.debug("Registering Blocks");
        	
            final IForgeRegistry<Block> registry = event.getRegistry();
            registry.registerAll(blocks);
            
            Log.info("Registered Blocks");
            
        }

        @SubscribeEvent
        public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        	
        	Log.debug("Registering ItemBlocks");
        	
            final IForgeRegistry<Item> registry = event.getRegistry();
            for (ItemBlock iB : itemBlocks) {
                registry.register(iB.setRegistryName(iB.getBlock().getRegistryName()));
                ITEM_BLOCKS.add(iB);
            }
            
            Log.info("Registered ItemBlocks");
            
            // Items and blocks now initialized, load the OreDict
            OreDictionaryRegistry.registerDictionaryOres();
        }

    }
    
    @Mod.EventBusSubscriber
    public static class BlockEventHandler {
    	
    	// TODO: Find a new event, it needs to be an interaction event blockbreak can then cancel the explosion.
    	// Same goes for the pigmen it should be interaction with the block not breaking it.
    	
    	@SubscribeEvent
	    public static void onBlockBreak(BlockEvent.BreakEvent event) {
	    	
	        boolean silktouch = hasEnchant(event.getPlayer(), Enchantments.SILK_TOUCH);
	        boolean fortune = hasEnchant(event.getPlayer(), Enchantments.FORTUNE);
	
	        World world = event.getWorld();
	        BlockPos blockPos = event.getPos();
	        IBlockState blockState = event.getState();
	        EntityPlayer player = event.getPlayer();
	
	        if (Config.zombiePigmanAnger && isAngeringOre(blockState)) {
	            if (!(silktouch && Config.zombiePigmanAngerSilkTouch)) angerPigmen(world, blockPos, player);
	        }
	
	        if (!player.isCreative()) {
		        if (isExplodingOre(blockState)) {
		
		            int multi = Config.oreExplosionFortune && fortune ? 2 : 1;
		
		            if (!(silktouch && Config.oreExplosionSilkTouch)) {
		                if (world.rand.nextDouble() <= Config.oreExplosionChance * multi) {
		                    world.createExplosion(player, blockPos.getX(), blockPos.getY(), blockPos.getZ(), (float) Config.oreExplosionStrength, true);
		                	//world.spawnEntity(new EntityPrimedOre(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), blockState.getBlock()));
		                	//world.playSound(null, blockPos.getX(), blockPos.getY(), blockPos.getZ(), SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1F, 1F);
		                }
		            }
		
		        }
	        }
	
	    }
    }

    private static void angerPigmen(World world, BlockPos blockPos, EntityPlayer player) {

        BlockPos start = new BlockPos(blockPos).add(-Config.zombiePigmanAngerRangeRadius, -Config.zombiePigmanAngerRangeHeight, -Config.zombiePigmanAngerRangeRadius);
        BlockPos end = new BlockPos(blockPos).add(+Config.zombiePigmanAngerRangeRadius, +Config.zombiePigmanAngerRangeHeight, +Config.zombiePigmanAngerRangeRadius);

        AxisAlignedBB aabb  = new AxisAlignedBB(start, end);

        List<EntityPigZombie> list = world.getEntitiesWithinAABB(EntityPigZombie.class, aabb);
        for (EntityPigZombie pigman : list) pigman.setRevengeTarget(player);

    }

    private static boolean hasEnchant(EntityPlayer player, Enchantment enchant) {

        if (player == null || player.getHeldItemMainhand().isEmpty()) return false;

        NBTTagList list = player.getHeldItemMainhand().getEnchantmentTagList();

        for (int i = 0; i < list.tagCount(); i++) {
            short enchantId = list.getCompoundTagAt(i).getShort("id");
            if (Enchantment.getEnchantmentByID(enchantId) == enchant) return true;
        }

        return false;

    }

    private static boolean isAngeringOre(IBlockState blockState) {

        //if (Loader.isModLoaded("tconstruct") && blockState.getBlock() == TinkerCommons.blockOre) return true;
        //if (blockState == TFBlocks.blockOreFluid.getStateFromMeta(3)) return true;
    	
        for (Block block : oreBlocks) {
        	if (blockState.getBlock() == block) return true;
        }

        return false;

    }
    
    //
    private static boolean isExplodingOre(IBlockState blockState) {
    	   	
        for (Block block : oreBlocks) {
        	if (blockState.getBlock() == block) {
    	        for (BlockRecipeData blockData : BlockRecipeData.values()) {
    	        	if (blockData.getModBlock() == blockState.getBlock() && blockData.getBlockMeta() == blockState.getBlock().getMetaFromState(blockState)) {
    	        		if (blockData.getOreExplosion()) {
    	        			return true;
    	        		} else {
    	        			break;
    	        		}
    	        	}
    	        }
        		break;
        	}
        }
        
        return false;

    }
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	CREATIVE_TAB.initItemBlockModels();
    	BLOCK_END_ENDERMITE.initItemBlockModels();
    	BLOCK_NETHER_NETHERFISH.initItemBlockModels();
    	ORE_END_MODDED_1.initItemBlockModels();
    	ORE_END_MODDED_2.initItemBlockModels();
    	ORE_END_VANILLA.initItemBlockModels();
    	ORE_NETHER_MODDED_1.initItemBlockModels();
    	ORE_NETHER_MODDED_2.initItemBlockModels();
    	ORE_NETHER_VANILLA.initItemBlockModels();
    	ORE_OTHER_1.initItemBlockModels();
    }

}
