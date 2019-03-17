package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ICannt on 20/02/18.
 */

@GameRegistry.ObjectHolder(Info.MOD_ID)
public class RegistryIntegrationEvents {
	
	@Mod.EventBusSubscriber
	public static class Events {
				
		@SubscribeEvent
	    public static void registerIRecipe(final RegistryEvent.Register<IRecipe> event)
	    {
			if (Loader.isModLoaded("thermalexpansion") && Config.thermalExpansionRecipes) {
				RecipeIntegrationRegistry.removeTERecipes();
			}
	    }
	
	}
	
	// This bit is actually loaded by init in CommonProxy
	public static void registerIntegrationRecipes() {
		
		// Register Tinkers' Construct recipes
		if (Loader.isModLoaded("tconstruct") && Config.tinkersConstructRecipes) {
			RecipeIntegrationRegistry.registerTiCRecipes();
		}

		// Register Immersive Engineering recipes
		if (Loader.isModLoaded("immersiveengineering") && Config.immersiveEngineeringRecipes) {
			RecipeIntegrationRegistry.registerIERecipes();
		}
		
		// Register Thermal Expansion recipes
		if (Loader.isModLoaded("thermalexpansion") && Config.thermalExpansionRecipes) {
			RecipeIntegrationRegistry.registerTERecipes();
		}
		
		// Register Mekanism recipes
		if (Loader.isModLoaded("mekanism") && Config.mekanismRecipes) {
			RecipeIntegrationRegistry.registerMekRecipes();
		}
		
		// Register Industrial Craft 2 recipes
		if (Loader.isModLoaded("ic2") && Config.industrialCraft2Recipes) {
			RecipeIntegrationRegistry.registerIC2Recipes();
		}

	}

}
