package org.icannt.netherendingores.common.registry;

import java.util.HashSet;
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
import org.icannt.netherendingores.common.block.blocks.BlockOreEndModded1;
import org.icannt.netherendingores.common.block.blocks.BlockOreEndModded2;
import org.icannt.netherendingores.common.block.blocks.BlockOreEndVanilla;
import org.icannt.netherendingores.common.block.blocks.BlockOreNetherModded1;
import org.icannt.netherendingores.common.block.blocks.BlockOreNetherModded2;
import org.icannt.netherendingores.common.block.blocks.BlockOreNetherVanilla;
import org.icannt.netherendingores.common.block.blocks.BlockOreOther1;
import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Log;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
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
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	CREATIVE_TAB.initItemBlockModels();
    	ORE_END_MODDED_1.initItemBlockModels();
    	ORE_END_MODDED_2.initItemBlockModels();
    	ORE_END_VANILLA.initItemBlockModels();
    	ORE_NETHER_MODDED_1.initItemBlockModels();
    	ORE_NETHER_MODDED_2.initItemBlockModels();
    	ORE_NETHER_VANILLA.initItemBlockModels();
    	ORE_OTHER_1.initItemBlockModels();
    }

}
