package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.common.registry.RecipeHelper;
import org.icannt.netherendingores.lib.Log;

import cofh.api.util.ThermalExpansionHelper;

/**
 * Created by ICannt on 05/04/18.
 */
public class TERecipeRegistry {
	
	/**
	 * Remove Thermal Expansion recipes that are automatically added by the mod.
	 * Redoing them allows things like energy values and amounts to be corrected.
	 */
	public static void removeRecipes() {
		
		Log.debug("Removing Automatic Thermal Expansion Recipes");
		
		// Remove the existing recipes first that are added automatically.
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (blockData.getRecipeMultiplier() > 1) {
				ThermalExpansionHelper.removeFurnaceRecipe(blockData.getModBlockItemStack());
				ThermalExpansionHelper.removePulverizerRecipe(blockData.getModBlockItemStack());
			}
		}
		
		Log.info("Removed Automatic Thermal Expansion Recipes");
		
	}
	
	/**
	 * Register Thermal Expansion Recipes
	 */
	public static void registerRecipes() {

		Log.debug("Registering Thermal Expansion Recipes");
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (blockData.getRecipeMultiplier() > 1) {
				RecipeHelper.tryRecipe(blockData, "pulv", true);
				RecipeHelper.tryRecipe(blockData, "pulv", false);
			}
		}
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (blockData.getRecipeMultiplier() > 1) {
    			RecipeHelper.tryRecipe(blockData, "redfurn", true);
    			RecipeHelper.tryRecipe(blockData, "redfurn", false);
			}
		}

		Log.info("Registered Thermal Expansion Recipes");

	}	
}
