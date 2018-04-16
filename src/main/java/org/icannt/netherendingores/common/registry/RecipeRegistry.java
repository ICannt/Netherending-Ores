package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 20/08/17.
 * 
 * Vanilla recipes go there, mod device recipes have their own classes.
 */

@GameRegistry.ObjectHolder(NetherendingOres.MOD_ID)
public class RecipeRegistry {
		
	public static void registerRecipes() {

		NetherendingOres.LOGGER.info("Registering Recipes");

		ResourceLocation groupName = new ResourceLocation(NetherendingOres.MOD_ID + ":ore_conversions");

		// Loop through all blocks in the mod
		for (BlockRecipeDataRegistry blockData : BlockRecipeDataRegistry.values()) {
			// Loop through all entries for the specified OreDict name 
			for (ItemStack stack : OreDictionary.getOres(blockData.getOreDictName(1)))
			{
				// If the mod of the OreDict comparison item is not Netherending Ores then proceed
				if (!stack.getItem().getRegistryName().getResourceDomain().equals("netherendingores")) {
					// 1x Multiplier is just a crafting table conversion recipe in case the user needs the actual result item for whatever reason.
					// 2x/3x Multipliers are smelted.
		        	if (blockData.getRecipeMultiplier() == 1) {
	        			GameRegistry.addShapelessRecipe(blockData.getConversionResourceLocation(), groupName, stack, blockData.getConversionIngredient());
		        	}
					if (blockData.getRecipeMultiplier() > 1) {
						GameRegistry.addSmelting(blockData.getItemStack(), new ItemStack(stack.getItem(), blockData.getRecipeMultiplier(), stack.getMetadata()), 0);
					}
					// We only need a single match, no point in adding multiple recipes for different OreDict item results, they often can't be selected. 
					break;
				}
	        }
		}
		
		NetherendingOres.LOGGER.info("Registered Recipes");
		
	}
}
