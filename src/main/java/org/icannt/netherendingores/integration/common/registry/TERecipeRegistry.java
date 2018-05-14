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
    				Util.LOG.trace("Registered pulverizer input for \"" + blockData.getName() + "\", output \"" + blockData.getOreDictCrushItemName() + "\".");
    			} catch (Exception e1) {
    				Util.LOG.info("Unable to register pulverizer output for \"" + blockData.getName() + "\", item \"" + blockData.getOreDictCrushItemName() + "\" not found.");
    			}
    			try {
    				TERecipeData.getRedFurnRecipe(blockData.ordinal());
    				Util.LOG.trace("Registered redstone furnace input for \"" + blockData.getName() + "\", output \"" + blockData.getOreDictSmeltItemName() + "\".");
    			} catch (Exception e1) {
    				Util.LOG.info("Unable to register redstone furnace output for \"" + blockData.getName() + "\", item \"" + blockData.getOreDictSmeltItemName() + "\" not found.");
    			}
			}
		}

		Util.LOG.info("Registered Thermal Expansion Recipes");

	}	
}
