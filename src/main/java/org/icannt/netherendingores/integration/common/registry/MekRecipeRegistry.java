package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.common.registry.RecipeHelper;
import org.icannt.netherendingores.lib.Util;

import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 20/04/18.
 */
public class MekRecipeRegistry {

	/**
	 * Register Mekanism Recipes
	 */
	public static void registerRecipes() {
	
		Util.LOG.debug("Registering Mekanism Recipes");

		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictCrushOutputName())) {
				RecipeHelper.doRecipe(blockData, "enrich", true);
				RecipeHelper.doRecipe(blockData, "enrich", false);
			}
		}

		Util.LOG.info("Registered Mekanism Recipes");
		
	}
	
}
