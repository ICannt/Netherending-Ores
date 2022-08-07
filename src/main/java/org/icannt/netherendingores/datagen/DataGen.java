package org.icannt.netherendingores.datagen;

import org.icannt.netherendingores.NetherendingOres;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = NetherendingOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {

	@SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeServer()) {
            NeoBlockTags blockTags = new NeoBlockTags(generator, helper);
            generator.addProvider(blockTags);
            generator.addProvider(new NeoItemTags(generator, blockTags, helper));
            generator.addProvider(new NeoLootTables(generator));
            //generator.addProvider(new NeoRecipes(generator));
        }

        if (event.includeClient()) {
            generator.addProvider(new NeoBlockStates(generator, helper));
            generator.addProvider(new NeoItemModels(generator, helper));
            generator.addProvider(new NeoLanguages(generator, "en_us"));
        }

    }
}
