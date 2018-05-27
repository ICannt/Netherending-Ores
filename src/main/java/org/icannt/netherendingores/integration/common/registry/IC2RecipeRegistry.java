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
				RecipeHelper.doRecipe(blockData, "mace", new String[] { blockData.getName() }, false);
				RecipeHelper.doRecipe(blockData, "mace", blockData.getItemAltOreDictSuffix(), true);
			}
		}
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
    		if (OreDictionary.doesOreNameExist(blockData.getOreDictSmeltOutputName()) && blockData.getRecipeMultiplier() > 1) {
    			RecipeHelper.doRecipe(blockData, "elecfurn", new String[] { blockData.getName() }, false);
    			RecipeHelper.doRecipe(blockData, "elecfurn", blockData.getItemAltOreDictSuffix(), true);
			}
		}
		
		Util.LOG.info("Registered Industrial Craft 2 Recipes");

	}
	
}
