package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.integration.common.registry.data.TiCRecipeData;
import org.icannt.netherendingores.lib.Util;

import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by ICannt on 02/04/18.
 */
public class TiCRecipeRegistry {
		
	public static void registerRecipes() {

		Util.LOG.info("Registering Tinkers' Construct Recipes");
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			// Add smelt recipe if: The recipe is enabled, if the recipe multiplier is greater than 1 and if the target fluid exists.
			if (TiCRecipeData.getSmeltRecipeAdd(blockData.ordinal(), blockData.getRecipeMultiplier()) == true && blockData.getRecipeMultiplier() > 1 &&
					FluidRegistry.isFluidRegistered(blockData.getRawOreName())) {
				try {
					TiCRecipeData.getSmeltRecipe(blockData.ordinal());
				} catch (Exception e1) {
					Util.LOG.warn("Unable to register smeltery output for \"" + blockData.getName() + "\".");
				}
			}
		}
		
		Util.LOG.info("Registered Tinkers' Construct Recipes");	
		
	}
}
