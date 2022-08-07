package org.icannt.netherendingores.datagen;

import javax.annotation.Nullable;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.NeoOreBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NeoBlockTags extends BlockTagsProvider {

    public NeoBlockTags(DataGenerator generator, @Nullable ExistingFileHelper helper) {
        super(generator, NetherendingOres.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
    	for (NeoOreBlocks ore : NeoOreBlocks.values()) {
            tag(Tags.Blocks.ORES).add(ore.getBlock());
            tag(ore.getForgeOreBlockTag()).add(ore.getBlock());
            tag(ore.getBlockTagKey()).add(ore.getBlock());
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ore.getBlock());
            if (ore.getHarvestLevel() > 0) {
            	tag(ore.getToolNeeded()).add(ore.getBlock());
            }
        }
    }
}
