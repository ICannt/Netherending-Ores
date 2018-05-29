package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Log;

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

		Log.debug("Registering Recipes");

		for (BlockRecipeData blockData : BlockRecipeData.values()) {
        	if (blockData.getRecipeMultiplier() == 1 && Config.vanillaCraftingRecipes) {
        		RecipeHelper.tryRecipe(blockData, "craft", false);
        		RecipeHelper.tryRecipe(blockData, "craft", true);
        	}
		}
		
        for (BlockRecipeData blockData : BlockRecipeData.values()) {
        	if (Config.vanillaFurnaceRecipes && (blockData.isFurnaceItemEnabled() || blockData.getRecipeMultiplier() > 1)) {      	
    			RecipeHelper.tryRecipe(blockData, "furnace", false);
    			// TODO: Need to work around FML errors just disable it for now
    			//RecipeHelper.doRecipe(blockData, "furnace", true);
        	}
		}
		
		Log.info("Registered Recipes");
		
	}
	
	/**
	 * 
	 * @param blockData
	 * @param material
	 */
	public static void addCraftingRecipe(BlockRecipeData blockData, String material) {
		ResourceLocation groupName = new ResourceLocation(Info.MOD_ID + ":ore_conversions");
		Log.logRecipeMsg("crafting", blockData.getName(), blockData.getOreDictOutputName("", material));
		GameRegistry.addShapelessRecipe(blockData.getConversionResourceLocation(), groupName, blockData.getOtherModBlockItemStack(), blockData.getConversionIngredient());
	}
	
	/**
	 * 
	 * @param blockData
	 * @param material
	 */
	public static void addFurnaceRecipe(BlockRecipeData blockData, String material) {
		int experience = blockData.getRecipeMultiplier() > 1 ? 0 : -1;
		Log.logRecipeMsg("furnace", blockData.getName(), blockData.getOreDictOutputName("smelt", material));
		FurnaceRecipes.instance().addSmeltingRecipe(blockData.getModBlockItemStack(), blockData.getOreDictSmeltItemStack(blockData.getFurnaceAmount()), experience);
	}
	
}
