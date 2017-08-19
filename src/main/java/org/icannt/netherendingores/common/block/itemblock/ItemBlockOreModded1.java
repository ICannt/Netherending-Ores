package org.icannt.netherendingores.common.block.itemblock;

import org.icannt.netherendingores.common.block.ItemBlockVariantBase;
import org.icannt.netherendingores.common.block.variant.EnumOreModded1Type;
import org.icannt.netherendingores.common.block.variant.EnumOreVanillaType;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

/**
 * Created by ICannt on 17/08/17.
 */
public class ItemBlockOreModded1 extends ItemBlockVariantBase {

    public ItemBlockOreModded1(Block block) {
        super(block);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + EnumOreModded1Type.values()[stack.getMetadata()].getName();
    }
    
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumOreModded1Type.values()[stack.getMetadata()].getRarity();
    }
}
