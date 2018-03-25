package org.icannt.netherendingores.proxies;

import org.icannt.netherendingores.common.registry.RecipeRegistry;

import net.minecraftforge.fml.common.Mod;
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
    	RecipeRegistry.registerFurnaceRecipes();
    }

    public void postInit(FMLPostInitializationEvent event) {
        
    }


}