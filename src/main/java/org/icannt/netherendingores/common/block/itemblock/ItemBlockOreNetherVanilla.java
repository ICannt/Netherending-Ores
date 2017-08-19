package org.icannt.netherendingores.common.block.itemblock;

import org.icannt.netherendingores.common.block.ItemBlockVariantBase;
import org.icannt.netherendingores.common.block.variant.EnumOreVanillaType;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

/**
 * Created by ICannt on 17/08/17.
 */
public class ItemBlockOreNetherVanilla extends ItemBlockVariantBase {

    public ItemBlockOreNetherVanilla(Block block) {
        super(block);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + EnumOreVanillaType.values()[stack.getMetadata()].getName();
    }
    
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumOreVanillaType.values()[stack.getMetadata()].getRarity();
    }
}
