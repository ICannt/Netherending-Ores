package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRegistry;
import org.icannt.netherendingores.lib.Util;

import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.shared.TinkerFluids;

/**
 * Created by ICannt on 02/04/18.
 */
public class TiCRecipeRegistry {
		
	public static void registerRecipes() {

		Util.LOG.info("Registering Tinkers' Construct Recipes");
		
		TinkerRegistry.registerMelting(new ItemStack(BlockRegistry.ORE_END_VANILLA, 1, 4), TinkerFluids.iron, 576);
		
		Util.LOG.info("Registered Tinkers' Construct Recipes");	
		
	}
}
