package org.icannt.netherendingores.client.block.itemblock;

import org.icannt.netherendingores.client.block.ItemBlockVariantBase;
import org.icannt.netherendingores.common.block.metadata.EnumOreOther1Type;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

/**
 * Created by ICannt on 17/08/17.
 */
public class ItemBlockOreOther1 extends ItemBlockVariantBase {

    public ItemBlockOreOther1(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return super.getTranslationKey() + "." + EnumOreOther1Type.values()[stack.getMetadata()].getName();
    }
    
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumOreOther1Type.values()[stack.getMetadata()].getRarity();
    }
}
