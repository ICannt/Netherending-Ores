package org.icannt.netherendingores.common.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.registry.item.ItemRegistry;

import java.util.Objects;

public class BlockBase extends Block {
    private final String name;

    public BlockBase(String name, Properties properties) {
        super(properties);
        this.name = name;

        this.registrySetup();
    }

    public void registrySetup() {
        setRegistryName(new ResourceLocation(NetherendingOres.MOD_ID, this.name));
    }

    /**
     * This must be explicitly called or overridden from any subclass to register a BlockItem
     **/
    public void registerBlockItem() {
        Item.Properties props = new Item.Properties()
                .maxStackSize(64)
                .group(ItemRegistry.GROUP);

        BlockItem object = new BlockItem(this, props);
        object.setRegistryName(Objects.requireNonNull(this.getRegistryName()));
        ItemRegistry.add(object);
    }
}
