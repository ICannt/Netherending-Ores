package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.integration.common.registry.data.TERecipeData;
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
		// TODO: Check to make sure this does not remove in oredict mode?
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			ThermalExpansionHelper.removeFurnaceRecipe(BlockRecipeData.getItemStack(blockData.ordinal()));
			ThermalExpansionHelper.removePulverizerRecipe(BlockRecipeData.getItemStack(blockData.ordinal()));
		}
		
		Util.LOG.info("Removed Automatic Thermal Expansion Recipes");
		
	}
	
	public static void registerRecipes() {

		Util.LOG.debug("Registering Thermal Expansion Recipes");
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictCrushItemName()) == true && blockData.getRecipeMultiplier() > 1) {
    			try {
    				TERecipeData.getPulvRecipe(blockData.ordinal());
    				Util.LogRecipeSuccess("pulverizer", blockData.getName(), blockData.getOreDictCrushOutputName());
    			} catch (Exception e1) {
    				Util.LogRecipeFail("pulverizer", blockData.getName(), blockData.getOreDictCrushOutputName());
    			}
    			try {
    				TERecipeData.getRedFurnRecipe(blockData.ordinal());
    				Util.LogRecipeSuccess("redstone furnace", blockData.getName(), blockData.getOreDictSmeltOutputName());
    			} catch (Exception e1) {
    				Util.LogRecipeFail("redstone furnace", blockData.getName(), blockData.getOreDictSmeltOutputName());
    			}
			}
		}

		Util.LOG.info("Registered Thermal Expansion Recipes");

	}	
}
