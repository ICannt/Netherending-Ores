package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.common.registry.RecipeHelper;
import org.icannt.netherendingores.integration.common.data.TiCRecipeData;
import org.icannt.netherendingores.lib.Log;

import cofh.api.util.ThermalExpansionHelper;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by ICannt on 20/02/18.
 */

public class RecipeIntegrationRegistry {

	/**
	 * Remove Thermal Expansion recipes that are automatically added by the mod.
	 * Redoing them allows things like energy values and amounts to be corrected.
	 */
	public static void removeTERecipes() {
		
		Log.debug("Removing Automatic Thermal Expansion Recipes");
		
		// Remove the existing recipes first that are added automatically.
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (blockData.getRecipeMultiplier() > 1) {
				ThermalExpansionHelper.removeFurnaceRecipe(blockData.getModBlockItemStack());
				ThermalExpansionHelper.removePulverizerRecipe(blockData.getModBlockItemStack());
			}
		}
		
		Log.info("Removed Automatic Thermal Expansion Recipes");
		
	}

	/**
	 * Register Tinkers' Construct recipes
	 */
	public static void registerTiCRecipes() {
	
		Log.debug("Registering Tinkers' Construct Recipes");
	
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			// Add smelt recipe if: The recipe millibuckets is greater than 0 and if the target fluid exists.
			if (TiCRecipeData.getMilliBuckets(blockData) > 0 && FluidRegistry.isFluidRegistered(blockData.getRawOreName())) {
				RecipeHelper.tryRecipe(blockData, "smeltery", false);
			}
		}
		
		Log.info("Registered Tinkers' Construct Recipes");	
		
	}
	
	/**
	 * Register a common recipe, most recipes initiate activation in a similar manner.
	 * A recipe multiplier of 1 is assumed as it is the most common, it is then processed in the next function.
	 * @param       device Which machine recipe is to be used e.g. Macerator, Pulverizer
	 */
	private static void registerCommonRecipe(String device) {
		registerCommonRecipe(device, 1);
	}
	
	/**
	 * Register a common recipe, most recipes initiate activation in a similar manner.
	 * @param       device Which machine recipe is to be used e.g. Macerator, Pulverizer
     * @param       multiplier The Recipe Multiplier
	 */
	private static void registerCommonRecipe(String device, int multiplier) {
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			if (blockData.getRecipeMultiplier() > multiplier) {
				RecipeHelper.tryRecipe(blockData, device, true);
				RecipeHelper.tryRecipe(blockData, device, false);
			}
		}
	}
	
	/**
	 * Register Immersive Engineering Recipes
	 */
	public static void registerIERecipes() {
		
		Log.debug("Registering Immersive Engineering Recipes");
		
		registerCommonRecipe("crusher");
		registerCommonRecipe("arcfurn");
	
		Log.info("Registered Immersive Engineering Recipes");
		
	}
	
	/**
	 * Register Thermal Expansion Recipes
	 */
	public static void registerTERecipes() {
	
		Log.debug("Registering Thermal Expansion Recipes");
		
		registerCommonRecipe("pulv");
		registerCommonRecipe("redfurn");
		registerCommonRecipe("indsmeltsand");
		registerCommonRecipe("indsmeltrichslag");
	
		Log.info("Registered Thermal Expansion Recipes");
	
	}

	/**
	 * Register Mekanism Recipes
	 */
	public static void registerMekRecipes() {
	
		Log.debug("Registering Mekanism Recipes");
	
		registerCommonRecipe("enrich", 0);
	
		Log.info("Registered Mekanism Recipes");
		
	}

	/**
	 * Register Industrial Craft 2 Recipes
	 */
	public static void registerIC2Recipes() {
	
		Log.debug("Registering Industrial Craft 2 Recipes");
				
		registerCommonRecipe("mace");
		
		Log.info("Registered Industrial Craft 2 Recipes");
	
	}

}
