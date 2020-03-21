package org.icannt.netherendingores.common.registry;

import static net.minecraft.util.math.MathHelper.getInt;

import java.util.Locale;
import java.util.Random;

import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Log;
import org.icannt.netherendingores.lib.StringUtil;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 08/04/18.
 */
public enum BlockData implements IStringSerializable {


    END_ALUMINUM_ORE ("end_aluminum_ore", "ore_end_modded_1", 0, new String[] {"aluminium"}, "", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_COPPER_ORE ("end_copper_ore", "ore_end_modded_1", 1, new String[0], "", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_IRIDIUM_ORE ("end_iridium_ore", "ore_end_modded_1", 2, new String[0], "", 4, 3, 3F, 15F, EnumRarity.UNCOMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_LEAD_ORE ("end_lead_ore", "ore_end_modded_1", 3, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_MITHRIL_ORE ("end_mithril_ore", "ore_end_modded_1", 4, new String[0], "", 8, 3, 3F, 15F, EnumRarity.RARE, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_NICKEL_ORE ("end_nickel_ore", "ore_end_modded_1", 5, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_PLATINUM_ORE ("end_platinum_ore", "ore_end_modded_1", 6, new String[0], "", 4, 3, 3F, 15F, EnumRarity.UNCOMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_SILVER_ORE ("end_silver_ore", "ore_end_modded_1", 7, new String[0], "", 4, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_TIN_ORE ("end_tin_ore", "ore_end_modded_1", 8, new String[0], "", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", "ore_end_modded_1", 9, new String[0], "crystal", 0, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 2, 2, 4, false, true, 2, true),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", "ore_end_modded_1", 10, new String[0], "crystal", 0, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 2, 2, 5, false, true, 2, true),
    END_OSMIUM_ORE ("end_osmium_ore", "ore_end_modded_1", 11, new String[0], "", 0, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_URANIUM_ORE ("end_uranium_ore", "ore_end_modded_1", 12, new String[0], "", 0, 2, 4F, 30F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, false, true, 2, true),
    END_YELLORITE_ORE ("end_yellorite_ore", "ore_end_modded_1", 13, new String[] {"yellorium"}, "", 0, 0, 2F, 10F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_DILITHIUM_ORE ("end_dilithium_ore", "ore_end_modded_1", 14, new String[0], "gem", 0, 2, 4F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 1, 2, 5, false, true, 2, true),
    END_TRITANIUM_ORE ("end_tritanium_ore", "ore_end_modded_1", 15, new String[0], "", 0, 2, 8F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_ZINC_ORE ("end_zinc_ore", "ore_end_modded_2", 0, new String[0], "", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_RUBY_ORE ("end_ruby_ore", "ore_end_modded_2", 1, new String[0], "gem", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 4, 2, 7, true, true, 2, true),
    END_SAPPHIRE_ORE ("end_sapphire_ore", "ore_end_modded_2", 2, new String[0], "gem", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 4, 2, 7, true, true, 2, true),
    END_PERIDOT_ORE ("end_peridot_ore", "ore_end_modded_2", 3, new String[0], "gem", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 4, 2, 7, true, true, 2, true),
    END_ELECTROTINE_ORE ("end_electrotine_ore", "ore_end_modded_2", 4, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 8, 2, 5, true, true, 2, true),
    END_AMBROSIUM_ORE ("end_ambrosium_ore", "ore_end_modded_2", 5, new String[0], "gem", 6, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 1, 0, 1, false, true, 2, true),
    END_GRAVITITE_ORE ("end_gravitite_ore", "ore_end_modded_2", 6, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_ZANITE_ORE ("end_zanite_ore", "ore_end_modded_2", 7, new String[0], "gem", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 1, 2, 4, false, true, 2, true),
    END_ARKENIUM_ORE ("end_arkenium_ore", "ore_end_modded_2", 8, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_ICESTONE_ORE ("end_icestone_ore", "ore_end_modded_2", 9, new String[0], "gem", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 1, 1, 1, false, true, 2, true),
    END_COAL_ORE ("end_coal_ore", "ore_end_vanilla", 0, new String[0], "coal", 0, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 1, 1, 2, true, true, 2, true),
    END_DIAMOND_ORE ("end_diamond_ore", "ore_end_vanilla", 1, new String[0], "gem", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 1, 4, 7, true, true, 2, true),
    END_EMERALD_ORE ("end_emerald_ore", "ore_end_vanilla", 2, new String[0], "gem", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 1, 1, 3, 7, true, true, 2, true),
    END_GOLD_ORE ("end_gold_ore", "ore_end_vanilla", 3, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_IRON_ORE ("end_iron_ore", "ore_end_vanilla", 4, new String[0], "", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_LAPIS_ORE ("end_lapis_ore", "ore_end_vanilla", 5, new String[0], "gem", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 4, 8, 2, 5, true, true, 2, true),
    END_REDSTONE_ORE ("end_redstone_ore", "ore_end_vanilla", 6, new String[0], "dust", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, true, 4, 5, 1, 4, true, true, 2, true),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", "ore_nether_modded_1", 0, new String[] {"aluminium"}, "", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_COPPER_ORE ("nether_copper_ore", "ore_nether_modded_1", 1, new String[0], "", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", "ore_nether_modded_1", 2, new String[0], "", 4, 3, 3F, 15F, EnumRarity.UNCOMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_LEAD_ORE ("nether_lead_ore", "ore_nether_modded_1", 3, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", "ore_nether_modded_1", 4, new String[0], "", 8, 3, 3F, 15F, EnumRarity.RARE, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_NICKEL_ORE ("nether_nickel_ore", "ore_nether_modded_1", 5, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", "ore_nether_modded_1", 6, new String[0], "", 4, 3, 3F, 15F, EnumRarity.UNCOMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_SILVER_ORE ("nether_silver_ore", "ore_nether_modded_1", 7, new String[0], "", 4, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_TIN_ORE ("nether_tin_ore", "ore_nether_modded_1", 8, new String[0], "", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", "ore_nether_modded_1", 9, new String[0], "crystal", 0, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 2, 2, 4, false, true, 2, true),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", "ore_nether_modded_1", 10, new String[0], "crystal", 0, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 2, 2, 5, false, true, 2, true),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", "ore_nether_modded_1", 11, new String[0], "", 0, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_URANIUM_ORE ("nether_uranium_ore", "ore_nether_modded_1", 12, new String[0], "", 0, 2, 4F, 30F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, false, true, 2, true),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", "ore_nether_modded_1", 13, new String[] {"yellorium"}, "", 0, 0, 2F, 10F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_DILITHIUM_ORE ("nether_dilithium_ore", "ore_nether_modded_1", 14, new String[0], "gem", 0, 2, 4F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 2, 5, false, true, 2, true),
    NETHER_TRITANIUM_ORE ("nether_tritanium_ore", "ore_nether_modded_1", 15, new String[0], "", 0, 2, 8F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_ZINC_ORE ("nether_zinc_ore", "ore_nether_modded_2", 0, new String[0], "", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_RUBY_ORE ("nether_ruby_ore", "ore_nether_modded_2", 1, new String[0], "gem", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 4, 2, 7, true, true, 2, true),
    NETHER_SAPPHIRE_ORE ("nether_sapphire_ore", "ore_nether_modded_2", 2, new String[0], "gem", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 4, 2, 7, true, true, 2, true),
    NETHER_PERIDOT_ORE ("nether_peridot_ore", "ore_nether_modded_2", 3, new String[0], "gem", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 4, 2, 7, true, true, 2, true),
    NETHER_ELECTROTINE_ORE ("nether_electrotine_ore", "ore_nether_modded_2", 4, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 8, 2, 5, true, true, 2, true),
    NETHER_AMBROSIUM_ORE ("nether_ambrosium_ore", "ore_nether_modded_2", 5, new String[0], "gem", 6, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 1, false, true, 2, true),
    NETHER_GRAVITITE_ORE ("nether_gravitite_ore", "ore_nether_modded_2", 6, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_ZANITE_ORE ("nether_zanite_ore", "ore_nether_modded_2", 7, new String[0], "gem", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 2, 4, false, true, 2, true),
    NETHER_ARKENIUM_ORE ("nether_arkenium_ore", "ore_nether_modded_2", 8, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_ICESTONE_ORE ("nether_icestone_ore", "ore_nether_modded_2", 9, new String[0], "gem", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 1, 1, false, true, 2, true),
    NETHER_COAL_ORE ("nether_coal_ore", "ore_nether_vanilla", 0, new String[0], "coal", 0, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 1, 2, true, true, 2, true),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", "ore_nether_vanilla", 1, new String[0], "gem", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 4, 7, true, true, 2, true),
    NETHER_EMERALD_ORE ("nether_emerald_ore", "ore_nether_vanilla", 2, new String[0], "gem", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 3, 7, true, true, 2, true),
    NETHER_GOLD_ORE ("nether_gold_ore", "ore_nether_vanilla", 3, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_IRON_ORE ("nether_iron_ore", "ore_nether_vanilla", 4, new String[0], "", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_LAPIS_ORE ("nether_lapis_ore", "ore_nether_vanilla", 5, new String[0], "gem", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 4, 8, 2, 5, true, true, 2, true),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", "ore_nether_vanilla", 6, new String[0], "dust", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 4, 5, 1, 4, true, true, 2, true),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", "ore_other_1", 0, new String[0], "gem", 0, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 2, 5, true, true, 1, false),
    END_QUARTZ_ORE ("end_quartz_ore", "ore_other_1", 1, new String[0], "gem", 0, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 2, 5, true, true, 1, true),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", "ore_other_1", 2, new String[0], "", 0, 4, 10F, 50F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, false, true, 1, false),
    END_ARDITE_ORE ("end_ardite_ore", "ore_other_1", 3, new String[0], "", 0, 4, 10F, 50F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, false, true, 1, true),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", "ore_other_1", 4, new String[0], "", 0, 4, 10F, 50F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 1, false),
    END_COBALT_ORE ("end_cobalt_ore", "ore_other_1", 5, new String[0], "", 0, 4, 10F, 50F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 1, true),
    OVERWORLD_AMBROSIUM_ORE ("overworld_ambrosium_ore", "ore_other_1", 6, new String[0], "gem", 6, 0, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 1, false, true, 1, false),
    OVERWORLD_GRAVITITE_ORE ("overworld_gravitite_ore", "ore_other_1", 7, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 1, false),
    OVERWORLD_ZANITE_ORE ("overworld_zanite_ore", "ore_other_1", 8, new String[0], "gem", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 2, 4, false, true, 1, false),
    OVERWORLD_ARKENIUM_ORE ("overworld_arkenium_ore", "ore_other_1", 9, new String[0], "", 0, 2, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 1, false),
    OVERWORLD_ICESTONE_ORE ("overworld_icestone_ore", "ore_other_1", 10, new String[0], "gem", 0, 1, 3F, 15F, EnumRarity.COMMON, new Object[] {Items.AIR, 0}, false, 1, 1, 1, 1, false, true, 1, false);

	
    private String name;
    private String blockName;
    private int blockMeta;
    private String[] itemAltOreDictSuffix;
    private String itemOreDictPrefix;
    
    private int lightValue;
    private int harvestLevel;
    private float blockHardness;
    private float explosionResistance;
    private EnumRarity enumRarity;
    
    private Object[] dropItemObject;
    private boolean dropItems;
    private int dropItemsQuantityMin;
    private int dropItemsQuantityMax;
    private int dropItemsExperienceMin;
    private int dropItemsExperienceMax;
    
    private boolean furnaceRecipeEnabled;
    private boolean furnaceRecipeToItem;
    private int recipeMultiplier;
    private boolean oreExplosionEnabled;

    BlockData(String name, String blockName, int blockMeta, String[] itemAltOreDictSuffix, String itemOreDictPrefix,
    		int lightValue, int harvestLevel, float blockHardness, float explosionResistance, EnumRarity enumRarity,
    		Object[] dropItemObject, boolean dropItems, int dropItemsQuantityMin, int dropItemsQuantityMax, int dropItemsExperienceMin, int dropItemsExperienceMax,
    		boolean furnaceRecipeEnabled, boolean furnaceRecipeToItem, int recipeMultiplier, boolean oreExplosionEnabled) {
    	
		this.name = name;
		this.blockName = blockName;
		this.blockMeta = blockMeta;
		this.itemAltOreDictSuffix = itemAltOreDictSuffix;
		this.itemOreDictPrefix = itemOreDictPrefix;
		
		this.lightValue = lightValue;
		this.harvestLevel = harvestLevel;
		this.blockHardness = blockHardness;
		this.explosionResistance = explosionResistance;
		this.enumRarity = enumRarity;
		
		this.dropItemObject = dropItemObject;
		this.dropItems =  dropItems;
		this.dropItemsQuantityMin = dropItemsQuantityMin;
		this.dropItemsQuantityMax = dropItemsQuantityMax;
		this.dropItemsExperienceMin = dropItemsExperienceMin;
		this.dropItemsExperienceMax = dropItemsExperienceMax;
		
		this.furnaceRecipeEnabled = furnaceRecipeEnabled;
		this.furnaceRecipeToItem = furnaceRecipeToItem;
		this.recipeMultiplier = recipeMultiplier;
		this.oreExplosionEnabled = oreExplosionEnabled;
		
	}
	
	//
    @Override
    public String getName() {
        return name;
    }
    
    //
    public int getBlockMeta() {
    	return blockMeta;
    }

    //
	public String[] getItemAltOreDictSuffix() {
		return itemAltOreDictSuffix;
	}
	
	//
	public int getLightValue() {
		return lightValue;
	}
	
	//
	public int getHarvestLevel() {
		return harvestLevel;
	}
	
	//
    public float getBlockHardness() {
    	return blockHardness;
    }
    
    //
    public float getExplosionResistance() {    	
    	return explosionResistance / 5F;
    }
    
    //
    public EnumRarity getEnumRarity() {    	
    	return enumRarity;
    }
    
	//
	public void setDropItemObject() {

		// Set to default drop output first
		String itemType = getOreDictItemName("drop");
		String logItemMsg = itemType;
		
		// Try to get an alternate ore suffix if the initial drop item returns an empty stack
		if (getOtherModItemStack(itemType).getItem() == Items.AIR) {
			// This will only activate if the array isn't empty, only the first type can be returned. Blocks can only drop the one item.
			for (String material : getItemAltOreDictSuffix()) {
				itemType = getAltOreDictItemName("drop", material);
				logItemMsg += ", " + itemType;
				break;
			}			
		}
		
		// Try for a smelt item
		if (getOtherModItemStack(itemType).getItem() == Items.AIR) {
			// If we fail to get a crush item, go for a smelt item
			itemType = getOreDictItemName("smelt");
			logItemMsg += ", " + itemType + " (smelt result)";

		}

		// Try for an alternate smelt item here
		if (getOtherModItemStack(itemType).getItem() == Items.AIR) {
			// This will only activate if the array isn't empty, only the first type can be returned. Blocks can only drop the one item.
			for (String material : getItemAltOreDictSuffix()) {
				itemType = getAltOreDictItemName("smelt", material);
				logItemMsg += ", " + itemType + " (smelt result)";
				break;
			}
		}
		
		// Set the stack
		ItemStack stack = getOtherModItemStack(itemType);
		
		// Only set the stack if the result is not air
		if (!(stack.getItem() == Items.AIR)) {
			this.dropItemObject[0] = stack.getItem();
			this.dropItemObject[1] = stack.getItemDamage();
		}
		
		// Failed to find a valid item, log it and default to a block
		if (getItemDropped() == Items.AIR) {
			setDropItems(false);
			Log.logCacheItemsFail(logItemMsg);
		} else {
			// Some item was found, use it
			Log.logCacheItemsSuccess(itemType, getItemDropped(), getDamageDropped());
		}		
		
	}
	
	//
	public boolean getDropItems() {
		
		if (recipeMultiplier > 0) {
			return dropItems;
		}
		
		return false;
		
	}
	
	//
	public void setDropItems(boolean setting) {
		this.dropItems = setting;
	}
    
    //
    public int getRecipeMultiplier() {
    	return recipeMultiplier;
    }

    //
    public void setRecipeMultiplier(int multiplier) {
    	this.recipeMultiplier = multiplier;
    }
    
    //
    public boolean getOreExplosion() {
    	return oreExplosionEnabled;
    }
    
    //
    public void setOreExplosion(boolean setting) {
    	this.oreExplosionEnabled = setting;
    }
    
    /********************\
    *  Item Drop Helpers *
    \********************/
    
    //
    public Item getItemDropped() {
    	return (Item) dropItemObject[0];
    }
    
    //
    public int getDamageDropped() {    	
    	return (int) dropItemObject[1];    	
    }
    
    //
    public int getQuantityDropped(int fortune, Random random) {
    	
    	if (dropItemsQuantityMin <= dropItemsQuantityMax) {
	    	int bonus = fortune > 0 ? random.nextInt(fortune + 1) + 1 : 1;
	    	int extra = dropItemsQuantityMax - dropItemsQuantityMin;
	    	extra = extra > 0 ? random.nextInt(extra + 1) : 0;
	    	return dropItemsQuantityMin + extra * bonus * recipeMultiplier;
    	} else {
    		Log.warn("Detected item quantity drop minimum higher than maximum on ore \"" + blockName + "\", this should not happen! Returning drop count to recipe multiplier.");
    	}
    	
    	return 1 * recipeMultiplier;
    	
    	// TODO: May need to improve recipeMultiplier implementation may drop a lot of... drops.
    	
    }
	
    //
	public int getExpDrop(int fortune, Random random) {
		
		if (dropItemsExperienceMax > 0) {
			if (dropItemsExperienceMin <= dropItemsExperienceMax) {
				return getInt(random, dropItemsExperienceMin, dropItemsExperienceMax);
			} else {
				Log.warn("Detected item experience drop minimum higher than maximum on ore \"" + blockName + "\", this should not happen! Returning 0 experience.");
			}
		}
		
		return 0;
		
	}
    
	/**
	 * 
	 * @param oredictName
	 * @param amount
	 * @return
	 */
	public ItemStack getOtherModItemStack(String material) {
		
		for (ItemStack stack : OreDictionary.getOres(material, false))
		{
			if (!stack.getItem().getRegistryName().getNamespace().equals("netherendingores")) {
				return stack;
			}
		}
		
		return new ItemStack(Items.AIR);
		
	}
    
    /****************************\
    *  Vanilla Crafting Helpers  *
    \****************************/

    //
    public int getFurnaceAmount() {
    	return recipeMultiplier;
    }
    
    //
	public boolean getFurnaceRecipeEnabled() {
    	return furnaceRecipeEnabled;
    }
	
    //
	public boolean getFurnaceRecipeToItem() {
    	return furnaceRecipeToItem;
    }	
	
	//
	public void setFurnaceRecipeToItem(boolean setting) {
		this.furnaceRecipeToItem = setting;
	}
	
    //
    public Ingredient[] getConversionIngredient() {
		return new Ingredient[]{Ingredient.fromStacks(getModBlockItemStack())};
    }
    
    //
    public ResourceLocation getConversionResourceLocation(String material) {
		return new ResourceLocation(Info.MOD_ID + ":" + name + "_to_" + StringUtil.lowerUnder(getOreDictOtherModBlockName(material)));
    }
    
    
    /***************************\
    *  Block/Item Name Helpers  *
    \***************************/
    
    
    
	@SuppressWarnings("deprecation")
	public IBlockState getModBlockState() {
		return getModBlock().getStateFromMeta(blockMeta);
    }
	
	public String getModBlockStateName() {
		return getModBlockState().getProperties().values().toArray()[0].toString();
	}
	
	public String getOrdinalName() {
		return BlockData.values()[this.ordinal()].toString();
	}
	
    public String getModBlockStateNameValue() {
    	
    	String[] words = {"OVERWORLD_","NETHER_","END_"};
    	
    	for(String word : words) {
    		if (getOrdinalName().replace(word, "").equals(getModBlockStateName())) {
    			return name.replace(word.toLowerCase(Locale.ENGLISH), "");
    		}
    	}
    	
    	return "Error in blockstate name, please report.";
    	
    }
	
	public Block getModBlock() {
		return Block.getBlockFromName(Info.MOD_ID + ":" + blockName);
    }
	
	public Item getModBlockItem() {
		return Item.getItemFromBlock(getModBlock());
    }
	
    //
    public String getBlockName() {
    	return blockName;
    }
	
    //
    public String getBlockLogInfo() {
    	String meta = blockMeta > 0 ? ":" + blockMeta : ""; 
    	return Info.MOD_ID + ":" + blockName + meta;
    }
    
    //
    public String getAltMaterialName(String material) {
    	return name.replace(getRawOreName(name), material);
    }
	
	// 
	private String getOreDictItemName(String type) {
		return getOreDictOutputName(1, type, "name");
	}
	
	// 
	private String getAltOreDictItemName(String type, String material) {
		return getOreDictOutputName(1, type, material);
	}
    
	// 
	private String getOreDictOutputName(String type) {
		return getOreDictOutputName(recipeMultiplier, type, "name");
	}

	// 
	public String getOreDictOutputName(String type, String material) {
		return getOreDictOutputName(recipeMultiplier, type, material);
	}
		
	// 
	private String getOreDictOutputName(int multiplier, String type, String material) {
		material = material == "name" ? name : material;
		switch (type) {
			case "smelt":
				if (multiplier == 1 || (multiplier > 1 && furnaceRecipeToItem)) {
					return getOreDictSmeltItemName(itemOreDictPrefix, material);
				}
				break;
			case "crush":
				if (multiplier == 1 || multiplier == 2) {
					return getOreDictCrushItemName(itemOreDictPrefix, material);
				}
			case "drop":
				if (multiplier > 0) {
					return getOreDictDropItemName(itemOreDictPrefix, material);
				}
		}
		return getOreDictOtherModBlockName(material);
	}
    
    /**
     * Returns an Ore Dictionary name based on the defined recipe 
     * multiplier from the config file. Some mods such as
     * Tinkers' Construct use the "oreNether" and other prefixes
     * to add additional recipes for 2x/3x output.
     *
     * @return The reassembled mod ore block name
     */
    public String getOreDictRegName() {
    	return getOreDictPrefixedName(recipeMultiplier);
    }
    
    //
    public String getOreDictOtherModBlockName(String material) {
        return getOreDictPrefixedName(1, material);
    }
    
    //
    public String getOreDictCustomRegName(String material) {
    	material = name.replace(getRawOreName(name), material);
    	return getOreDictPrefixedName(recipeMultiplier, material);
    }
    
    //
    private String getOreDictPrefixedName(int multiplier) {
    	return getOreDictPrefixedName(multiplier, name);
    }
    
    /**
     * The method that returns the correct OreDict prefix for Netherending Ores.
     * 
     * @param       multiplier The Recipe Multiplier
     * @return      The prefixed OreDict name for Netherending Ores
     */
    private String getOreDictPrefixedName(int multiplier, String material) {
    	String prefix = "";
		switch (multiplier) {
			case 0: prefix = "neo"; break;
			case 1:	prefix = "ore"; material = getRawOreName(material); break;
			case 2:	prefix = "ore"; break;
			case 3: prefix = "oreDense";
		}
		return prefix + StringUtil.upperCamel(material.replace("_ore", ""));
    }
	
    /**
     * Determines which item prefix to use for smelting
     * then adds the ore name to it, blank input equates to "ingot".
     * Anything else other than "dust", "gem" or "crystal" means use the whole
     * string as the ore name.
     *
     * @param       prefix The prefix or full name from the block data table
     * @param       material The ore material that is being dealt with
     * @return      The reassembled other mod item name (often a dust)
     */
    private static String getOreDictSmeltItemName(String prefix, String material) {
    	String ore = StringUtil.upperCamel(getRawOreName(material));
    	switch (prefix) {
			case "": prefix = "ingot"; break;
			case "dust": case "gem": case "crystal": break;
			default: ore = "";
    	}
    	return prefix + ore;    	
    }
    
    /**
     * Determines which item prefix to use for grinding machines
     * then adds the ore name to it, blank input equates to "dust".
     * Anything else other than "gem" or "crystal" means use the whole
     * string as the ore name.
     *
     * @param       prefix The prefix or full name from the block data table
     * @param       material The ore material that is being dealt with
     * @return      The reassembled other mod item name (often a dust)
     */
    private static String getOreDictCrushItemName(String prefix, String material) {    	   	
    	String ore = StringUtil.upperCamel(getRawOreName(material));
    	switch (prefix) {
			case "": case "dust": prefix = "dust"; break;
			case "gem": case "crystal": break;
			default: ore = "";
    	}
    	return prefix + ore;    	
    }
    
    /**
     * Determines which item prefix to use for item drops
     * Similar to the crush item name, except the priorities are swapped
     *
     * @param       prefix The prefix or full name from the block data table
     * @param       material The ore material that is being dealt with
     * @return      The reassembled other mod item name (often a dust)
     */
    private static String getOreDictDropItemName(String prefix, String material) {
    	String ore = StringUtil.upperCamel(getRawOreName(material));
    	switch (prefix) {
			case "gem": case "crystal": break;
			case "": case "dust": prefix = "dust"; break;
			default: ore = "";
    	}
    	return prefix + ore;    	
    }

    //
    public String getOreDictCustomItemName(String prefix, String material) {
    	return prefix + StringUtil.upperCamel(getRawOreName(material));
    }
    
    /**
     * If called within context, it just passes the ore name
     * to the static version to strip the name.
     * 
     * @return      The stripped raw ore name
     */
    public String getRawOreName() {    	
    	return getRawOreName(name);
    }
    
    /**
     * Strips extensions and prefixes from ore enum names
     * 
     * @param       ore The string name to be stripped
     * @return      The base ore name
     */
    private static String getRawOreName(String ore) {
    	String[] words = {"_ore","overworld_","nether_","end_"};    	
    	for(String word : words) {
    		ore = ore.replace(word, "");
    	}
    	return ore;
    }

    /**
     * Strips extensions and prefixes from ore enum names
     * 
     * @param       ore The string name to be stripped
     * @return      The base ore name
     */
    public MapColor getModMapColor() {
    	String[] words = {"overworld_","nether_","end_"};    	
    	for(String word : words) {
    		if (name.replace(word, "") != name) {
    			if (word == "nether_") return MapColor.NETHERRACK;
    			if (word == "end_") return MapColor.SAND;
    		}
    	}
    	return MapColor.STONE;
    }
    
    
    /*********************\
    *  ItemStack Helpers  *
    \*********************/
    
    
    /**
     * Returns an ItemStack of the requested mod block.
     * 
     * @return      Mod Block ItemStack
     */
    public ItemStack getModBlockItemStack() {
    	return new ItemStack(Block.getBlockFromName(Info.MOD_ID + ":" + blockName), 1, blockMeta);
    }  
	
	/**
	 * 
	 * @param amount
	 * @return
	 */
	public ItemStack getOreDictSmeltItemStack(int amount) {
		return getOreDictOutputItemStack("smelt", amount);
	}
	
	/**
	 * 
	 * @param prefix
	 * @param material
	 * @param amount
	 * @return
	 */
	public ItemStack getOreDictCustomItemStack(String prefix, String material, int amount) {
		String oredictName = getOreDictCustomItemName(prefix, material);
		return getOreDictItemStack(oredictName, amount);
	}

	/**
	 * 
	 * @param type
	 * @param amount
	 * @return
	 */
	private ItemStack getOreDictOutputItemStack(String type, int amount) {
		String oredictName = getOreDictOutputName(type);
		return getOreDictItemStack(oredictName, amount);
	}
	
	/**
	 * 
	 * @param type
	 * @param material
	 * @param amount
	 * @return
	 */
	public ItemStack getOreDictOutputItemStack(String type, String material, int amount) {
		String oredictName = getOreDictOutputName(type, material);
		return getOreDictItemStack(oredictName, amount);
	}
	
	/**
	 * 
	 * @param oredictName
	 * @param amount
	 * @return
	 */
	public ItemStack getOtherModBlockItemStack(String material) {
		for (ItemStack stack : OreDictionary.getOres(getOreDictOtherModBlockName(material), false))
		{
			if (!stack.getItem().getRegistryName().getNamespace().equals("netherendingores")) {
				return stack;
			}
		}
		return new ItemStack(Items.AIR);
	}
	
	/**
	 * 
	 * @param oredictName
	 * @param amount
	 * @return
	 */
	public ItemStack getOreDictItemStack(String oredictName, int amount) {
		Item itemIn = OreDictionary.getOres(oredictName, false).get(0).getItem();
		int meta = OreDictionary.getOres(oredictName, false).get(0).getMetadata();
		return new ItemStack(itemIn, amount, meta);
	}
	
}
