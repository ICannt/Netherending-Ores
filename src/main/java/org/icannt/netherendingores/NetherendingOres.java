package org.icannt.netherendingores;

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

// TODO: A version check will need to be implemented for Mekanism to prevent crashing when using the recipe API
@Mod(modid = NetherendingOres.MOD_ID,
	name = NetherendingOres.MOD_NAME,
	version = NetherendingOres.VERSION,
	acceptedMinecraftVersions = "[1.12.2,1.13)",
	dependencies = "required-after:forge@[14.23.2.2611,);after:mantle@[1.12-1.3.1,);after:tconstruct@[1.12.2-2.9.1,);after:plustic;after:appliedenergistics2;after:mekanism;")

public class NetherendingOres {

    public static final String MOD_ID = "netherendingores";
    public static final String MOD_NAME = "Netherending Ores";
    public static final String VERSION = "1.12.2-1.2";
    public static final String CFG_VERSION = "1.0";

    @SidedProxy(clientSide = "org.icannt.netherendingores.proxy.ClientProxy", serverSide = "org.icannt.netherendingores.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance(MOD_ID)
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