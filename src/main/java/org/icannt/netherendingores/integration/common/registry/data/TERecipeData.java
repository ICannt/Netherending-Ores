package org.icannt.netherendingores.integration.common.registry.data;

import org.icannt.netherendingores.common.registry.BlockRecipeData;

import cofh.api.util.ThermalExpansionHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 11/04/18.
 */
public enum TERecipeData implements IStringSerializable {

    NETHER_COAL_ORE ("nether_coal_ore", 3200, 5, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", 3200, 5, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_EMERALD_ORE ("nether_emerald_ore", 3200, 5, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_GOLD_ORE ("nether_gold_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_IRON_ORE ("nether_iron_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_LAPIS_ORE ("nether_lapis_ore", 3200, 24, "netherrack", 15, 8000, 4, 1600, 20, 2400, 30),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", 3200, 21, "netherrack", 15, 8000, 4, 1600, 12, 2400, 18),
    END_COAL_ORE ("end_coal_ore", 3200, 5, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_DIAMOND_ORE ("end_diamond_ore", 3200, 5, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_EMERALD_ORE ("end_emerald_ore", 3200, 5, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_GOLD_ORE ("end_gold_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_IRON_ORE ("end_iron_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_LAPIS_ORE ("end_lapis_ore", 3200, 24, "endstone", 15, 8000, 4, 1600, 20, 2400, 30),
    END_REDSTONE_ORE ("end_redstone_ore", 3200, 21, "endstone", 15, 8000, 4, 1600, 12, 2400, 18),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_COPPER_ORE ("nether_copper_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_LEAD_ORE ("nether_lead_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_NICKEL_ORE ("nether_nickel_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_SILVER_ORE ("nether_silver_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_TIN_ORE ("nether_tin_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", 6400, 4, "netherrack", 15, 16000, 4, 3200, 2, 4800, 3),
    NETHER_URANIUM_ORE ("nether_uranium_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    END_ALUMINUM_ORE ("end_aluminum_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_COPPER_ORE ("end_copper_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_IRIDIUM_ORE ("end_iridium_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_LEAD_ORE ("end_lead_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_MITHRIL_ORE ("end_mithril_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_NICKEL_ORE ("end_nickel_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_PLATINUM_ORE ("end_platinum_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_SILVER_ORE ("end_silver_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_TIN_ORE ("end_tin_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_OSMIUM_ORE ("end_osmium_ore", 6400, 4, "endstone", 15, 16000, 4, 3200, 2, 4800, 3),
    END_URANIUM_ORE ("end_uranium_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_YELLORITE_ORE ("end_yellorite_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 1920, 6, "stone", 15, 4800, 4, 960, 2, 1440, 3),
    END_QUARTZ_ORE ("end_quartz_ore", 1920, 6, "endstone", 15, 4800, 4, 960, 2, 1440, 3),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 9600, 4, "stone", 15, 24000, 4, 4800, 2, 7200, 3),
    END_ARDITE_ORE ("end_ardite_ore", 9600, 4, "endstone", 15, 24000, 4, 4800, 2, 7200, 3),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 9600, 4, "stone", 15, 24000, 4, 4800, 2, 7200, 3),
    END_COBALT_ORE ("end_cobalt_ore", 9600, 4, "endstone", 15, 24000, 4, 4800, 2, 7200, 3);

	private String name;
	
	private int pulv2xEnergy;
	private int pulv2xCount;
	private String pulv2xSecondaryOutputItem;
	private int pulv2xSecondaryOutputChance;	
	private int pulv3xEnergy;
	private int pulv3xCount;
	
	private int redFurn2xEnergy;
	private int redFurn2xCount;
	private int redFurn3xEnergy;
	private int redFurn3xCount;
	
	
	TERecipeData(String name, int pulv2xEnergy, int pulv2xCount, String pulv2xSecondaryOutputItem, int pulv2xSecondaryOutputChance,
			int pulv3xEnergy, int pulv3xCount, int redFurn2xEnergy, int redFurn2xCount, int redFurn3xEnergy, int redFurn3xCount) {
		
		this.name = name;
		
		this.pulv2xEnergy = pulv2xEnergy;
		this.pulv2xCount = pulv2xCount;
		this.pulv2xSecondaryOutputItem = pulv2xSecondaryOutputItem;
		this.pulv2xSecondaryOutputChance = pulv2xSecondaryOutputChance;
		this.pulv3xEnergy = pulv3xEnergy;
		this.pulv3xCount = pulv3xCount;
		
		this.redFurn2xEnergy = redFurn2xEnergy;
		this.redFurn2xCount = redFurn2xCount;
		this.redFurn3xEnergy = redFurn3xEnergy;
		this.redFurn3xCount = redFurn3xCount;
		
	}

	
	@Override
	public String getName() {
		return name;
	}

	
	public int getPulvEnergy(int multiplier) {
		switch (multiplier) {
			case 2:	return pulv2xEnergy;
			case 3:	return pulv3xEnergy;
		}
		return 0;
	}

	
    public static int getPulvEnergy(int index, int multiplier) {
        return TERecipeData.values()[index].getPulvEnergy(multiplier);
    }
    
    
	public int getPulvCount(int multiplier) {
		switch (multiplier) {
			case 2:	return pulv2xCount;
			case 3:	return pulv3xCount;
		}
		return 0;
	}
	
	
    public static int getPulvCount(int index, int multiplier) {
        return TERecipeData.values()[index].getPulvCount(multiplier);
    }
    
	
	public String getSecondaryOutputItem(int multiplier) {
		return pulv2xSecondaryOutputItem;
	}
	
	
	public int getSecondaryOutputChance(int multiplier) {
		return pulv2xSecondaryOutputChance;
	}
	
	
    public static int getPulvSecondaryOutputChance(int index, int multiplier) {
        return TERecipeData.values()[index].getSecondaryOutputChance(multiplier);
    }
    
	
	public static ItemStack getPulvPrimaryOutput(int index, int multiplier) {
		Item output = OreDictionary.getOres(BlockRecipeData.getOreDictPulvItem(index), false).get(0).getItem();
		int meta = OreDictionary.getOres(BlockRecipeData.getOreDictPulvItem(index), false).get(0).getMetadata();
		return new ItemStack(output, getPulvCount(index, multiplier), meta);
	}
		
	
	public static ItemStack getPulvSecondaryOutput(int index, int multiplier) {
		Item output = OreDictionary.getOres(TERecipeData.values()[index].getSecondaryOutputItem(multiplier), false).get(0).getItem();
		int meta = OreDictionary.getOres(TERecipeData.values()[index].getSecondaryOutputItem(multiplier), false).get(0).getMetadata();
		return new ItemStack(output, 1, meta);
	}
	
	
	public int getRedFurnEnergy(int multiplier) {
		switch (multiplier) {
			case 2:	return redFurn2xEnergy;
			case 3:	return redFurn3xEnergy;
		}
		return 0;
	}

	
    public static int getRedFurnEnergy(int index, int multiplier) {
        return TERecipeData.values()[index].getRedFurnEnergy(multiplier);
    }
    
    
	public int getRedFurnCount(int multiplier) {
		switch (multiplier) {
			case 2:	return redFurn2xCount;
			case 3:	return redFurn3xCount;
		}
		return 0;
	}
	
	
    public static int getRedFurnCount(int index, int multiplier) {
        return TERecipeData.values()[index].getRedFurnCount(multiplier);
    }
	
	
	public static ItemStack getRedFurnOutput(int index, int multiplier) {
		Item output = OreDictionary.getOres(BlockRecipeData.getOreDictFurnaceItem(index), false).get(0).getItem();
		int meta = OreDictionary.getOres(BlockRecipeData.getOreDictFurnaceItem(index), false).get(0).getMetadata();
		return new ItemStack(output, getPulvCount(index, multiplier), meta);
	}
	
	
	private static int getMultiplier(int index) {
		return BlockRecipeData.values()[index].getRecipeMultiplier();
	}
	
	
	public static void getPulvRecipe(int index) {
		int multiplier = getMultiplier(index);
		switch (multiplier) {
			case 2: ThermalExpansionHelper.addPulverizerRecipe(getPulvEnergy(index, multiplier), BlockRecipeData.getItemStack(index),
					getPulvPrimaryOutput(index, multiplier), getPulvSecondaryOutput(index, multiplier), getPulvSecondaryOutputChance(index, multiplier));
					break;
			case 3: ThermalExpansionHelper.addPulverizerRecipe(getPulvEnergy(index, multiplier), BlockRecipeData.getItemStack(index), getPulvPrimaryOutput(index, multiplier));
		}
	}
	
	
	public static void getRedFurnRecipe(int index) {
		int multiplier = getMultiplier(index);
		ThermalExpansionHelper.addFurnaceRecipe(getRedFurnEnergy(index, multiplier), BlockRecipeData.getItemStack(index), getRedFurnOutput(index, multiplier));
	}
	
	
}
