package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeDataRegistry;
import org.icannt.netherendingores.integration.common.recipedata.SmeltRecipe;
import org.icannt.netherendingores.lib.Util;

import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by ICannt on 02/04/18.
 */
public class TiCRecipeRegistry {
		
	public static void registerRecipes() {

		Util.LOG.info("Registering Tinkers' Construct Recipes");
		
		for (BlockRecipeDataRegistry blockData : BlockRecipeDataRegistry.values()) {
			// Add smelt recipe if: The recipe is enabled, if the recipe multiplier is greater than 1 and if the target fluid exists.
			if (SmeltRecipe.getSmeltRecipeAdd(blockData.ordinal(), blockData.getRecipeMultiplier()) == true && blockData.getRecipeMultiplier() > 1 &&
					FluidRegistry.isFluidRegistered(blockData.getRawOreName())) {
				SmeltRecipe.getSmeltRecipe(blockData.ordinal());
			}
		}
		
		Util.LOG.info("Registered Tinkers' Construct Recipes");	
		
	}
}
