package org.icannt.netherendingores;

import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ICannt on 17/08/17.
 */

@Mod(modid = Info.MOD_ID,
	name = Info.MOD_NAME,
	version = Info.VERSION,
	acceptedMinecraftVersions = Info.MC_VERSIONS,
	dependencies = Info.DEPENDENCIES)

public class NetherendingOres {

    @SidedProxy(clientSide = Info.CLIENT_PROXY_CLASS, serverSide = Info.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.Instance(Info.MOD_ID)
    public static NetherendingOres instance;

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