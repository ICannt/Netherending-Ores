package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.common.registry.RecipeHelper;
import org.icannt.netherendingores.lib.Log;

/**
 * Created by ICannt on 15/05/18.
 */

public class IC2RecipeRegistry {
	
	/**
	 * Register Industrial Craft 2 Recipes
	 */
	public static void registerRecipes() {

		Log.debug("Registering Industrial Craft 2 Recipes");
				
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (blockData.getRecipeMultiplier() > 1) {
				RecipeHelper.tryRecipe(blockData, "mace", true);
				RecipeHelper.tryRecipe(blockData, "mace", false);
			}
		}
		
		Log.info("Registered Industrial Craft 2 Recipes");

	}
	
}
