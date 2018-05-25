package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.integration.common.registry.data.IC2RecipeData;
import org.icannt.netherendingores.lib.Util;

import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 15/05/18.
 */

public class IC2RecipeRegistry {
	
	private static String[] LOGMSG = { "" , "" , "" };
	
	public static void registerRecipes() {

		Util.LOG.debug("Registering Industrial Craft 2 Recipes");
				
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (OreDictionary.doesOreNameExist(blockData.getOreDictCrushOutputName()) && blockData.getRecipeMultiplier() > 1) {
				doMaceRecipe(blockData, blockData.getItemAltOreDictSuffix(), true);
				doMaceRecipe(blockData, new String[] { blockData.getName() }, false);
			}
    		if (OreDictionary.doesOreNameExist(blockData.getOreDictSmeltOutputName()) && blockData.getRecipeMultiplier() > 1) {
				doElecFurnRecipe(blockData, blockData.getItemAltOreDictSuffix(), true);
				doElecFurnRecipe(blockData, new String[] { blockData.getName() }, false);
			}
		}
		
		Util.LOG.info("Registered Industrial Craft 2 Recipes");

	}
	
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
	
	private static void doElecFurnRecipe(BlockRecipeData blockData, String[] materials, Boolean doAltReplace) {
		for (String material : materials) {
			if (doAltReplace) material = BlockRecipeData.getAltMaterialName(blockData.ordinal(), blockData.getName(), material);
			try {
				IC2RecipeData.getElecFurnRecipe(blockData.ordinal(), material);
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
