package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.common.registry.RecipeHelper;
import org.icannt.netherendingores.lib.Util;

import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 15/05/18.
 */

public class IC2RecipeRegistry {
	
	/**
	 * Register Industrial Craft 2 Recipes
	 */
	public static void registerRecipes() {

		Util.LOG.debug("Registering Industrial Craft 2 Recipes");
				
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictCrushOutputName()) && blockData.getRecipeMultiplier() > 1) {
				RecipeHelper.doRecipe(blockData, "mace", true);
				RecipeHelper.doRecipe(blockData, "mace", false);
			}
		}
		
		// TODO: Not needed will see if code can be reused
		
//		for (BlockRecipeData blockData : BlockRecipeData.values()) {
//    		if (OreDictionary.doesOreNameExist(blockData.getOreDictSmeltOutputName()) && blockData.getRecipeMultiplier() > 1) {
//    			RecipeHelper.doRecipe(blockData, "elecfurn", true);
//    			RecipeHelper.doRecipe(blockData, "elecfurn", false);
//			}
//		}
		
		Util.LOG.info("Registered Industrial Craft 2 Recipes");

	}
	
}
