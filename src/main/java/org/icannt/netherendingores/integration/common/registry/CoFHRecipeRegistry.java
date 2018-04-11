package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.registry.BlockRecipeDataRegistry;

import cofh.thermalexpansion.util.managers.machine.PulverizerManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 05/04/18.
 */
public class CoFHRecipeRegistry {

	public static void registerRecipes() {

		NetherendingOres.LOGGER.info("Registering CoFH Recipes");
		
		int energy = 3200;
		int secondaryChance = 15;
		
		for (BlockRecipeDataRegistry blockData : BlockRecipeDataRegistry.values()) {
			for (ItemStack stack : OreDictionary.getOres(blockData.getOreDictName(1)))
	        {
				NetherendingOres.LOGGER.info(blockData.getItemOreDict());
				if (OreDictionary.doesOreNameExist(blockData.getItemOreDict()) == true) {
					if (blockData.getRecipeMultiplier() == 2) {
						PulverizerManager.addRecipe(energy, blockData.getItemStack(), new ItemStack(OreDictionary.getOres(blockData.getItemOreDict(), false).get(0).getItem(), 4), new ItemStack(Blocks.NETHERRACK, 1), secondaryChance);
					}
				}
	        }
		}

		NetherendingOres.LOGGER.info("Registered CoFH Recipes");

	}	
}
