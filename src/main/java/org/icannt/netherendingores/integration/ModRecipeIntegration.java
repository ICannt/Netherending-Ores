package org.icannt.netherendingores.integration;

/**
 * Created by ICannt on 21/04/18.
 */
import org.icannt.netherendingores.integration.common.registry.CoFHRecipeRegistry;
import org.icannt.netherendingores.integration.common.registry.TiCRecipeRegistry;

import net.minecraftforge.fml.common.Loader;

public class ModRecipeIntegration {

	public static void loadRecipes() {
		if (Loader.isModLoaded("tconstruct")) {
			TiCRecipeRegistry.registerRecipes();
		}
		if (Loader.isModLoaded("thermalexpansion")) {
			CoFHRecipeRegistry.registerRecipes();
		}		
	}
	
}
