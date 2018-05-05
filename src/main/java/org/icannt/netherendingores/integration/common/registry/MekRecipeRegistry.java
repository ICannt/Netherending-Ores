package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.integration.common.registry.data.MekRecipeData;
import org.icannt.netherendingores.lib.Util;

import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 20/04/18.
 */
public class MekRecipeRegistry {

	public static void registerRecipes() {
	
		Util.LOG.info("Registering Mekanism Recipes");

		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictPulvItem()) == true) {
    			try {
    				MekRecipeData.getEnrichRecipe(blockData.ordinal());
    			} catch (Exception e1) {
    				Util.LOG.warn("Unable to register enrichment chamber item output for \"" + blockData.getName() + "\" item \"" + blockData.getOreDictPulvItem() + "\" not found.");
    			}
			}
		}

		Util.LOG.info("Registered Mekanism Recipes");
		
	}

}
