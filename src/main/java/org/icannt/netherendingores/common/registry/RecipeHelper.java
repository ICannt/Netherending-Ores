package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.integration.common.registry.data.IC2RecipeData;
import org.icannt.netherendingores.integration.common.registry.data.MekRecipeData;
import org.icannt.netherendingores.integration.common.registry.data.TERecipeData;
import org.icannt.netherendingores.integration.common.registry.data.TiCRecipeData;
import org.icannt.netherendingores.lib.Util;

/**
 * Created by ICannt on 26/05/18.
 */

public class RecipeHelper {
	
	/**
	 * Attempts to add recipes based on input data provided
	 * 
	 * @param       blockData Instance of BlockRecipeData, tracks where the index of a loop is, keeps things in context
	 * @param       device Which device recipe is to be used e.g. Macerator, Pulverizer
	 * @param       materials Array of materials e.g. iron, gold etc
	 * @param       doAltReplace Replace base material names for oredict
	 */
	public static void doRecipe(BlockRecipeData blockData, String device, String[] materials, Boolean doAltReplace) {
		for (String material : materials) {
			if (doAltReplace) material = BlockRecipeData.getAltMaterialName(blockData.ordinal(), blockData.getName(), material);
			try {
				addRecipe(blockData, device, material);
				Util.logRecipeSuccess();
			} catch (Exception e1) {
				Util.logRecipeFail();
			}
		}
	}
	
	/**
	 * Target recipe has been identified, attempt to add the recipe using mod specific recipe handlers.
	 * 
	 * @param       index Points to where we are at in the BlockRecipeData Enum
	 * @param       device Which machine recipe is to be used e.g. Macerator, Pulverizer
	 * @param       material Recipe material that is being dealt with e.g. iron
	 */
	private static void addRecipe(BlockRecipeData blockData, String device, String material) {
		switch (device) {
			case "furnace": RecipeRegistry.addFurnaceRecipe(blockData, material); break;
			case "smeltery": TiCRecipeData.addSmeltRecipe(blockData); break; // Not sure if any known liquids register with alternate spelling.
			case "pulv": TERecipeData.addPulvRecipe(blockData, material); break;
			case "redfurn": TERecipeData.addRedFurnRecipe(blockData, material); break;
			case "enrich": MekRecipeData.addEnrichRecipe(blockData, material); break;
			case "mace": IC2RecipeData.addMaceRecipe(blockData, material); break;
			case "elecfurn": IC2RecipeData.addElecFurnRecipe(blockData, material);
		}
	}
	
}
