package org.icannt.netherendingores.integration.common.recipedata;

import org.icannt.netherendingores.common.registry.BlockRecipeDataRegistry;

import cofh.thermalexpansion.util.managers.machine.PulverizerManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 11/04/18.
 */
public enum PulvRecipe implements IStringSerializable {

    NETHER_COAL_ORE ("nether_coal_ore", 3200, 5, "netherrack", 15, 8000, 4),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", 3200, 5, "netherrack", 15, 8000, 4),
    NETHER_EMERALD_ORE ("nether_emerald_ore", 3200, 5, "netherrack", 15, 8000, 4),
    NETHER_GOLD_ORE ("nether_gold_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_IRON_ORE ("nether_iron_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_LAPIS_ORE ("nether_lapis_ore", 3200, 24, "netherrack", 15, 8000, 4),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", 3200, 21, "netherrack", 15, 8000, 4),
    END_COAL_ORE ("end_coal_ore", 3200, 5, "endstone", 15, 8000, 4),
    END_DIAMOND_ORE ("end_diamond_ore", 3200, 5, "endstone", 15, 8000, 4),
    END_EMERALD_ORE ("end_emerald_ore", 3200, 5, "endstone", 15, 8000, 4),
    END_GOLD_ORE ("end_gold_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_IRON_ORE ("end_iron_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_LAPIS_ORE ("end_lapis_ore", 3200, 24, "endstone", 15, 8000, 4),
    END_REDSTONE_ORE ("end_redstone_ore", 3200, 21, "endstone", 15, 8000, 4),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_COPPER_ORE ("nether_copper_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_LEAD_ORE ("nether_lead_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_NICKEL_ORE ("nether_nickel_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_SILVER_ORE ("nether_silver_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_TIN_ORE ("nether_tin_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", 6400, 4, "netherrack", 15, 16000, 4),
    NETHER_URANIUM_ORE ("nether_uranium_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", 3200, 4, "netherrack", 15, 8000, 4),
    END_ALUMINUM_ORE ("end_aluminum_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_COPPER_ORE ("end_copper_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_IRIDIUM_ORE ("end_iridium_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_LEAD_ORE ("end_lead_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_MITHRIL_ORE ("end_mithril_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_NICKEL_ORE ("end_nickel_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_PLATINUM_ORE ("end_platinum_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_SILVER_ORE ("end_silver_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_TIN_ORE ("end_tin_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_OSMIUM_ORE ("end_osmium_ore", 6400, 4, "endstone", 15, 16000, 4),
    END_URANIUM_ORE ("end_uranium_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_YELLORITE_ORE ("end_yellorite_ore", 3200, 4, "endstone", 15, 8000, 4),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 1920, 4, "stone", 15, 4800, 4),
    END_QUARTZ_ORE ("end_quartz_ore", 1920, 4, "endstone", 15, 4800, 4),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 9600, 4, "stone", 15, 24000, 4),
    END_ARDITE_ORE ("end_ardite_ore", 9600, 4, "endstone", 15, 24000, 4),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 9600, 4, "stone", 15, 24000, 4),
    END_COBALT_ORE ("end_cobalt_ore", 9600, 4, "endstone", 15, 24000, 4);

	private String name;
	private int pulv2xEnergy;
	private int pulv2xCount;
	private String pulv2xSecondaryOutputItem;
	private int pulv2xSecondaryChance;	
	private int pulv3xEnergy;
	private int pulv3xCount;
	
	PulvRecipe(String name, int pulv2xEnergy, int pulv2xCount, String pulv2xSecondaryOutputItem, int pulv2xSecondaryChance, int pulv3xEnergy, int pulv3xCount) {		
		this.name = name;
		this.pulv2xEnergy = pulv2xEnergy;
		this.pulv2xCount = pulv2xCount;
		this.pulv2xSecondaryOutputItem = pulv2xSecondaryOutputItem;
		this.pulv3xEnergy = pulv3xEnergy;
		this.pulv3xCount = pulv3xCount;		
	}

	
	@Override
	public String getName() {
		return name;
	}
	
	
	public int getPulvEnergyValues(int multiplier) {
		int energy = 0;
		switch (multiplier) {
			case 2:	energy = pulv2xEnergy; break;
			case 3:	energy = pulv3xEnergy;
		}
		return energy;
	}

	
    public static int getPulvEnergy(int index, int multiplier) {
        return PulvRecipe.values()[index].getPulvEnergyValues(multiplier);
    }

    
	public int getPulvCountValues(int multiplier) {
		int count = 0;
		switch (multiplier) {
			case 2:	count = pulv2xCount; break;
			case 3:	count = pulv3xCount;
		}
		return count;
	}	
	
	
    public static int getPulvCount(int index, int multiplier) {
        return PulvRecipe.values()[index].getPulvEnergyValues(multiplier);
    }
	
    
	public String getPulvSecondaryOutputItem() {
		return pulv2xSecondaryOutputItem;
	}
	
	
	public static ItemStack getPrimaryOutput(int index, int multiplier) {
		return new ItemStack(OreDictionary.getOres(BlockRecipeDataRegistry.getItemOreDict(index), false).get(0).getItem(), multiplier);
	}
	
	
	public static ItemStack getSecondaryOutput(int index) {
		return new ItemStack(OreDictionary.getOres(PulvRecipe.values()[index].getPulvSecondaryOutputItem(), false).get(0).getItem(), 1);
	}
	
	
	public static void getPulvRecipe(int index) {
		int multiplier = BlockRecipeDataRegistry.values()[index].getRecipeMultiplier();
		switch (multiplier) {
			case 2: PulverizerManager.addRecipe(getPulvEnergy(index, multiplier), BlockRecipeDataRegistry.getItemStack(index), getPrimaryOutput(index, multiplier), getSecondaryOutput(index), pulv2xSecondaryChance); break;
			//case 3: PulverizerManager.addRecipe(getEnergy(multiplier), BlockRecipeDataRegistry.getItemStack(index), getPrimaryOutput(index, multiplier));
		}
	}

}