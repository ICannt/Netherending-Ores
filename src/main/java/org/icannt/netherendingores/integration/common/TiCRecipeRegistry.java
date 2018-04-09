package org.icannt.netherendingores.integration.common;

import org.icannt.netherendingores.NetherendingOres;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ICannt on 20/08/17.
 */

@GameRegistry.ObjectHolder(NetherendingOres.MOD_ID)
public class TiCRecipeRegistry {
		
	public static void registerRecipes() {

		NetherendingOres.LOGGER.info("Registering Tinkers' Construct Recipes");
		
		//TinkerRegistry.registerMelting(new ItemStack(BlockRegistry.ORE_NETHER_VANILLA, 1, 4), TinkerFluids.iron, 576);
		
		NetherendingOres.LOGGER.info("Registered Tinkers' Construct Recipes");
		
	}
}
