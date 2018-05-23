package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Util;

import com.google.common.base.CaseFormat;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 08/04/18.
 */
public enum BlockRecipeData implements IStringSerializable {

	
    NETHER_COAL_ORE ("nether_coal_ore", "ore_nether_vanilla", 0, new String[0], "coal", "dust", true, 2, 0),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", "ore_nether_vanilla", 1, new String[0], "gem", "dust", true, 2, 0),
    NETHER_EMERALD_ORE ("nether_emerald_ore", "ore_nether_vanilla", 2, new String[0], "gem", "", true, 2, 0),
    NETHER_GOLD_ORE ("nether_gold_ore", "ore_nether_vanilla", 3, new String[0], "", "", true, 2, 0),
    NETHER_IRON_ORE ("nether_iron_ore", "ore_nether_vanilla", 4, new String[0], "", "", true, 2, 0),
    NETHER_LAPIS_ORE ("nether_lapis_ore", "ore_nether_vanilla", 5, new String[0], "gem", "dust", true, 2, 0),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", "ore_nether_vanilla", 6, new String[0], "dust", "", true, 2, 0),
    END_COAL_ORE ("end_coal_ore", "ore_end_vanilla", 0, new String[0], "coal", "dust", true, 2, 0),
    END_DIAMOND_ORE ("end_diamond_ore", "ore_end_vanilla", 1, new String[0], "gem", "dust", true, 2, 0),
    END_EMERALD_ORE ("end_emerald_ore", "ore_end_vanilla", 2, new String[0], "gem", "", true, 2, 0),
    END_GOLD_ORE ("end_gold_ore", "ore_end_vanilla", 3, new String[0], "", "", true, 2, 0),
    END_IRON_ORE ("end_iron_ore", "ore_end_vanilla", 4, new String[0], "", "", true, 2, 0),
    END_LAPIS_ORE ("end_lapis_ore", "ore_end_vanilla", 5, new String[0], "gem", "dust", true, 2, 0),
    END_REDSTONE_ORE ("end_redstone_ore", "ore_end_vanilla", 6, new String[0], "dust", "", true, 2, 0),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", "ore_nether_modded_1", 0, new String[]{"aluminium"}, "", "", true, 2, 0),
    NETHER_COPPER_ORE ("nether_copper_ore", "ore_nether_modded_1", 1, new String[0], "", "", true, 2, 0),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", "ore_nether_modded_1", 2, new String[0], "", "", true, 2, 0),
    NETHER_LEAD_ORE ("nether_lead_ore", "ore_nether_modded_1", 3, new String[0], "", "", true, 2, 0),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", "ore_nether_modded_1", 4, new String[0], "", "", true, 2, 0),
    NETHER_NICKEL_ORE ("nether_nickel_ore", "ore_nether_modded_1", 5, new String[0], "", "", true, 2, 0),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", "ore_nether_modded_1", 6, new String[0], "", "", true, 2, 0),
    NETHER_SILVER_ORE ("nether_silver_ore", "ore_nether_modded_1", 7, new String[0], "", "", true, 2, 0),
    NETHER_TIN_ORE ("nether_tin_ore", "ore_nether_modded_1", 8, new String[0], "", "", true, 2, 0),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", "ore_nether_modded_1", 9, new String[0], "crystal", "dust", false, 2, 0),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", "ore_nether_modded_1", 10, new String[0], "crystal", "dustCertusQuartz", false, 2, 0),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", "ore_nether_modded_1", 11, new String[0], "", "", true, 2, 0),
    NETHER_URANIUM_ORE ("nether_uranium_ore", "ore_nether_modded_1", 12, new String[0], "", "", true, 2, 0),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", "ore_nether_modded_1", 13, new String[0], "", "", true, 2, 0),
    NETHER_DILITHIUM_ORE ("nether_dilithium_ore", "ore_nether_modded_1", 14, new String[0], "", "", true, 2, 0),
    NETHER_TRITANIUM_ORE ("nether_tritanium_ore", "ore_nether_modded_1", 15, new String[0], "", "", true, 2, 0),
    END_ALUMINUM_ORE ("end_aluminum_ore", "ore_end_modded_1", 0, new String[]{"aluminium"}, "", "", true, 2, 0),
    END_COPPER_ORE ("end_copper_ore", "ore_end_modded_1", 1, new String[0], "", "", true, 2, 0),
    END_IRIDIUM_ORE ("end_iridium_ore", "ore_end_modded_1", 2, new String[0], "", "", true, 2, 0),
    END_LEAD_ORE ("end_lead_ore", "ore_end_modded_1", 3, new String[0], "", "", true, 2, 0),
    END_MITHRIL_ORE ("end_mithril_ore", "ore_end_modded_1", 4, new String[0], "", "", true, 2, 0),
    END_NICKEL_ORE ("end_nickel_ore", "ore_end_modded_1", 5, new String[0], "", "", true, 2, 0),
    END_PLATINUM_ORE ("end_platinum_ore", "ore_end_modded_1", 6, new String[0], "", "", true, 2, 0),
    END_SILVER_ORE ("end_silver_ore", "ore_end_modded_1", 7, new String[0], "", "", true, 2, 0),
    END_TIN_ORE ("end_tin_ore", "ore_end_modded_1", 8, new String[0], "", "", true, 2, 0),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", "ore_end_modded_1", 9, new String[0], "crystal", "dust", false, 2, 0),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", "ore_end_modded_1", 10, new String[0], "crystal", "dustCertusQuartz", false, 2, 0),
    END_OSMIUM_ORE ("end_osmium_ore", "ore_end_modded_1", 11, new String[0], "", "", true, 2, 0),
    END_URANIUM_ORE ("end_uranium_ore", "ore_end_modded_1", 12, new String[0], "", "", true, 2, 0),
    END_YELLORITE_ORE ("end_yellorite_ore", "ore_end_modded_1", 13, new String[0], "", "", true, 2, 0),
    END_DILITHIUM_ORE ("end_dilithium_ore", "ore_end_modded_1", 14, new String[0], "", "", true, 2, 0),
    END_TRITANIUM_ORE ("end_tritanium_ore", "ore_end_modded_1", 15, new String[0], "", "", true, 2, 0),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", "ore_other_1", 0, new String[0], "gem", "dust", true, 1, 0),
    END_QUARTZ_ORE ("end_quartz_ore", "ore_other_1", 1, new String[0], "gem", "dust", true, 1, 0),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", "ore_other_1", 2, new String[0], "", "", true, 1, 0),
    END_ARDITE_ORE ("end_ardite_ore", "ore_other_1", 3, new String[0], "", "", true, 1, 0),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", "ore_other_1", 4, new String[0], "", "", true, 1, 0),
    END_COBALT_ORE ("end_cobalt_ore", "ore_other_1", 5, new String[0], "", "", true, 1, 0);



    private String name;
    private String blockName;
    private int blockMeta;
    private String[] itemAltOreDictSuffix;
    private String itemOreDictPrefix;
    private String itemAltOreDict;
    private boolean furnaceItemEnabled;
    private int defaultRecipeMultiplier;
    private int recipeMultiplier;
	
    
	BlockRecipeData(String name, String blockName, int blockMeta, String[] itemAltOreDictSuffix, String itemOreDictPrefix, String itemAltOreDict, boolean furnaceItemEnabled, int defaultRecipeMultiplier, int recipeMultiplier) {
		this.name = name;
		this.blockName = blockName;
		this.blockMeta = blockMeta;
		this.itemAltOreDictSuffix = itemAltOreDictSuffix;
		this.itemOreDictPrefix = itemOreDictPrefix;
		this.itemAltOreDict = itemAltOreDict;
		this.furnaceItemEnabled = furnaceItemEnabled;
		this.defaultRecipeMultiplier = defaultRecipeMultiplier;
		this.recipeMultiplier = recipeMultiplier;
	}
	
	//
    @Override
    public String getName() {
        return name;
    }

    //
    public Block getBlock() {
    	return Block.getBlockFromName(Info.MOD_ID + ":" + blockName);
    }
        
    //
    public int getBlockMeta() {
    	return blockMeta;
    }

    //
	public String[] getItemAltOreDictSuffix() {
		return itemAltOreDictSuffix;
	}
    
    public String getItemAltOreDict() {
    	// TODO: Implement alternate oredict prefixes for mods that often use them i.e. diamond dust for mekanism machines
    	// Just a stub for now
    	// Will likely change to each integration enum handling this themselves
		return itemAltOreDict;
	}

	
    public int getDefaultRecipeMultiplier() {
        return defaultRecipeMultiplier;
    }
    
    
    public int getRecipeMultiplier() {
    	return recipeMultiplier;
    }

    
    public void setRecipeMultiplier(int multiplier) {
    	this.recipeMultiplier = multiplier;
    }
    
    
    /****************************\
    *  Vanilla Crafting Helpers  *
    \****************************/
    
    
	// TODO: Just an alias for now, ideally the vanilla crafting and furnacing methods should be broken off from this enum into a new one?
	// This would leave this class to concentrate on oredict, multipliers and helpers.
    public int getFurnaceAmount() {
    	return recipeMultiplier;
    }
    
	public boolean isFurnaceItemEnabled() {
    	return furnaceItemEnabled;
    }
	
    
    public Ingredient[] getConversionIngredient() {
		return new Ingredient[]{Ingredient.fromStacks(getModBlockItemStack())};
    }
    
    
    public ResourceLocation getConversionResourceLocation() {
		return new ResourceLocation(Info.MOD_ID + ":" + name + "_to_" + Util.LowerUnder(getOreDictOtherModBlockName()));
    }
    
    
    /***************************\
    *  Block/Item Name Helpers  *
    \***************************/
    
    
    //
    public String getBlockName() {
    	String meta = blockMeta > 0 ? ":" + blockMeta : ""; 
    	return Info.MOD_ID + ":" + blockName + meta;
    }
    
    //
    public static String getAltMaterialName(int index, String baseName, String material) {
    	return values()[index].name.replace(getRawOreName(values()[index].name), material);
    }
    
    // 
	public String getOreDictSmeltOutputName() {
		return getOreDictOutputName("smelt");
	}
	
	// 
	public String getOreDictCrushOutputName() {
		return getOreDictOutputName("crush");
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
		String outputName = getOreDictOtherModBlockName();
		switch (type) {
			case "smelt":
				if (multiplier == 1) {
					outputName = getOreDictSmeltItemName(itemOreDictPrefix, material);
				}
			case "crush":
				if (multiplier == 1 || multiplier == 2) {
					outputName = getOreDictCrushItemName(itemOreDictPrefix, material);
				}
		}
		return outputName;
	}
    
    /**
     * Returns an Ore Dictionary name based on the defined recipe 
     * multiplier from the config file. Some mods such as
     * Tinkers' Construct use the "oreNether" and other prefixes
     * prefixes to add additional recipes for 2x/3x output.
     *
     * @return The reassembled mod ore block name
     */
    public String getOreDictRegName() {
    	return getOreDictPrefixedName(recipeMultiplier);
    }
	
    /**
     * The method that returns the correct OreDict prefix for other mods.
     * 
     * @return      The prefixed OreDict Block name for other mods.
     */
    public String getOreDictOtherModBlockName() {
        return getOreDictPrefixedName(1);
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
		return prefix + Util.UpperCamel(material.replace("_ore", ""));
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
    	String ore = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, getRawOreName(material));
    	switch (prefix) {
			case "": prefix = "ingot"; break;
			case "dust": case "gem": case "crystal": break;
			default:
				ore = "";
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
    	String ore = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, getRawOreName(material));    	
    	switch (prefix) {
			case "": case "dust": prefix = "dust"; break;
			case "gem": case "crystal": break;
			default:
				prefix = "";
				ore = getRawOreName(material);
    	}    	
    	return prefix + ore;    	
    }

    //
    public static String getOreDictCustomItemName(int index, String prefix, String material) {
    	return prefix + Util.UpperCamel(getRawOreName(material));
    }
    
    //
    public static String getOreDictCustomItemName(int index, String prefix) {
    	return values()[index].getOreDictCustomItemName(prefix);
    }
    
    //
    public String getOreDictCustomItemName(String prefix) {
    	return prefix + Util.UpperCamel(getRawOreName());
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
     * Just passes the ore name to the string parameter version,
     * that actually does the work.
     * 
     * @param       index Enum value number
     * @return      The stripped raw ore name
     */
    public static String getRawOreName(int index) {
    	return getRawOreName(values()[index].getName());
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

    
    /*********************\
    *  ItemStack Helpers  *
    \*********************/
    
    
    /**
     * Returns an ItemStack of the requested mod block.
     * 
     * @return      Mod Block ItemStack
     */
    public ItemStack getModBlockItemStack() {
    	return new ItemStack(getBlock(), 1, blockMeta);
    }  
    
    /**
     * Returns an ItemStack of the requested mod block.
     * Has a callable parameter.
     * 
     * @param       index Enum value number
     * @return      Mod Block ItemStack
     */
    public static ItemStack getModBlockItemStack(int index) {
    	Block block = values()[index].getBlock(); 
    	int meta = values()[index].getBlockMeta();
    	return new ItemStack(block, 1, meta);
    }
	
	//
	public ItemStack getOreDictSmeltItemStack(int amount) {
		return getOreDictOutputItemStack("smelt", amount);
	}
	
	//
	public static ItemStack getOreDictSmeltItemStack(int index, int amount) {
		return values()[index].getOreDictOutputItemStack("smelt", amount);
	}
	
	//
	public static ItemStack getOreDictSmeltItemStack(int index, String material, int amount) {
		return getOreDictCustomItemStack(index, "smelt", material, amount);
	}
	
	//
	public static ItemStack getOreDictCrushItemStack(int index, int amount) {
		return values()[index].getOreDictOutputItemStack("crush", amount);
	}

	//
	public static ItemStack getOreDictCrushItemStack(int index, String material, int amount) {
		return getOreDictCustomItemStack(index, "crush", material, amount);
	}
	
	//
	public static ItemStack getOreDictCustomItemStack(int index, String prefix, int amount) {
		String oredictName = getOreDictCustomItemName(index, prefix);
		Item itemIn = OreDictionary.getOres(oredictName, false).get(0).getItem();
		int meta = OreDictionary.getOres(oredictName, false).get(0).getMetadata();
		return new ItemStack(itemIn, amount, meta);
	}
	
	//
	public static ItemStack getOreDictCustomItemStack(int index, String prefix, String material, int amount) {
		String oredictName = getOreDictCustomItemName(index, prefix, material);
		Item itemIn = OreDictionary.getOres(oredictName, false).get(0).getItem();
		int meta = OreDictionary.getOres(oredictName, false).get(0).getMetadata();
		return new ItemStack(itemIn, amount, meta);
	}
	
	//
	private ItemStack getOreDictOutputItemStack(String type, int amount) {
		String oredictName = getOreDictOutputName(type);
		Item itemIn = OreDictionary.getOres(oredictName, false).get(0).getItem();
		int meta = OreDictionary.getOres(oredictName, false).get(0).getMetadata();
		return new ItemStack(itemIn, amount, meta);
	}
    
}
