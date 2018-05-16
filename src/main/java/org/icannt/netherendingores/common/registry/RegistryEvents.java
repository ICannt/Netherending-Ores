package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.integration.common.registry.IC2RecipeRegistry;
import org.icannt.netherendingores.integration.common.registry.MekRecipeRegistry;
import org.icannt.netherendingores.integration.common.registry.TERecipeRegistry;
import org.icannt.netherendingores.integration.common.registry.TiCRecipeRegistry;
import org.icannt.netherendingores.lib.Info;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ICannt on 05/05/18.
 */

@GameRegistry.ObjectHolder(Info.MOD_ID)
public class RegistryEvents {
    		
	@Mod.EventBusSubscriber
	public static class Events {
				
		@SubscribeEvent
	    public static void registerIRecipe(final RegistryEvent.Register<IRecipe> event)
	    {
			if (Loader.isModLoaded("thermalexpansion")) {
				TERecipeRegistry.removeRecipes();
			}
	    }
	
	}

	// This bit is actually loaded by init in CommonProxy
	public static void registerRecipes() {
		
		// Register Netherending Ores own recipes
		RecipeRegistry.registerRecipes();
		
		// Register Tinkers' Construct recipes
		if (Loader.isModLoaded("tconstruct")) {
			TiCRecipeRegistry.registerRecipes();
		}

		// Register Thermal Expansion recipes
		if (Loader.isModLoaded("thermalexpansion")) {
			TERecipeRegistry.registerRecipes();
		}
		
		// Register Mekanism recipes
		if (Loader.isModLoaded("mekanism")) {
			MekRecipeRegistry.registerRecipes();
		}
		
		// Register Industrial Craft 2 recipes
		if (Loader.isModLoaded("ic2")) {
			IC2RecipeRegistry.registerRecipes();
		}

	}
	
}
