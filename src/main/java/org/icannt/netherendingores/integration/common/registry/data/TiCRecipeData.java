package org.icannt.netherendingores.integration.common.registry.data;

import org.icannt.netherendingores.common.registry.BlockRecipeData;

import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fluids.FluidRegistry;
import slimeknights.tconstruct.library.TinkerRegistry;

/**
 * Created by ICannt on 19/04/18.
 */
public enum TiCRecipeData implements IStringSerializable {
	
    NETHER_COAL_ORE ("nether_coal_ore", false, false, 144, 4, 6),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", false, false, 144, 4, 6),
    NETHER_EMERALD_ORE ("nether_emerald_ore", true, true, 666, 4, 6),
    NETHER_GOLD_ORE ("nether_gold_ore", false, true, 144, 4, 6),
    NETHER_IRON_ORE ("nether_iron_ore", false, true, 144, 4, 6),
    NETHER_LAPIS_ORE ("nether_lapis_ore", false, false, 0, 0, 0),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", false, false, 0, 0, 0),
    END_COAL_ORE ("end_coal_ore", false, false, 144, 4, 6),
    END_DIAMOND_ORE ("end_diamond_ore", false, false, 144, 4, 6),
    END_EMERALD_ORE ("end_emerald_ore", true, true, 666, 4, 6),
    END_GOLD_ORE ("end_gold_ore", true, true, 144, 4, 6),
    END_IRON_ORE ("end_iron_ore", true, true, 144, 4, 6),
    END_LAPIS_ORE ("end_lapis_ore", false, false, 0, 0, 0),
    END_REDSTONE_ORE ("end_redstone_ore", false, false, 0, 0, 0),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", false, true, 144, 4, 6),
    NETHER_COPPER_ORE ("nether_copper_ore", false, true, 144, 4, 6),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", false, true, 144, 4, 6),
    NETHER_LEAD_ORE ("nether_lead_ore", false, true, 144, 4, 6),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", false, false, 144, 4, 6),
    NETHER_NICKEL_ORE ("nether_nickel_ore", false, true, 144, 4, 6),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", false, true, 144, 4, 6),
    NETHER_SILVER_ORE ("nether_silver_ore", false, true, 144, 4, 6),
    NETHER_TIN_ORE ("nether_tin_ore", false, true, 144, 4, 6),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", false, false, 0, 0, 0),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", false, false, 0, 0, 0),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", false, true, 144, 4, 6),
    NETHER_URANIUM_ORE ("nether_uranium_ore", false, false, 0, 0, 0),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", false, false, 0, 0, 0),
    END_ALUMINUM_ORE ("end_aluminum_ore", true, true, 144, 4, 6),
    END_COPPER_ORE ("end_copper_ore", true, true, 144, 4, 6),
    END_IRIDIUM_ORE ("end_iridium_ore", true, true, 144, 4, 6),
    END_LEAD_ORE ("end_lead_ore", true, true, 144, 4, 6),
    END_MITHRIL_ORE ("end_mithril_ore", false, false, 144, 4, 6),
    END_NICKEL_ORE ("end_nickel_ore", true, true, 144, 4, 6),
    END_PLATINUM_ORE ("end_platinum_ore", true, true, 144, 4, 6),
    END_SILVER_ORE ("end_silver_ore", true, true, 144, 4, 6),
    END_TIN_ORE ("end_tin_ore", true, true, 144, 4, 6),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", false, false, 0, 0, 0),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", false, false, 0, 0, 0),
    END_OSMIUM_ORE ("end_osmium_ore", true, true, 144, 4, 6),
    END_URANIUM_ORE ("end_uranium_ore", false, false, 0, 0, 0),
    END_YELLORITE_ORE ("end_yellorite_ore", false, false, 0, 0, 0),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", false, false, 0, 0, 0),
    END_QUARTZ_ORE ("end_quartz_ore", false, false, 0, 0, 0),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", true, true, 144, 4, 6),
    END_ARDITE_ORE ("end_ardite_ore", true, true, 144, 4, 6),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", true, true, 144, 4, 6),
    END_COBALT_ORE ("end_cobalt_ore", true, true, 144, 4, 6);

	
	private String name;
	private boolean smelt2xRecipeAdd;
	private boolean smelt3xRecipeAdd;
	private int smeltmilliBuckets;
	private int smelt2xMultiplier;
	private int smelt3xMultiplier;
	
	
	TiCRecipeData(String name, boolean smeltEnabled, boolean smelt3xRecipeAdd, int smeltmilliBuckets, int smelt2xMultiplier, int smelt3xMultiplier) {		
		this.name = name;
		this.smelt2xRecipeAdd = smeltEnabled;
		this.smelt3xRecipeAdd = smelt3xRecipeAdd;
		this.smeltmilliBuckets = smeltmilliBuckets;
		this.smelt2xMultiplier = smelt2xMultiplier;
		this.smelt3xMultiplier = smelt3xMultiplier;
	}
	
	
	@Override
	public String getName() {
		return name;
	}

	
	public static String getName(int index) {
		return TiCRecipeData.values()[index].getName(); 
	}
	
	
	public boolean getSmeltRecipeAdd(int multiplier) {
		boolean smeltRecipeAdd = false;
		switch (multiplier) {
			case 2:	smeltRecipeAdd = smelt2xRecipeAdd; break;
			case 3:	smeltRecipeAdd = smelt3xRecipeAdd;
		}
		return smeltRecipeAdd;
	}

	
	public static boolean getSmeltRecipeAdd(int index, int multiplier) {
		return TiCRecipeData.values()[index].getSmeltRecipeAdd(multiplier);
	}
	
	
	public int getMilliBuckets(int multiplier) {
		int amount = 0;
		switch (multiplier) {
			case 2:	amount = smelt2xMultiplier; break;
			case 3:	amount = smelt3xMultiplier;
		}
		return amount * smeltmilliBuckets;
	}
	
	
	public static int getMilliBuckets(int index, int multiplier) {
		return TiCRecipeData.values()[index].getMilliBuckets(multiplier);
	}
	
	
	public static void getSmeltRecipe(int index) {
		int multiplier = BlockRecipeData.values()[index].getRecipeMultiplier();
		TinkerRegistry.registerMelting(BlockRecipeData.getItemStack(index), FluidRegistry.getFluid(BlockRecipeData.getRawOreName(index)), getMilliBuckets(index, multiplier));
	}
	
	
}
