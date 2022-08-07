package org.icannt.netherendingores.datagen;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.Registration;
import org.icannt.netherendingores.common.block.NeoOreBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NeoBlockStates extends BlockStateProvider {

	public NeoBlockStates(DataGenerator generator, ExistingFileHelper helper) {
		super(generator, NetherendingOres.MOD_ID, helper);
	}

	@Override
	protected void registerStatesAndModels() {
		for (NeoOreBlocks ore : NeoOreBlocks.values()) {
			if (ore.getOreType() == "ancient_debris") {
				// Specific model coding for Ancient Debris to have side and top textures.
		        ResourceLocation side = modLoc(ore.getModelLocation("side"));
		        ResourceLocation top = modLoc(ore.getModelLocation("top"));
		        simpleBlock(ore.getBlock(), models().cubeColumn(ore.getRegistryBlockPath(), side, top));
			} else {
				simpleBlock(ore.getBlock());
			}
		}
		// Creative Tab Block
		String path = "block/netherending_ores_creative_tab_block_";
		ResourceLocation n = modLoc(path + "north");
		ResourceLocation s = modLoc(path + "south");
        ResourceLocation e = modLoc(path + "east");
        ResourceLocation w = modLoc(path + "west");
        simpleBlock(Registration.NETHERENDING_ORES_CREATIVE_TAB_BLOCK.get(), models().cube(
        		Registration.NETHERENDING_ORES_CREATIVE_TAB_BLOCK.get().getRegistryName().getPath(), n, e, n, s, e, w));
	}
}
