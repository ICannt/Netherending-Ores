package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.integration.common.compat.WailaCompatibility;
import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Log;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInterModComms;
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
		
		// Load WAILA/HWYLA Integration		
        if (Loader.isModLoaded("waila")) {
        	
        	Log.debug("Attempting to load WAILA/HWYLA integration");
        	
            FMLInterModComms.sendMessage("waila", "register", WailaCompatibility.class.getCanonicalName() + ".register");
            
            Log.info("Loaded WAILA/HWYLA Integration");
            
        }
        
        // Load WAWLA Integration
//        if (Loader.isModLoaded("wawla")) {
//        	
//        	Log.debug("Attempting to load WAWLA integration");
//        	
//            WawlaCompatibility.loadCompatility();
//            
//            Log.info("Loaded WAWLA Integration");
//            
//        }

	}

}
