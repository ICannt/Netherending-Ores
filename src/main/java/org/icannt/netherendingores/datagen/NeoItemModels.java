package org.icannt.netherendingores.datagen;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.Registration;
import org.icannt.netherendingores.common.block.NeoOreBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NeoItemModels extends ItemModelProvider {

	public NeoItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, NetherendingOres.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		for (NeoOreBlocks ore : NeoOreBlocks.values()) {
			withExistingParent(ore.getRegistryBlockPath(), modLoc(ore.getModelLocation()));
		}
		// Creative Tab Block Item
		String registryPath = Registration.NETHERENDING_ORES_CREATIVE_TAB_BLOCK_ITEM.get().getRegistryName().getPath();
		withExistingParent(registryPath, modLoc("block/" + registryPath));
	}

}
