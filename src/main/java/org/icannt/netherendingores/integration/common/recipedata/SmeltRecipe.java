package org.icannt.netherendingores.integration.common.recipedata;

import org.icannt.netherendingores.common.registry.BlockRecipeDataRegistry;

import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fluids.FluidRegistry;
import slimeknights.tconstruct.library.TinkerRegistry;

/**
 * Created by ICannt on 19/04/18.
 */
public enum SmeltRecipe implements IStringSerializable {
    NETHER_COAL_ORE ("nether_coal_ore", false, 144, 4, 8),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", false, 144, 4, 8),
    NETHER_EMERALD_ORE ("nether_emerald_ore", true, 666, 4, 8),
    NETHER_GOLD_ORE ("nether_gold_ore", true, 144, 4, 8),
    NETHER_IRON_ORE ("nether_iron_ore", true, 144, 4, 8),
    NETHER_LAPIS_ORE ("nether_lapis_ore", false, 0, 0, 0),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", false, 0, 0, 0),
    END_COAL_ORE ("end_coal_ore", false, 144, 4, 8),
    END_DIAMOND_ORE ("end_diamond_ore", false, 144, 4, 8),
    END_EMERALD_ORE ("end_emerald_ore", true, 666, 4, 8),
    END_GOLD_ORE ("end_gold_ore", true, 144, 4, 8),
    END_IRON_ORE ("end_iron_ore", true, 144, 4, 8),
    END_LAPIS_ORE ("end_lapis_ore", false, 0, 0, 0),
    END_REDSTONE_ORE ("end_redstone_ore", false, 0, 0, 0),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", true, 144, 4, 8),
    NETHER_COPPER_ORE ("nether_copper_ore", true, 144, 4, 8),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", true, 144, 4, 8),
    NETHER_LEAD_ORE ("nether_lead_ore", true, 144, 4, 8),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", false, 144, 4, 8),
    NETHER_NICKEL_ORE ("nether_nickel_ore", true, 144, 4, 8),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", true, 144, 4, 8),
    NETHER_SILVER_ORE ("nether_silver_ore", true, 144, 4, 8),
    NETHER_TIN_ORE ("nether_tin_ore", true, 144, 4, 8),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", false, 0, 0, 0),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", false, 0, 0, 0),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", true, 144, 4, 8),
    NETHER_URANIUM_ORE ("nether_uranium_ore", false, 0, 0, 0),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", false, 0, 0, 0),
    END_ALUMINUM_ORE ("end_aluminum_ore", true, 144, 4, 8),
    END_COPPER_ORE ("end_copper_ore", true, 144, 4, 8),
    END_IRIDIUM_ORE ("end_iridium_ore", true, 144, 4, 8),
    END_LEAD_ORE ("end_lead_ore", true, 144, 4, 8),
    END_MITHRIL_ORE ("end_mithril_ore", false, 144, 4, 8),
    END_NICKEL_ORE ("end_nickel_ore", true, 144, 4, 8),
    END_PLATINUM_ORE ("end_platinum_ore", true, 144, 4, 8),
    END_SILVER_ORE ("end_silver_ore", true, 144, 4, 8),
    END_TIN_ORE ("end_tin_ore", true, 144, 4, 8),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", false, 0, 0, 0),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", false, 0, 0, 0),
    END_OSMIUM_ORE ("end_osmium_ore", true, 144, 4, 8),
    END_URANIUM_ORE ("end_uranium_ore", false, 0, 0, 0),
    END_YELLORITE_ORE ("end_yellorite_ore", false, 0, 0, 0),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", false, 0, 0, 0),
    END_QUARTZ_ORE ("end_quartz_ore", false, 0, 0, 0),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", true, 144, 4, 8),
    END_ARDITE_ORE ("end_ardite_ore", true, 144, 4, 8),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", true, 144, 4, 8),
    END_COBALT_ORE ("end_cobalt_ore", true, 144, 4, 8);

	
	private String name;
	private boolean smeltEnabled;
	private int smeltmilliBuckets;
	private int smelt2xMultiplier;
	private int smelt3xMultiplier;
	
	
	SmeltRecipe(String name, boolean smeltEnabled, int smeltmilliBuckets, int smelt2xMultiplier, int smelt3xMultiplier) {		
		this.name = name;
		this.smeltEnabled = smeltEnabled;
		this.smeltmilliBuckets = smeltmilliBuckets;
		this.smelt2xMultiplier = smelt2xMultiplier;
		this.smelt3xMultiplier = smelt3xMultiplier;
	}
	
	
	@Override
	public String getName() {
		return name;
	}

	public static String getName(int index) {
		return SmeltRecipe.values()[index].getName(); 
	}
	
	public boolean getSmeltEnabled() {
		return smeltEnabled;
	}

	public static boolean getSmeltEnabled(int index) {
		return SmeltRecipe.values()[index].getSmeltEnabled();
	}
	
	public int getMilliBuckets(int multiplier) {
		int count = 0;
		switch (multiplier) {
			case 2:	count = smelt2xMultiplier; break;
			case 3:	count = smelt3xMultiplier;
		}
		return count * smeltmilliBuckets;
	}
	
	
	public static int getMilliBuckets(int index, int multiplier) {
		return SmeltRecipe.values()[index].getMilliBuckets(multiplier);
	}
	
	
	public static void getSmeltRecipe(int index) {
		int multiplier = BlockRecipeDataRegistry.values()[index].getRecipeMultiplier();
		TinkerRegistry.registerMelting(BlockRecipeDataRegistry.getItemStack(index), FluidRegistry.getFluid(BlockRecipeDataRegistry.getRawOreName(index)), getMilliBuckets(index, multiplier));
	}
	
	
}
