package org.icannt.netherendingores.client.block.itemblock;

import org.icannt.netherendingores.client.block.ItemBlockVariantBase;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherModded1Type;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

/**
 * Created by ICannt on 17/08/17.
 */
public class ItemBlockOreModded1 extends ItemBlockVariantBase {

    public ItemBlockOreModded1(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return super.getTranslationKey() + "." + EnumOreNetherModded1Type.values()[stack.getMetadata()].getName();
    }
    
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumOreNetherModded1Type.values()[stack.getMetadata()].getRarity();
    }
}
