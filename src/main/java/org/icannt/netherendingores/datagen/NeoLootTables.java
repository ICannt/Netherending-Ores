package org.icannt.netherendingores.datagen;

import java.io.IOException;
import java.nio.file.Path;

import org.icannt.netherendingores.common.block.NeoOreBlocks;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.entries.TagEntry;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

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

	        float min = 1;
	        float max = 1;

	        LootPoolEntryContainer.Builder<?> silkTouch = LootItem.lootTableItem(block);
	        LootPoolSingletonContainer.Builder<?> dropItem = LootItem.lootTableItem(null);

	        silkTouch = silkTouch.when(MatchTool.toolMatches(ItemPredicate.Builder.item()
                    .hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1)))));

	        if (ore.isVanilla()) {
	        	dropItem = LootItem.lootTableItem(ore.getVanillaLootItem());
	        } else {
	        	dropItem = TagEntry.expandTag(ore.getForgeOreLootItemTag());
	        }

	        dropItem = dropItem.apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
            		.apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE, 1))
            		.apply(ApplyExplosionDecay.explosionDecay());

	        LootPool.Builder builderLootPool = LootPool.lootPool()
	        		.name(ore.getName())
	        		.setRolls(ConstantValue.exactly(1))
	                .add(AlternativesEntry.alternatives(silkTouch, dropItem));

	        LootTable.Builder builderLootTable = LootTable.lootTable().withPool(builderLootPool);

	        Path out = outFolder.resolve("data/" + block.getRegistryName().getNamespace() + "/loot_tables/blocks/" + block.getRegistryName().getPath() + ".json");

	        try {
	            DataProvider.save(GSON, cache, LootTables.serialize(builderLootTable.setParamSet(LootContextParamSets.BLOCK).build()), out);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}

    }

}
