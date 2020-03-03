package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by ICannt on 05/05/18.
 */

@GameRegistry.ObjectHolder(Info.MOD_ID)
public class RegistryEvents {

	IForgeRegistry<SoundEvent> registry = null;
	
	// This bit is actually loaded by init in CommonProxy
	public static void registerRecipes() {
		
		// Register Netherending Ores own recipes, only proceed if at least one recipe type is enabled
		if (Config.vanillaCraftingRecipes || Config.vanillaFurnaceRecipes) {
			RecipeRegistry.registerRecipes();
		}

	}
	
	@ObjectHolder("entity.netherfish.ambient")
	public static final SoundEvent ENTITY_NETHERFISH_AMBIENT = createEvent("entity.netherfish.ambient");
	
	@ObjectHolder("entity.netherfish.death")
	public static final SoundEvent ENTITY_NETHERFISH_DEATH = createEvent("entity.netherfish.death");
	
	@ObjectHolder("entity.netherfish.hurt")
	public static final SoundEvent ENTITY_NETHERFISH_HURT = createEvent("entity.netherfish.hurt");
		
	private static SoundEvent createEvent(String sound) {
		final ResourceLocation id = new ResourceLocation(Info.MOD_ID, sound);
		return new SoundEvent(id).setRegistryName(id);
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerSoundEvents(RegistryEvent.Register<SoundEvent> event) {
			
			event.getRegistry().registerAll(
					ENTITY_NETHERFISH_AMBIENT,
					ENTITY_NETHERFISH_DEATH,
					ENTITY_NETHERFISH_HURT
			);
			
		}
	}
	
}
