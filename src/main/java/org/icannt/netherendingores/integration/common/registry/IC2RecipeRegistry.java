package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.integration.common.registry.data.IC2RecipeData;
import org.icannt.netherendingores.lib.Util;

import ic2.api.recipe.Recipes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 15/05/18.
 */

public class IC2RecipeRegistry {
	
	public static void registerRecipes() {

		Util.LOG.debug("Registering Industrial Craft 2 Recipes");
		
		Recipes.macerator.addRecipe(new IC2RecipeInput(new ItemStack(Blocks.SOUL_SAND)), null, false, new ItemStack(Blocks.SEA_LANTERN));
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictCrushItemName()) == true && blockData.getRecipeMultiplier() > 1) {
    			try {
    				IC2RecipeData.getMaceRecipe(blockData.ordinal());
    				Util.LOG.trace("Registered macerator input for \"" + blockData.getName() + "\", output \"" + blockData.getOreDictCrushOutputName() + "\".");
    			} catch (Exception e1) {
    				Util.LOG.info("Unable to macerator pulverizer output for \"" + blockData.getName() + "\", item \"" + blockData.getOreDictCrushOutputName() + "\" not found.");
    			}
    			try {
    				IC2RecipeData.getElecFurnRecipe(blockData.ordinal());
    				Util.LOG.trace("Registered electric furnace input for \"" + blockData.getName() + "\", output \"" + blockData.getOreDictSmeltOutputName() + "\".");
    			} catch (Exception e1) {
    				Util.LOG.info("Unable to electric furnace output for \"" + blockData.getName() + "\", item \"" + blockData.getOreDictSmeltOutputName() + "\" not found.");
    			}
			}
		}

		Util.LOG.info("Registered Industrial Craft 2 Recipes");

	}	
}
