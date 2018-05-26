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
	
		Util.LOG.debug("Registering Mekanism Recipes");

		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictCrushOutputName())) {
    			try {
    				MekRecipeData.getEnrichRecipe(blockData.ordinal());
    				Util.logRecipeSuccess("enrichment chamber", blockData.getName(), blockData.getOreDictCrushOutputName());
    			} catch (Exception e1) {
    				Util.logRecipeFail("enrichment chamber", blockData.getName(), blockData.getOreDictCrushOutputName());
    			}
			}
		}

		Util.LOG.info("Registered Mekanism Recipes");
		
	}

}
