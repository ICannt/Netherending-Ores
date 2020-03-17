package org.icannt.netherendingores.proxy;

import org.icannt.netherendingores.common.registry.BlockData;
import org.icannt.netherendingores.lib.Log;

public class IntegrationProxy {

	public void registerIntegrationRecipes() {
		Log.warn("Integration recipes cannot load, assuming No-API source.");
	}

	public void addIntegrationRecipe(BlockData blockData, String device, String material) {
		Log.warn("Can't add integration recipes, No-API source loaded.");
	}
	
}
