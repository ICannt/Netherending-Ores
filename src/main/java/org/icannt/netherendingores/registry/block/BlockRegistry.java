package org.icannt.netherendingores.registry.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import org.icannt.netherendingores.common.block.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlockRegistry {

    // private static final HashMap<IOreType, Block> ORES = new HashMap<>();
    private static final List<Block> BLOCKS = new ArrayList<>();

    private static final HashMap<Ores, HashMap<Variant, Block>> ORES = new HashMap<>();

    public static void setup() {
        // Register Ore Blocks
        for (Ores ore : Ores.values()) {
            for (Variant variant : ore.getVariants()) {
                Block.Properties props = Block.Properties.create(Material.ROCK, variant.getColor())
                        .hardnessAndResistance(ore.getHardness(), ore.getResistance())
                        .harvestTool(ToolType.PICKAXE)
                        .harvestLevel(ore.getHarvest());

                BlockOre block = new BlockOre(ore.getFullName(variant), props);
                block.registerBlockItem();
                BlockRegistry.addOre(ore, variant, block);
            }
        }
    }

    public static void addOre(Ores ore, Variant variant, Block block) {
        ORES.putIfAbsent(ore, new HashMap<>()); // Create the entry if it doesn't exist
        ORES.get(ore).put(variant, block);
        BLOCKS.add(block);
    }

    public static void add(Block block) {
        BLOCKS.add(block);
    }

    public static HashMap<Ores, HashMap<Variant, Block>> getOres() {
        return ORES;
    }

    public static List<Block> getBlocks() {
        return BLOCKS;
    }

    public static Block getOreVariant(Ores ore, Variant variant) {
        if (!ore.hasVariant(variant))
            return null;

        return ORES.get(ore).get(variant);
    }
}
