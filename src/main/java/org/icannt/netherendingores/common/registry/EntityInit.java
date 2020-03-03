package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.entity.EntityNetherfish;
import org.icannt.netherendingores.common.entity.EntityPrimedOre;
import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * Created by ICannt on 09/02/18.
 */
public class EntityInit {

	public static void registerEntities() {
		if (Config.netherfish) registerEntity("netherfish", EntityNetherfish.class, Config.NETHERFISH_ENTITY_ID, Config.NETHERFISH_TRACKING_RANGE, Config.NETHERFISH_SPAWN_EGG_PRIMARY_COLOR, Config.NETHERFISH_SPAWN_EGG_SECONDARY_COLOR);
		registerEntity("primedOre", EntityPrimedOre.class, Config.PRIMED_ORE_ENTITY_ID, 0);
	}
	
	private static void registerEntity(String entityName, Class<? extends Entity> entityClass, int id, int trackingRange) {
		EntityRegistry.registerModEntity(new ResourceLocation(Info.MOD_ID + ":" + entityName), entityClass, entityName, id, NetherendingOres.instance, trackingRange, 1, true);
	}
	
	private static void registerEntity(String entityName, Class<? extends Entity> entityClass, int id, int trackingRange, int colorP, int colorS) {
		EntityRegistry.registerModEntity(new ResourceLocation(Info.MOD_ID + ":" + entityName), entityClass, entityName, id, NetherendingOres.instance, trackingRange, 1, true, colorP, colorS);
	}
}
