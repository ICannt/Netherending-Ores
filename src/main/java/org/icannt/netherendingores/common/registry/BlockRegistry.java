package org.icannt.netherendingores.common.registry;

import java.util.HashSet;
import java.util.Set;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.client.block.itemblock.ItemBlockOreModded1;
import org.icannt.netherendingores.client.block.itemblock.ItemBlockOreOther1;
import org.icannt.netherendingores.client.block.itemblock.ItemBlockOreVanilla;
import org.icannt.netherendingores.common.block.blocks.BlockOreEndModded1;
import org.icannt.netherendingores.common.block.blocks.BlockOreEndVanilla;
import org.icannt.netherendingores.common.block.blocks.BlockOreNetherModded1;
import org.icannt.netherendingores.common.block.blocks.BlockOreNetherVanilla;
import org.icannt.netherendingores.common.block.blocks.BlockOreOther1;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by ICannt on 17/08/17.
 */

@GameRegistry.ObjectHolder(NetherendingOres.MOD_ID)
public class BlockRegistry {

    @GameRegistry.ObjectHolder("ore_nether_vanilla")
    public static final BlockOreNetherVanilla ORE_NETHER_VANILLA = new BlockOreNetherVanilla();
    
    @GameRegistry.ObjectHolder("ore_nether_modded_1")
    public static final BlockOreNetherModded1 ORE_NETHER_MODDED_1 = new BlockOreNetherModded1();
    
    @GameRegistry.ObjectHolder("ore_end_vanilla")
    public static final BlockOreEndVanilla ORE_END_VANILLA = new BlockOreEndVanilla();
    
    @GameRegistry.ObjectHolder("ore_end_modded_1")
    public static final BlockOreEndModded1 ORE_END_MODDED_1 = new BlockOreEndModded1();
    
    @GameRegistry.ObjectHolder("ore_other_1")
    public static final BlockOreOther1 ORE_OTHER_1 = new BlockOreOther1();

    private static final Block[] blocks = {
            ORE_NETHER_VANILLA,
            ORE_NETHER_MODDED_1,
            ORE_END_VANILLA,
            ORE_END_MODDED_1,
            ORE_OTHER_1
    };    
    
    private static final ItemBlock[] items = {
        new ItemBlockOreVanilla(ORE_NETHER_VANILLA),
        new ItemBlockOreModded1(ORE_NETHER_MODDED_1),
        new ItemBlockOreVanilla(ORE_END_VANILLA),
        new ItemBlockOreModded1(ORE_END_MODDED_1),
        new ItemBlockOreOther1(ORE_OTHER_1)
    };
    
    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            final IForgeRegistry<Block> registry = event.getRegistry();
            registry.registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            final IForgeRegistry<Item> registry = event.getRegistry();
            //registry.register(new ItemBlock(ORE_NETHER_VANILLA).setRegistryName(ItemBlockOreVanilla().getBlock().getRegistryName()));
            for (ItemBlock item : items) {
                registry.register(item.setRegistryName(item.getBlock().getRegistryName()));
                ITEM_BLOCKS.add(item);
                //NetherendingOres.LOGGER.warn(item.getBlock().getRegistryName());
                //NetherendingOres.LOGGER.warn(item);
            }
        }

    }
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    	System.out.println("~~~ Inside initModels ~~~");
    }
    
    /*
    @SideOnly(Side.CLIENT)
    public static void initBlockModels() {
    	
    	System.out.println("~~~HERE~~~");
    	//ItemBlock itemBlock = MOD_ITEM_BLOCKS[0];
    	//System.out.println(itemBlock);
//    	System.out.println(Item.getItemFromBlock(ORE_NETHER_VANILLA));
//    	System.out.println(Item.getItemFromBlock(ORE_NETHER_VANILLA).getRegistryName());
    	
    	
    	// RESOURCE LOCATION
    	// item.getBlock().getRegistryName()
    	// netherendingores:ore_nether_vanilla
    	
        for (ItemBlock item : items) {
        	// Current Resource Location for itemBlocks
            System.out.println(item.getBlock().getRegistryName());
            // Class - net.minecraft.block.Block
            System.out.println(item.getBlock().getRegistryType());
        }
        
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_NETHER_VANILLA), 0, new ModelResourceLocation(ORE_NETHER_VANILLA.getRegistryName(), "inventory"));
        
        // setCustomModelResourceLocation(Item item, int metadata, ModelResourceLocation model)
        // ModelResourceLocation(ResourceLocation location, String variantIn)
    	
    	//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_NETHER_VANILLA), 0, new ModelResourceLocation(Item.getItemFromBlock(ORE_NETHER_VANILLA).getRegistryName(), "inventory"));
//        ORE_NETHER_VANILLA.initClient();
//        ORE_NETHER_MODDED_1.initClient();
//        ORE_END_VANILLA.initClient();
//        ORE_END_MODDED_1.initClient();
//        ORE_OTHER_1.initClient();   
    }
    */
}