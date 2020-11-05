package org.icannt.netherendingores.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import org.icannt.netherendingores.registry.item.ItemRegistry;

import java.util.Objects;
import java.util.Random;

public class BlockOre extends BlockBase {

    public BlockOre(String resourceName, Block.Properties props) {
        super(resourceName, props);
    }

    @Override
    public void registerBlockItem() {
        Item.Properties props = new Item.Properties()
                .maxStackSize(64)
                .group(ItemRegistry.GROUP);

        BlockItem object = new BlockItem(this, props);
        object.setRegistryName(Objects.requireNonNull(this.getRegistryName()));
        ItemRegistry.add(object);
    }
}
