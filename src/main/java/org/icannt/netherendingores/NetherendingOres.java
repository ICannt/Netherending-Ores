package org.icannt.netherendingores;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NetherendingOres.MOD_ID)
public class NetherendingOres
{
    public static final String MOD_ID = "netherendingores";
    public static final String MOD_NAME = "Netherending Ores";
    public static final IEventBus EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

    public NetherendingOres() {
        Registration.init();
    }

}
