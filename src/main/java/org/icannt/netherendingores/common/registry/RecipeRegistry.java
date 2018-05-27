package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Util;

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

		Util.LOG.debug("Registering Recipes");

		for (BlockRecipeData blockData : BlockRecipeData.values()) {
        	if (blockData.getRecipeMultiplier() == 1 && Config.vanillaCraftingRecipes) {
        		RecipeHelper.doRecipe(blockData, "craft", new String[] { blockData.getName() }, false);
        		RecipeHelper.doRecipe(blockData, "craft", blockData.getItemAltOreDictSuffix(), true);
        	}
		}
		
        for (BlockRecipeData blockData : BlockRecipeData.values()) {
        	if (Config.vanillaFurnaceRecipes && (blockData.isFurnaceItemEnabled() || blockData.getRecipeMultiplier() > 1)) {      	
    			RecipeHelper.doRecipe(blockData, "furnace", new String[] { blockData.getName() }, false);
    			RecipeHelper.doRecipe(blockData, "furnace", blockData.getItemAltOreDictSuffix(), true);
        	}
		}
		
		Util.LOG.info("Registered Recipes");
		
	}
	
	/**
	 * 
	 * @param blockData
	 * @param material
	 */
	public static void addCraftingRecipe(BlockRecipeData blockData, String material) {
		ResourceLocation groupName = new ResourceLocation(Info.MOD_ID + ":ore_conversions");
		GameRegistry.addShapelessRecipe(blockData.getConversionResourceLocation(), groupName, blockData.getOtherModBlockItemStack(), blockData.getConversionIngredient());   
	}
	
	/**
	 * 
	 * @param blockData
	 * @param material
	 */
	public static void addFurnaceRecipe(BlockRecipeData blockData, String material) {
		int experience = blockData.getRecipeMultiplier() > 1 ? 0 : -1;
		FurnaceRecipes.instance().addSmeltingRecipe(blockData.getModBlockItemStack(), blockData.getOreDictSmeltItemStack(blockData.getFurnaceAmount()), experience);
	}
	
}
