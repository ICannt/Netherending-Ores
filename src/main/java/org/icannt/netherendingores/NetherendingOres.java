package org.icannt.netherendingores;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.icannt.netherendingores.registry.RegistryClient;
import org.icannt.netherendingores.registry.RegistryCommon;
import org.icannt.netherendingores.registry.block.BlockRegistry;
import org.icannt.netherendingores.registry.item.ItemRegistry;

@Mod(NetherendingOres.MOD_ID)
public class NetherendingOres
{
    public static final String MOD_ID = "netherendingores";
    public static final String MOD_NAME = "Netherending Ores";

    public static IEventBus EVENT_BUS;

    public NetherendingOres() {

        EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

        BlockRegistry.setup();
        ItemRegistry.setup();

        registerEvents();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> NetherendingOres::registerClientEvents);
    }

    public static void registerEvents() {
        EVENT_BUS.register(RegistryCommon.class);
    }

    public static void registerClientEvents() {
        EVENT_BUS.register(RegistryClient.class);
    }
}
