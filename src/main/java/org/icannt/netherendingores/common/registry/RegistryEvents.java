package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ICannt on 05/05/18.
 */

@GameRegistry.ObjectHolder(Info.MOD_ID)
public class RegistryEvents {

	// This bit is actually loaded by init in CommonProxy
	public static void registerRecipes() {
		
		// Register Netherending Ores own recipes, only proceed if at least one recipe type is enabled
		if (Config.vanillaCraftingRecipes || Config.vanillaFurnaceRecipes) {
			RecipeRegistry.registerRecipes();
		}

	}
	
}
