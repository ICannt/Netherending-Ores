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
	
	private static String[] LOGMSG = { "" , "" , "" };
	
	public static void registerRecipes() {

		Util.LOG.debug("Registering Industrial Craft 2 Recipes");
		
		Recipes.macerator.addRecipe(new IC2RecipeInput(new ItemStack(Blocks.SOUL_SAND)), null, false, new ItemStack(Blocks.SEA_LANTERN));
		
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictCrushOutputName()) && blockData.getRecipeMultiplier() > 1) {
				doMaceRecipe(blockData, new String[] { blockData.getName() }, false);
				doMaceRecipe(blockData, blockData.getItemAltOreDictSuffix(), true);
			}
    		if (OreDictionary.doesOreNameExist(blockData.getOreDictSmeltOutputName()) && blockData.getRecipeMultiplier() > 1) {
    			try {
    				IC2RecipeData.getElecFurnRecipe(blockData.ordinal());
    				Util.LogRecipeSuccess("electric furnace", blockData.getName(), blockData.getOreDictSmeltOutputName());
    			} catch (Exception e1) {
    				Util.LogRecipeFail("electric furnace", blockData.getName(), blockData.getOreDictSmeltOutputName());
    			}
			}
		}
		
		Util.LOG.info("Registered Industrial Craft 2 Recipes");

	}
	
//	private static void doMaceRecipe(BlockRecipeData blockData) {
//		try {
//			IC2RecipeData.getMaceRecipe(blockData.ordinal());
//			Util.LogRecipeSuccess("macerator", blockData.getName(), blockData.getOreDictCrushOutputName());
//		} catch (Exception e1) {
//			Util.LogRecipeFail("macerator", blockData.getName(), blockData.getOreDictCrushOutputName());
//		}
//	}
	
	private static void doMaceRecipe(BlockRecipeData blockData, String[] materials, Boolean doAltReplace) {
		for (String material : materials) {
			if (doAltReplace) material = BlockRecipeData.getAltMaterialName(blockData.ordinal(), blockData.getName(), material);
			try {
				IC2RecipeData.getMaceRecipe(blockData.ordinal(), material);
				Util.LogRecipeSuccess(LOGMSG);
			} catch (Exception e1) {
				Util.LogRecipeFail(LOGMSG);
			}
		}
	}
	
	public static void logMsg(String device, String input, String output) {
		LOGMSG[0] = device;
		LOGMSG[1] = input;
		LOGMSG[2] = output;
	}
	
}
