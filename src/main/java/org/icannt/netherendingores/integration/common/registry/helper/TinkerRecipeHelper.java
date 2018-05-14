package org.icannt.netherendingores.integration.common.registry.helper;

import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Util;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by ICannt on 15/05/18.
 */

public class TinkerRecipeHelper {
	
	private static TinkerRecipeMethods helper = null;
	
	/**
	 * Get the instance of the recipe helper to directly add recipes.
	 *
	 * Do NOT copy/repackage this method into your package, nor use the class directly as it may change.
	 * 
	 * Code credit: Modified from Mekanism source code (MIT License, © 2017 Aidan Brady)
	 *
	 * @return {@link TinkerRecipeMethods} The handler.
	 */
	public static TinkerRecipeMethods recipeHelper() {
		if (helper == null){
			try {
				helper = (TinkerRecipeMethods)Class.forName(Info.TINKER_RECIPE_CLASS).newInstance();
			} catch (ClassNotFoundException|InstantiationException|IllegalAccessException e) {
				Util.LOG.info("Could not find Tinkers' Construct API Handler", e);
			}
		}
		return helper;
	}
	
	public static void registerMelting(ItemStack stack, Fluid fluid, int amount) {
		recipeHelper().registerMelting(stack, fluid, amount);
	}

}
