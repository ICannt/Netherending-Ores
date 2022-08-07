package org.icannt.netherendingores.datagen;

import java.io.IOException;
import java.nio.file.Path;

import org.icannt.netherendingores.common.block.NeoOreBlocks;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class NeoLootTables extends LootTableProvider {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private final DataGenerator dataGeneratorIn;

    public NeoLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
        this.dataGeneratorIn = dataGeneratorIn;
    }

    @Override
    public void run(HashCache cache) {
        Path outFolder = this.dataGeneratorIn.getOutputFolder();

		for (NeoOreBlocks ore : NeoOreBlocks.values()) {
	        Block block = ore.getBlock();
	        LootPoolEntryContainer.Builder<?> entry = LootItem.lootTableItem(block);
	        LootPool.Builder pool = LootPool.lootPool().name("main").add(entry);
	        LootTable.Builder builder = LootTable.lootTable().withPool(pool);

	        Path out = outFolder.resolve("data/" + block.getRegistryName().getNamespace() + "/loot_tables/blocks/" + block.getRegistryName().getPath() + ".json");

	        try {
	            DataProvider.save(GSON, cache, LootTables.serialize(builder.setParamSet(LootContextParamSets.BLOCK).build()), out);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}

    }

}
