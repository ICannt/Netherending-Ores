package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeDataRegistry;
import org.icannt.netherendingores.integration.common.recipedata.PulvRecipe;
import org.icannt.netherendingores.lib.Util;

import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 05/04/18.
 */
public class CoFHRecipeRegistry {

	public static void registerRecipes() {

		Util.LOG.info("Registering CoFH Recipes");
		
		for (BlockRecipeDataRegistry blockData : BlockRecipeDataRegistry.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictPulvItem()) == true && blockData.getRecipeMultiplier() > 1) {
				PulvRecipe.getPulvRecipe(blockData.ordinal());
			}
		}

		Util.LOG.info("Registered CoFH Recipes");

	}	
}
