package org.icannt.netherendingores.integration;

import org.icannt.netherendingores.common.registry.BlockData;
import org.icannt.netherendingores.integration.common.registry.RecipeIntegrationHelper;
import org.icannt.netherendingores.integration.common.registry.RegistryIntegrationEvents;
import org.icannt.netherendingores.proxy.IntegrationProxy;

public class IntegrationLoader extends IntegrationProxy {
	
	@Override
	public void registerIntegrationRecipes() {
		RegistryIntegrationEvents.registerIntegrationRecipes();
	}
	
	@Override
	public void addIntegrationRecipe(BlockData blockData, String device, String material) {
		RecipeIntegrationHelper.addIntegrationRecipe(blockData, device, material);
	}

}
