package org.icannt.netherendingores.client.block.itemblock;

import org.icannt.netherendingores.common.block.data.BlockDataOreEndModded1;
import org.icannt.netherendingores.common.registry.BlockData;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

/**
 * Created by ICannt on 17/08/17.
 */
public class ItemBlockOreEndModded1 extends ItemBlockOreVariantBase {

    public ItemBlockOreEndModded1(Block block) {
    	
        super(block);
        
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
    	
        return super.getTranslationKey() + "." + BlockDataOreEndModded1.values()[stack.getMetadata()].getName();
        
    }
    
    @Override
    public EnumRarity getForgeRarity(ItemStack stack) {
    	
    	return BlockData.values()[BlockDataOreEndModded1.values()[stack.getMetadata()].getBlockRecipeDataOrdinal()].getEnumRarity();
    	
    }
    
}
