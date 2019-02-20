package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.integration.common.data.IC2RecipeData;
import org.icannt.netherendingores.integration.common.data.MekRecipeData;
import org.icannt.netherendingores.integration.common.data.TEIndSmeltRecipeData;
import org.icannt.netherendingores.integration.common.data.TERecipeData;
import org.icannt.netherendingores.integration.common.data.TiCRecipeData;

/**
 * Created by ICannt on 20/02/18.
 */

public class RecipeIntegrationHelper {

	/**
	 * Target recipe has been identified, attempt to add the recipe using mod specific recipe handlers.
	 * 
	 * @param       blockData Instance of BlockRecipeData, tracks where the index of a loop is, keeps things in context
	 * @param       device Which machine recipe is to be used e.g. Macerator, Pulverizer
	 * @param       material Recipe material that is being dealt with e.g. iron
	 */
	public static void addIntegrationRecipe(BlockRecipeData blockData, String device, String material) {
		switch (device) {
			case "smeltery": TiCRecipeData.addSmeltRecipe(blockData); break;
			case "pulv": TERecipeData.addPulvRecipe(blockData, material); break;
			case "redfurn": TERecipeData.addRedFurnRecipe(blockData, material); break;
			case "indsmeltsand": TEIndSmeltRecipeData.addIndSmeltSandRecipe(blockData, material); break;
			case "indsmeltrichslag": TEIndSmeltRecipeData.addIndSmeltRichSlagRecipe(blockData, material); break;
			case "enrich": MekRecipeData.addEnrichRecipe(blockData, material); break;
			case "mace": IC2RecipeData.addMaceRecipe(blockData, material);
		}
	}
	
}
