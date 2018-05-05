package org.icannt.netherendingores.integration.common.registry.data;

import org.icannt.netherendingores.common.registry.BlockRecipeData;

import mekanism.api.MekanismAPI;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.oredict.OreDictionary;

public enum MekRecipeData implements IStringSerializable {
	
    NETHER_COAL_ORE ("nether_coal_ore", 5, 4),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", 5, 4),
    NETHER_EMERALD_ORE ("nether_emerald_ore", 5, 4),
    NETHER_GOLD_ORE ("nether_gold_ore", 4, 4),
    NETHER_IRON_ORE ("nether_iron_ore", 4, 4),
    NETHER_LAPIS_ORE ("nether_lapis_ore", 24, 4),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", 21, 4),
    END_COAL_ORE ("end_coal_ore", 5, 4),
    END_DIAMOND_ORE ("end_diamond_ore", 5, 4),
    END_EMERALD_ORE ("end_emerald_ore", 5, 4),
    END_GOLD_ORE ("end_gold_ore", 4, 4),
    END_IRON_ORE ("end_iron_ore", 4, 4),
    END_LAPIS_ORE ("end_lapis_ore", 24, 4),
    END_REDSTONE_ORE ("end_redstone_ore", 21, 4),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", 4, 4),
    NETHER_COPPER_ORE ("nether_copper_ore", 4, 4),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", 4, 4),
    NETHER_LEAD_ORE ("nether_lead_ore", 4, 4),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", 4, 4),
    NETHER_NICKEL_ORE ("nether_nickel_ore", 4, 4),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", 4, 4),
    NETHER_SILVER_ORE ("nether_silver_ore", 4, 4),
    NETHER_TIN_ORE ("nether_tin_ore", 4, 4),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", 4, 4),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", 4, 4),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", 4, 4),
    NETHER_URANIUM_ORE ("nether_uranium_ore", 4, 4),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", 4, 4),
    END_ALUMINUM_ORE ("end_aluminum_ore", 4, 4),
    END_COPPER_ORE ("end_copper_ore", 4, 4),
    END_IRIDIUM_ORE ("end_iridium_ore", 4, 4),
    END_LEAD_ORE ("end_lead_ore", 4, 4),
    END_MITHRIL_ORE ("end_mithril_ore", 4, 4),
    END_NICKEL_ORE ("end_nickel_ore", 4, 4),
    END_PLATINUM_ORE ("end_platinum_ore", 4, 4),
    END_SILVER_ORE ("end_silver_ore", 4, 4),
    END_TIN_ORE ("end_tin_ore", 4, 4),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", 4, 4),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", 4, 4),
    END_OSMIUM_ORE ("end_osmium_ore", 4, 4),
    END_URANIUM_ORE ("end_uranium_ore", 4, 4),
    END_YELLORITE_ORE ("end_yellorite_ore", 4, 4),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 4, 4),
    END_QUARTZ_ORE ("end_quartz_ore", 4, 4),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 4, 4),
    END_ARDITE_ORE ("end_ardite_ore", 4, 4),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 4, 4),
    END_COBALT_ORE ("end_cobalt_ore", 4, 4);

	
	private String name;
	private int pulv2xCount;
	private int pulv3xCount;
	
	
	MekRecipeData(String name, int pulv2xCount, int pulv3xCount) {		
		this.name = name;
		this.pulv2xCount = pulv2xCount;
		this.pulv3xCount = pulv3xCount;
	}

	@Override
	public String getName() {
		return name;
	}
	
    public static int getCount(int index, int multiplier) {
        return MekRecipeData.values()[index].getCountValue(multiplier);
    }
	
    
	public int getCountValue(int multiplier) {
		// TODO: Mekanism recipes are not oredicted :( . Will need to either get the data from the mod or redo the data
		int count = 0;
		switch (multiplier) {
			case 2:	count = pulv2xCount; break;
			case 3:	count = pulv3xCount;
		}
		return count;
	}
	
	public static ItemStack getOutput(int index, int multiplier) {
		Item output = OreDictionary.getOres(BlockRecipeData.getOreDictPulvItem(index), false).get(0).getItem();
		int meta = OreDictionary.getOres(BlockRecipeData.getOreDictPulvItem(index), false).get(0).getMetadata();
		return new ItemStack(output, getCount(index, multiplier), meta);
	}
	
	public static void getEnrichRecipe(int index) {
		int multiplier = BlockRecipeData.values()[index].getRecipeMultiplier();
		// Using the API class, although it is being registered at the wrong event :(
		MekanismAPI.recipeHelper().addEnrichmentChamberRecipe(BlockRecipeData.getItemStack(index), getOutput(index, multiplier));
	}

}
