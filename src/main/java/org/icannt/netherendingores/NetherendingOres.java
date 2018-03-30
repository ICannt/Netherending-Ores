package org.icannt.netherendingores;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.icannt.netherendingores.proxies.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ICannt on 17/08/17.
 */

@Mod(modid = NetherendingOres.MOD_ID,
	name = NetherendingOres.MOD_NAME,
	version = NetherendingOres.VERSION,
	acceptedMinecraftVersions = "[1.12.2,1.13)",
	dependencies = "required-after:forge@[14.23.2.2611,);")

public class NetherendingOres {

    public static final String MOD_ID = "netherendingores";
    public static final String MOD_NAME = "Netherending Ores";
    public static final String VERSION = "1.12.2-1.2";

    @SidedProxy(clientSide = "org.icannt.netherendingores.proxies.ClientProxy", serverSide = "org.icannt.netherendingores.proxies.ServerProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance(MOD_ID)
    public static NetherendingOres instance;
    
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}