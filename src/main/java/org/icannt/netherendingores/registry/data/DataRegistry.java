package org.icannt.netherendingores.registry.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import org.icannt.netherendingores.data.loot.OreLootProvider;
import org.icannt.netherendingores.data.recipe.OreSmeltingRecipeProvider;

public class DataRegistry {

    public static void serverSetup(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        registerRecipes(generator);
        registerLoot(generator);
    }

    public static void registerRecipes(DataGenerator generator) {
        //generator.addProvider(new OreSmeltingRecipe(generator));
        generator.addProvider(new OreSmeltingRecipeProvider(generator));
    }

    public static void registerLoot(DataGenerator generator) {
        generator.addProvider(new OreLootProvider(generator));
    }

}
