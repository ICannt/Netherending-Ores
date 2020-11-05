package org.icannt.netherendingores.data.loot;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.*;
import org.icannt.netherendingores.common.block.Ores;
import org.icannt.netherendingores.common.block.Variant;
import org.icannt.netherendingores.registry.block.BlockRegistry;

import java.io.IOException;
import java.nio.file.Path;

public class OreLootProvider extends LootTableProvider {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private final DataGenerator generator;

    public OreLootProvider(DataGenerator generator) {
        super(generator);
        this.generator = generator;
    }

    @Override
    public void act(DirectoryCache cache) {
        Path outFolder = this.generator.getOutputFolder();

        for (Ores ore : Ores.values()) {
            for (Variant variant : ore.getVariants()) {
                Block block = BlockRegistry.getOreVariant(ore, variant);
                LootEntry.Builder<?> entry = ItemLootEntry.builder(block);
                LootPool.Builder pool = LootPool.builder().name("main").addEntry(entry);
                LootTable.Builder builder = LootTable.builder().addLootPool(pool);

                Path out = outFolder.resolve("data/" + block.getRegistryName().getNamespace() + "/loot_tables/blocks/" + block.getRegistryName().getPath() + ".json");

                try {
                    IDataProvider.save(GSON, cache, LootTableManager.toJson(builder.setParameterSet(LootParameterSets.BLOCK).build()), out);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
