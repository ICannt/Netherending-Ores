package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.NetherendingOres;

/**
 * Created by ICannt on 02/04/18.
 */
public class TiCRecipeRegistry {
		
	public static void registerRecipes() {

		NetherendingOres.LOGGER.info("Registering Tinkers' Construct Recipes");
		
		//TinkerRegistry.registerMelting(new ItemStack(BlockRegistry.ORE_NETHER_VANILLA, 1, 4), TinkerFluids.iron, 576);
		
		NetherendingOres.LOGGER.info("Registered Tinkers' Construct Recipes");
		
	}
}
