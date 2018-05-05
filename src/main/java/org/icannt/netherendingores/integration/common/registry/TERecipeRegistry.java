package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.integration.common.registry.data.TERecipeData;
import org.icannt.netherendingores.lib.Util;

import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 05/04/18.
 */
public class TERecipeRegistry {

	public static void registerRecipes() {

		Util.LOG.info("Registering Thermal Expansion Recipes");
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictPulvItem()) == true && blockData.getRecipeMultiplier() > 1) {
    			try {
    				TERecipeData.getPulvRecipe(blockData.ordinal());
    			} catch (Exception e1) {
    				Util.LOG.warn("Unable to register pulverizer item output for \"" + blockData.getName() + "\" item \"" + blockData.getOreDictPulvItem() + "\" not found.");
    			}
    			try {
    				TERecipeData.getRedFurnRecipe(blockData.ordinal());
    			} catch (Exception e1) {
    				Util.LOG.warn("Unable to register redstone furnace item output for \"" + blockData.getName() + "\" item \"" + blockData.getOreDictFurnaceItem() + "\" not found.");
    			}
			}
		}

		Util.LOG.info("Registered Thermal Expansion Recipes");

	}	
}
