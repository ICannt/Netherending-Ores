package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Util;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 20/08/17.
 * 
 * Vanilla recipes go there, mod device recipes have their own classes.
 */

@GameRegistry.ObjectHolder(Info.MOD_ID)
public class RecipeRegistry {
		
	public static void registerRecipes() {

		Util.LOG.debug("Registering Recipes");

		ResourceLocation groupName = new ResourceLocation(Info.MOD_ID + ":ore_conversions");
		
		// Loop through all blocks in the mod
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			
			// Loop through all entries for the specified OreDict name 
			for (ItemStack stack : OreDictionary.getOres(blockData.getOtherModOreDictName()))
			{
				
				// If the mod of the OreDict comparison item is not Netherending Ores then proceed
				if (!stack.getItem().getRegistryName().getResourceDomain().equals("netherendingores")) {
					
					// 1x Multiplier is crafting table conversion recipe and smelt to item.
					// 2x/3x Multipliers are smelted only.
		        	if (blockData.getRecipeMultiplier() == 1) {
		        		
		        		// Conversion Recipe
	        			GameRegistry.addShapelessRecipe(blockData.getConversionResourceLocation(), groupName, stack, blockData.getConversionIngredient());
	        			
	        			// Furnace Recipe, only add if the recipe is actually enabled, avoids some oredict issues
	        			if (blockData.isSmeltItemEnabled() == true) {
		        			try {
		        				// Trying get around issues with the OreDict smelt recipes by skipping over the code that makes it wildcard
		        				FurnaceRecipes.instance().addSmeltingRecipe(blockData.getItemStack(), blockData.getOreDictSmeltItemStack(), -1);
		        				Util.LOG.trace("Registered furnace input for \"" + blockData.getName() + "\", output \"" + blockData.getOreDictSmeltItemName() + "\".");
		        			} catch (Exception e1) {
		        				Util.LOG.info("Unable to register furnace output for \"" + blockData.getName() + "\" item \"" + blockData.getOreDictSmeltItemName() + "\" not found.");
		        			}
	        			}
	        			
		        	}
		        	
					if (blockData.getRecipeMultiplier() > 1) {
						// Do the same thing here, skip over the OreDict'd code
						FurnaceRecipes.instance().addSmeltingRecipe(blockData.getItemStack(), new ItemStack(stack.getItem(), blockData.getRecipeMultiplier(), stack.getMetadata()), 0);
					}
					
					// We only need a single match, no point in adding multiple recipes for different OreDict item results, they often can't be selected. 
					break;
					
				}
	        }
		}
		
		Util.LOG.info("Registered Recipes");
		
	}
}
