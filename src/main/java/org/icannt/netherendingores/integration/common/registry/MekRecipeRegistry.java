package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.common.registry.RecipeHelper;
import org.icannt.netherendingores.lib.Log;

/**
 * Created by ICannt on 20/04/18.
 */
public class MekRecipeRegistry {

	/**
	 * Register Mekanism Recipes
	 */
	public static void registerRecipes() {
	
		Log.debug("Registering Mekanism Recipes");

		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			RecipeHelper.tryRecipe(blockData, "enrich", true);
			RecipeHelper.tryRecipe(blockData, "enrich", false);
		}

		Log.info("Registered Mekanism Recipes");
		
	}
	
}
