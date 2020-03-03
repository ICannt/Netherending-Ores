package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Log;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ICannt on 20/08/17.
 * 
 * Vanilla recipes go there, mod device recipes have their own classes.
 */

@GameRegistry.ObjectHolder(Info.MOD_ID)
public class RecipeRegistry {
	
	/**
	 * Register Vanilla Recipes
	 */
	public static void registerRecipes() {

		Log.debug("Registering Vanilla Recipes");

		// Makes duplicates, but that should be a feature really, it guarantees that it will find a relevant ore.
		for (BlockRecipeData blockData : BlockRecipeData.values()) {
        	if (Config.vanillaCraftingRecipes && blockData.getRecipeMultiplier() == 1) {
        		RecipeHelper.tryRecipe(blockData, "craft", true);
        		RecipeHelper.tryRecipe(blockData, "craft", false);
        	}
		}
		
        for (BlockRecipeData blockData : BlockRecipeData.values()) {
        	if (Config.vanillaFurnaceRecipes && (blockData.getRecipeMultiplier() > 1 || (blockData.getRecipeMultiplier() == 1 && blockData.getFurnaceRecipeEnabled()))) {
    			RecipeHelper.tryRecipe(blockData, "furnace", true);
    			RecipeHelper.tryRecipe(blockData, "furnace", false);
        	}
		}
		
		Log.info("Registered Vanilla Recipes");
		
	}
	
	/**
	 * 
	 * @param blockData
	 * @param material
	 */
	public static void addCraftingRecipe(BlockRecipeData blockData, String material) {
		ResourceLocation groupName = new ResourceLocation(Info.MOD_ID + ":ore_conversions");
		Log.logRecipeMsg("crafting", blockData.getName(), blockData.getOreDictOutputName("", material));
		GameRegistry.addShapelessRecipe(blockData.getConversionResourceLocation(material), groupName, blockData.getOtherModBlockItemStack(material), blockData.getConversionIngredient());
	}
	
	/**
	 * 
	 * @param blockData
	 * @param material
	 */
	public static void addFurnaceRecipe(BlockRecipeData blockData, String material) {
		int experience = blockData.getRecipeMultiplier() > 1 ? 0 : -1;
		Log.logRecipeMsg("furnace", blockData.getName(), blockData.getOreDictOutputName("smelt", material));
		if (FurnaceRecipes.instance().getSmeltingResult(blockData.getModBlockItemStack()) == ItemStack.EMPTY) {
			FurnaceRecipes.instance().addSmeltingRecipe(blockData.getModBlockItemStack(), blockData.getOreDictSmeltItemStack(blockData.getFurnaceAmount()), experience);
		} else {
			Log.isRecipeAddedAlready = true;
		}
	}
	
}
