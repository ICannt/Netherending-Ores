package org.icannt.netherendingores.proxies;

import net.minecraftforge.fml.common.Mod;
import org.icannt.netherendingores.common.registry.FurnaceRecipes;
import org.icannt.netherendingores.common.registry.OreDictionaryRegistry;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ICannt on 17/08/17.
 */
@Mod.EventBusSubscriber
public abstract class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init(FMLInitializationEvent event) {
    	FurnaceRecipes.registerFurnaceRecipes();
    }

    public void postInit(FMLPostInitializationEvent event) {
        OreDictionaryRegistry.registerDictionaryOres();
    }


}