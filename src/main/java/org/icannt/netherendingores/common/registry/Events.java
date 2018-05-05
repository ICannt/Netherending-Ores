package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.integration.common.registry.MekRecipeRegistry;
import org.icannt.netherendingores.integration.common.registry.TERecipeRegistry;
import org.icannt.netherendingores.integration.common.registry.TiCRecipeRegistry;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

/**
 * Created by ICannt on 05/05/18.
 */

@GameRegistry.ObjectHolder(NetherendingOres.MOD_ID)
public class Events {
    		
	@Mod.EventBusSubscriber
	public static class RegistryEvents {
		
		@SubscribeEvent
	    public static void RegisterVillagerProfession(final RegistryEvent.Register<VillagerProfession> event)
	    {
			if (Loader.isModLoaded("mekanism")) {
				MekRecipeRegistry.registerRecipes();
			}
	    }
		
		@SubscribeEvent
	    public static void RegisterIRecipe(final RegistryEvent.Register<IRecipe> event)
	    {
			RecipeRegistry.registerRecipes();
			if (Loader.isModLoaded("tconstruct")) {
				TiCRecipeRegistry.registerRecipes();
			}
			if (Loader.isModLoaded("thermalexpansion")) {
				TERecipeRegistry.registerRecipes();
			}
	    }
	
	}
}
