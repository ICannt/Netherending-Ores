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
		
		String compare = "";

		for (BlockRecipeDataRegistry blockData : BlockRecipeDataRegistry.values()) {
			compare = blockData.getName();
			// Allow Nether Emerald Ore to be added, seems to be an oversight in TiC code to not add it via the "oreNether" prefix
			if (compare != "nether_emerald_ore") {
				compare = compare.replace("nether_", "");
			}
			// Add smelt recipe if: The block is enabled to smelt, if the recipe multiplier is greater than 1, if the target fluid exists and if it isn't a Nether ore (excepting Emerald).
			if (SmeltRecipe.getSmeltEnabled(blockData.ordinal()) == true && blockData.getRecipeMultiplier() > 1 &&
					FluidRegistry.isFluidRegistered(blockData.getRawOreName()) && compare == blockData.getName()) {
				SmeltRecipe.getSmeltRecipe(blockData.ordinal());
			}
		}
		
		Util.LOG.info("Registered Tinkers' Construct Recipes");	
		
	}
}
