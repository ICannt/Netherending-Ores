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
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (blockData.getRecipeMultiplier() > 1) {
				ThermalExpansionHelper.removeFurnaceRecipe(BlockRecipeData.getModBlockItemStack(blockData.ordinal()));
				ThermalExpansionHelper.removePulverizerRecipe(BlockRecipeData.getModBlockItemStack(blockData.ordinal()));
			}
		}
		
		Util.LOG.info("Removed Automatic Thermal Expansion Recipes");
		
	}
	
	public static void registerRecipes() {

		Util.LOG.debug("Registering Thermal Expansion Recipes");
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictCrushOutputName()) && blockData.getRecipeMultiplier() > 1) {
    			try {
    				TERecipeData.getPulvRecipe(blockData.ordinal());
    				Util.logRecipeSuccess("pulverizer", blockData.getName(), blockData.getOreDictCrushOutputName());
    			} catch (Exception e1) {
    				Util.logRecipeFail("pulverizer", blockData.getName(), blockData.getOreDictCrushOutputName());
    			}
			}
			if (OreDictionary.doesOreNameExist(blockData.getOreDictSmeltOutputName()) && blockData.getRecipeMultiplier() > 1) {
    			try {
    				TERecipeData.getRedFurnRecipe(blockData.ordinal());
    				Util.logRecipeSuccess("redstone furnace", blockData.getName(), blockData.getOreDictSmeltOutputName());
    			} catch (Exception e1) {
    				Util.logRecipeFail("redstone furnace", blockData.getName(), blockData.getOreDictSmeltOutputName());
    			}
			}
		}

		Util.LOG.info("Registered Thermal Expansion Recipes");

	}	
}
