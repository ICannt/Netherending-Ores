package org.icannt.netherendingores.client.block.itemblock;

import org.icannt.netherendingores.common.block.data.BlockDataOreNetherVanilla;
import org.icannt.netherendingores.common.registry.BlockData;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

/**
 * Created by ICannt on 17/08/17.
 */
public class ItemBlockOreNetherVanilla extends ItemBlockOreVariantBase {

    public ItemBlockOreNetherVanilla(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return super.getTranslationKey() + "." + BlockDataOreNetherVanilla.values()[stack.getMetadata()].getName();
    }
    
    @Override
    public EnumRarity getForgeRarity(ItemStack stack) {
    	
    	return BlockData.values()[BlockDataOreNetherVanilla.values()[stack.getMetadata()].getBlockRecipeDataOrdinal()].getEnumRarity();
    	
    }
    
}
