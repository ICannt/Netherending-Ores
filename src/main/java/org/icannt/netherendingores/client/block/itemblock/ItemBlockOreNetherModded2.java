package org.icannt.netherendingores.client.block.itemblock;

import org.icannt.netherendingores.client.block.ItemBlockVariantBase;
import org.icannt.netherendingores.common.block.data.BlockDataOreNetherModded2;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

/**
 * Created by ICannt on 28/01/19.
 */
public class ItemBlockOreNetherModded2 extends ItemBlockVariantBase {

    public ItemBlockOreNetherModded2(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return super.getTranslationKey() + "." + BlockDataOreNetherModded2.values()[stack.getMetadata()].getName();
    }
    
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return BlockDataOreNetherModded2.values()[stack.getMetadata()].getRarity();
    }
}
