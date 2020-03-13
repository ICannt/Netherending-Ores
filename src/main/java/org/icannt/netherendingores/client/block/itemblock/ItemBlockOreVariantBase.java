package org.icannt.netherendingores.client.block.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * Created by ICannt on 17/08/17.
 */
public class ItemBlockOreVariantBase extends ItemBlock {

    public ItemBlockOreVariantBase(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

}
