package org.icannt.netherendingores.client.block.itemblock;

import org.icannt.netherendingores.client.block.ItemBlockVariantBase;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndVanillaType;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

/**
 * Created by ICannt on 17/08/17.
 */
public class ItemBlockOreEndVanilla extends ItemBlockVariantBase {

    public ItemBlockOreEndVanilla(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + EnumOreEndVanillaType.values()[stack.getMetadata()].getName();
    }
    
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumOreEndVanillaType.values()[stack.getMetadata()].getRarity();
    }
}
