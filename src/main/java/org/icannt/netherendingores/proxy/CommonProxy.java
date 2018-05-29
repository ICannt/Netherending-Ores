package org.icannt.netherendingores.proxy;

import java.io.File;

import org.icannt.netherendingores.common.registry.RegistryEvents;
import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Log;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ICannt on 17/08/17.
 */
@Mod.EventBusSubscriber
public abstract class CommonProxy {

	public static Configuration config;
	
    public void preInit(FMLPreInitializationEvent event) {
    	Log.checkEnumLengths();    	
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "Netherending Ores.cfg"), Info.CFG_VERSION);
        Config.readConfig();
    }

    public void init(FMLInitializationEvent event) {
    	RegistryEvents.registerRecipes();
    }

    public void postInit(FMLPostInitializationEvent event) {
        if (config.hasChanged()) {
            config.save();
        }
    }

}