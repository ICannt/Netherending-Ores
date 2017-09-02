package org.icannt.netherendingores.client.model;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by ICannt on 19/08/17.
 */
@Mod.EventBusSubscriber(Side.CLIENT)
public class ModelRegistry {

	// Does this even have a point?
    @SubscribeEvent
    public void registerAllModels(ModelRegistryEvent event) {

    }
    
}
