package org.icannt.netherendingores.client.proxy;

import org.icannt.netherendingores.common.proxy.CommonProxy;
import org.icannt.netherendingores.common.registry.BlockRegistry;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ICannt on 17/08/17.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        BlockRegistry.initBlockModels();
        //ModelHandler.registerItemModels();
        //ModelHandler.initBlockModels();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @Override
    public boolean isDedicatedServer() {
        return false;
    }
}