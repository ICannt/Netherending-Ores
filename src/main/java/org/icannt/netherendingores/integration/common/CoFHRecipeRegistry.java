package org.icannt.netherendingores.integration.common;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.Util;
import org.icannt.netherendingores.common.registry.BlockRecipeDataRegistry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class CoFHRecipeRegistry {

	public static void registerRecipes() {

		NetherendingOres.LOGGER.info("Registering CoFH Recipes");
		
		int energy = 3200;
		int secondaryChance = 15;
		
		for (BlockRecipeDataRegistry blockData : BlockRecipeDataRegistry.values()) {
			for (ItemStack stack : OreDictionary.getOres(Util.getOreDictName(blockData.getName(), 1)))
	        {
	        	//Util.getOreDictName(variant.getName(), variant.getRecipeMultiplier());
				if (blockData.getRecipeMultiplier() == 2) {
					//PulverizerManager.addRecipe(energy, new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()), OreDictionary.getOres("dustIron", false).get(0), new ItemStack(Blocks.NETHERRACK, 1), secondaryChance);
				}
	        }
		}
		
		NetherendingOres.LOGGER.info("Registered CoFH Recipes");
		
	}	
}
