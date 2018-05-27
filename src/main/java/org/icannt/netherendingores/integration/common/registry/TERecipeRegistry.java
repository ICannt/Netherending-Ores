package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.common.registry.RecipeHelper;
import org.icannt.netherendingores.lib.Util;

import cofh.api.util.ThermalExpansionHelper;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 05/04/18.
 */
public class TERecipeRegistry {
	
	/**
	 * Remove Thermal Expansion recipes that are automatically added by the mod.
	 * Redoing them allows things like energy values and amounts to be corrected.
	 */
	public static void removeRecipes() {
		
		Util.LOG.debug("Removing Automatic Thermal Expansion Recipes");
		
		// Remove the existing recipes first that are added automatically.
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (blockData.getRecipeMultiplier() > 1) {
				ThermalExpansionHelper.removeFurnaceRecipe(blockData.getModBlockItemStack());
				ThermalExpansionHelper.removePulverizerRecipe(blockData.getModBlockItemStack());
			}
		}
		
		Util.LOG.info("Removed Automatic Thermal Expansion Recipes");
		
	}
	
	/**
	 * Register Thermal Expansion Recipes
	 */
	public static void registerRecipes() {

		Util.LOG.debug("Registering Thermal Expansion Recipes");
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictCrushOutputName()) && blockData.getRecipeMultiplier() > 1) {
				RecipeHelper.doRecipe(blockData, "pulv", true);
				RecipeHelper.doRecipe(blockData, "pulv", false);
			}
		}
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictSmeltOutputName()) && blockData.getRecipeMultiplier() > 1) {
    			RecipeHelper.doRecipe(blockData, "redfurn", true);
    			RecipeHelper.doRecipe(blockData, "redfurn", false);
			}
		}

		Util.LOG.info("Registered Thermal Expansion Recipes");

	}	
}
