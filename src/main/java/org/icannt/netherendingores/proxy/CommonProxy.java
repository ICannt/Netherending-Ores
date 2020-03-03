package org.icannt.netherendingores.proxy;

import java.io.File;

import org.icannt.netherendingores.common.block.data.CacheBlockRecipeDataOrdinals;
import org.icannt.netherendingores.common.registry.EntityInit;
import org.icannt.netherendingores.common.registry.OreDictionaryRegistry;
import org.icannt.netherendingores.common.registry.RegistryEvents;
import org.icannt.netherendingores.integration.common.registry.RegistryIntegrationEvents;
import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.ConfigEx;
import org.icannt.netherendingores.lib.Info;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ICannt on 17/08/17.
 */

@Mod.EventBusSubscriber
public abstract class CommonProxy {

	public static ConfigEx config;
	
    public void preInit(FMLPreInitializationEvent event) {
    	CacheBlockRecipeDataOrdinals.cacheOrdinals();
        File directory = event.getModConfigurationDirectory();
        config = new ConfigEx(new File(directory.getPath(), "Netherending Ores.cfg"), Info.CFG_VERSION);
        Config.readConfig();
    	EntityInit.registerEntities();
    }

    public void init(FMLInitializationEvent event) {
    	RegistryEvents.registerRecipes();
    	RegistryIntegrationEvents.registerIntegrationRecipes();
    }

    public void postInit(FMLPostInitializationEvent event) {
        if (config.hasChanged()) {
            config.save();
        }
        OreDictionaryRegistry.cacheOreDictionaryItems();
    }

}