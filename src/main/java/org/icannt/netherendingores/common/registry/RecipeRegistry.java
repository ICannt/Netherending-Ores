package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Config;
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
	
	//
	public static void registerRecipes() {

		Util.LOG.debug("Registering Recipes");

		ResourceLocation groupName = new ResourceLocation(Info.MOD_ID + ":ore_conversions");
		
		// Loop through all blocks in the mod
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			
			// Loop through all entries for the specified OreDict name 
			for (ItemStack stack : OreDictionary.getOres(blockData.getOreDictOtherModBlockName()))
			{
				
				// If the mod of the OreDict comparison item is not Netherending Ores then proceed
				if (!stack.getItem().getRegistryName().getResourceDomain().equals("netherendingores")) {
					
					// 1x Multiplier is crafting table conversion recipe and smelt to item.
					// 2x/3x Multipliers are smelted only.
		        	if (blockData.getRecipeMultiplier() == 1 && Config.vanillaCraftingRecipes) {
	        			GameRegistry.addShapelessRecipe(blockData.getConversionResourceLocation(), groupName, stack, blockData.getConversionIngredient());        			
		        	}
		        	
	        		// Furnace Recipe, only add if the recipe is actually enabled, avoids some oredict issues	
		        	if (Config.vanillaFurnaceRecipes && (blockData.isFurnaceItemEnabled() || blockData.getRecipeMultiplier() > 1)) {      	
            			RecipeHelper.doRecipe(blockData, "furnace", new String[] { blockData.getName() }, false);
            			RecipeHelper.doRecipe(blockData, "furnace", blockData.getItemAltOreDictSuffix(), true);
		        	}
					
					// We only need a single match, no point in adding multiple recipes for different OreDict item results, they often can't be selected. 
					break;
					
				}
	        }
		}
		
		Util.LOG.info("Registered Recipes");
		
	}
	
	//
	public static void addCraftingRecipe(BlockRecipeData blockData, String material) {

	}
	
	//
	public static void addFurnaceRecipe(BlockRecipeData blockData, String material) {
		int experience = blockData.getRecipeMultiplier() > 1 ? 0 : -1;
		FurnaceRecipes.instance().addSmeltingRecipe(blockData.getModBlockItemStack(), blockData.getOreDictSmeltItemStack(blockData.getFurnaceAmount()), experience);
	}

	
}
