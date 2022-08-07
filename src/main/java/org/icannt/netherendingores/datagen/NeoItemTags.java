package org.icannt.netherendingores.datagen;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.NeoOreBlocks;
import org.jetbrains.annotations.Nullable;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NeoItemTags extends ItemTagsProvider {

	public NeoItemTags(DataGenerator generator, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(generator, blockTagsProvider, NetherendingOres.MOD_ID, existingFileHelper);
	}

    @Override
    protected void addTags() {
		for (NeoOreBlocks ore : NeoOreBlocks.values()) {
	        tag(Tags.Items.ORES).add(ore.getItem());
	        tag(ore.getForgeOreItemTag()).add(ore.getItem());
	        tag(ore.getItemTagKey()).add(ore.getItem());
	    }
    }

}
