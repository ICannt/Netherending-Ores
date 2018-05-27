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
	
	public static void registerRecipes() {

		Util.LOG.debug("Registering Thermal Expansion Recipes");
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictCrushOutputName()) && blockData.getRecipeMultiplier() > 1) {
				RecipeHelper.doRecipe(blockData, "pulv", new String[] { blockData.getName() }, false);
				RecipeHelper.doRecipe(blockData, "pulv", blockData.getItemAltOreDictSuffix(), true);
			}
		}
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictSmeltOutputName()) && blockData.getRecipeMultiplier() > 1) {
    			RecipeHelper.doRecipe(blockData, "redfurn", new String[] { blockData.getName() }, false);
    			RecipeHelper.doRecipe(blockData, "redfurn", blockData.getItemAltOreDictSuffix(), true);
			}
		}

		Util.LOG.info("Registered Thermal Expansion Recipes");

	}	
}
