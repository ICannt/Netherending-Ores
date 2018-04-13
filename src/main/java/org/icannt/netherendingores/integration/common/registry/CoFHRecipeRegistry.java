package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.registry.BlockRecipeDataRegistry;
import org.icannt.netherendingores.integration.common.recipedata.PulvRecipe;

import cofh.thermalexpansion.util.managers.machine.PulverizerManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 05/04/18.
 */
public class CoFHRecipeRegistry {

	public void registerRecipes() {

		NetherendingOres.LOGGER.info("Registering CoFH Recipes");
		
		for (BlockRecipeDataRegistry blockData : BlockRecipeDataRegistry.values()) {
			for (ItemStack stack : OreDictionary.getOres(blockData.getOreDictName(1)))
	        {
				//NetherendingOres.LOGGER.info(blockData.getItemOreDict());
				if (OreDictionary.doesOreNameExist(blockData.getItemOreDict()) == true) {
					if (blockData.getRecipeMultiplier() == 2) {
						//PulvRecipe.getPulvRecipe(blockData.ordinal(), blockData.getRecipeMultiplier());
						PulvRecipe.getPulvRecipe(1);
					}
				}
	        }
		}

		NetherendingOres.LOGGER.info("Registered CoFH Recipes");

	}	
}
