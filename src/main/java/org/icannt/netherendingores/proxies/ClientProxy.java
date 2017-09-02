package org.icannt.netherendingores.proxies;

import org.icannt.netherendingores.common.registry.BlockRegistry;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by ICannt on 17/08/17.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
    	System.out.println("~~~ Client preInit");
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
    	System.out.println("~~~ Client init");
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
    	System.out.println("~~~ Client postInit");
        super.postInit(event);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    	System.out.println("~~~ Before initModels");
        BlockRegistry.initModels();    	
    }
    
}