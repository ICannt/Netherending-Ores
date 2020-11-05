package org.icannt.netherendingores.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.data.recipe.OreSmeltingRecipe;
import org.icannt.netherendingores.registry.block.BlockRegistry;
import org.icannt.netherendingores.registry.data.DataRegistry;
import org.icannt.netherendingores.registry.item.ItemRegistry;

public class RegistryCommon {

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        for(Block block : BlockRegistry.getBlocks()) {
            if (block.getRegistryName() == null)
                continue;

            event.getRegistry().register(block);
        }
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        for(Item item : ItemRegistry.getItems()) {
            if (item.getRegistryName() == null)
                continue;

            event.getRegistry().register(item);
        }
    }

    @SubscribeEvent
    public static void registerGenerators(final GatherDataEvent event) {
        if (event.includeServer()) {
            DataRegistry.serverSetup(event);
        }
    }

    @SubscribeEvent
    public static void registerSerializers(final RegistryEvent.Register<IRecipeSerializer<?>> event) {
       // Registry.register(Registry.RECIPE_TYPE, NetherendingOres.MOD_ID + ":" + "multiple_smelting", IRecipeType.SMELTING);
        event.getRegistry().register(OreSmeltingRecipe.SERIALIZER.setRegistryName(NetherendingOres.MOD_ID + ":" + "multiple_smelting"));
    }
}
