package org.icannt.netherendingores.datagen;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.Registration;
import org.icannt.netherendingores.common.block.NeoOreBlocks;
import org.icannt.netherendingores.lib.NeoString;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class NeoLanguages extends LanguageProvider {

	public NeoLanguages(DataGenerator gen, String locale) {
		super(gen, NetherendingOres.MOD_ID, locale);
	}

	@Override
	protected void addTranslations() {
		add("itemGroup." + NetherendingOres.MOD_ID + "_item_group", NetherendingOres.MOD_NAME);
		String name = "";
		for (NeoOreBlocks ore : NeoOreBlocks.values()) {
			name = ore.getName();
			if (ore.getOreType() == "ancient_debris") {
				// Ancient Debris doesn't have "Ore" in the name, it is retained in code for convenience
				name = name.replace("_ore", "");
			}
			add(ore.getBlock(), NeoString.toTitleSpaced(name));
		}
		add(Registration.NETHERENDING_ORES_CREATIVE_TAB_BLOCK.get(),
				NeoString.toTitleSpaced(Registration.NETHERENDING_ORES_CREATIVE_TAB_BLOCK.get().getRegistryName().getPath()));

	}

}
