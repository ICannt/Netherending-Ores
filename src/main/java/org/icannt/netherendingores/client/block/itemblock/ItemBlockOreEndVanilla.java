package org.icannt.netherendingores.client.block.itemblock;

import org.icannt.netherendingores.common.block.data.BlockDataOreEndVanilla;
import org.icannt.netherendingores.common.registry.BlockData;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

/**
 * Created by ICannt on 17/08/17.
 */
public class ItemBlockOreEndVanilla extends ItemBlockOreVariantBase {

    public ItemBlockOreEndVanilla(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return super.getTranslationKey() + "." + BlockDataOreEndVanilla.values()[stack.getMetadata()].getName();
    }
    
    @Override
    public EnumRarity getForgeRarity(ItemStack stack) {
    	
    	return BlockData.values()[BlockDataOreEndVanilla.values()[stack.getMetadata()].getBlockRecipeDataOrdinal()].getEnumRarity();
    	
    }
    
}
