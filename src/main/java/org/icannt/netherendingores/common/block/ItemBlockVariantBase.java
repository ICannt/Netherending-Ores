package org.icannt.netherendingores.common.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * Created by ICannt on 17/08/17.
 */
public class ItemBlockVariantBase extends ItemBlock {

    public ItemBlockVariantBase(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

}
