package org.icannt.netherendingores.lib;

import static net.minecraft.util.math.MathHelper.clamp;

import org.icannt.netherendingores.common.registry.BlockData;
import org.icannt.netherendingores.common.registry.OreDictionaryOtherData;
import org.icannt.netherendingores.proxy.CommonProxy;

/**
 * Created by ICannt on 25/03/18.
 */


public class Config {
	
	// General
	
	public static boolean advancedDebugging = false;
	
	// Mobs
	
	public static final int PRIMED_ORE_ENTITY_ID = 668;
	
    public static final int NETHERFISH_ENTITY_ID = 667;
    public static final int NETHERFISH_TRACKING_RANGE = 50;
    public static final int NETHERFISH_SPAWN_EGG_PRIMARY_COLOR = 12325908;
    public static final int NETHERFISH_SPAWN_EGG_SECONDARY_COLOR = 16761600;

    public static double netherfishAttackDamage = 0.5D;
    private static double netherfishAttackDamageMin = 0D;
    private static double netherfishAttackDamageMax = 1000D;
    public static double netherfishKnockbackResistance = 0D;
    private static double netherfishKnockbackResistanceMin = 0.0D;
    private static double netherfishKnockbackResistanceMax = 100D;
    public static double netherfishMaxHealth = 10D;
    private static double netherfishMaxHealthMin = 1D;
    private static double netherfishMaxHealthMax = 1000D;
    public static double netherfishMovementSpeed = 0.2D;
    private static double netherfishMovementSpeedMin = 0D;
    private static double netherfishMovementSpeedMax = 1D;
    public static boolean netherfishSetFire = true;
    public static boolean netherfishWAILA = true;
    
    public static boolean endermiteEndermanHostility = true;
    public static boolean endermiteWAILA = true;
    
    public static boolean zombiePigmanAnger = true;
    public static int zombiePigmanAngerRangeHeight = 16;
    public static int zombiePigmanAngerRangeHeightMin = 1;
    public static int zombiePigmanAngerRangeHeightMax = 32;
    public static int zombiePigmanAngerRangeRadius = 32;
    public static int zombiePigmanAngerRangeRadiusMin = 1;
    public static int zombiePigmanAngerRangeRadiusMax = 64;
    public static boolean zombiePigmanAngerSilkTouch = true;

    // Ores
    
    public static boolean dropItems = false;
    public static boolean dropItemsOverride = false;

    public static final int ORE_EXPLOSION_FUSE_LENGTH_TICKS = 80;
    
    public static boolean oreExplosion = true;
    public static double oreExplosionChance = 0.125D;
    private static double oreExplosionChanceMin = 0D;
    private static double oreExplosionChanceMax = 1D;
    public static boolean oreExplosionFortune = true;
    public static boolean oreExplosionOverride = false;
    public static boolean oreExplosionSilkTouch = true;
    public static double oreExplosionStrength = 4D;
    private static double oreExplosionStrengthMin = 0D;
    private static double oreExplosionStrengthMax = 20D;
    
    // Recipes
    
	public static boolean furnaceToItem = false;
    public static boolean furnaceToItemOverride = false;
	
	public static boolean immersiveEngineeringRecipes = true;
	public static boolean industrialCraft2Recipes = true;
	public static boolean mekanismRecipes = true;
	public static boolean thermalExpansionRecipes = true;
	public static boolean tinkersConstructRecipes = true;
	
	public static boolean vanillaCraftingRecipes = true;
	public static boolean vanillaFurnaceRecipes = true;
	
	private static float outputFactorMin = 0.5f;
	private static float fullOutputFactorMax = 3f;
	private static float reducedOutputFactorMax = 1f;
	
	public static boolean inductionSmelterFullOutput = false;
	public static float inductionSmelterFullOutputAmountFactor = 1f;
	public static float inductionSmelterFullOutputEnergyFactor = 2f;
	public static float inductionSmelterReducedOutputAmountFactor = 2/3f;
	public static float inductionSmelterReducedOutputEnergyFactor = 0.6f;
	
	public static boolean pulverizerFullOutput = false;
	public static float pulverizerFullOutputAmountFactor = 1f;
	public static float pulverizerFullOutputEnergyFactor = 2f;
	public static float pulverizerReducedOutputAmountFactor = 2/3f;
	public static float pulverizerReducedOutputEnergyFactor = 0.6f;
	
	public static boolean redstoneFurnaceFullOutput = false;
	public static float redstoneFurnaceFullOutputAmountFactor = 1f;
	public static float redstoneFurnaceFullOutputEnergyFactor = 2f;
	public static float redstoneFurnaceReducedOutputAmountFactor = 2/3f;
	public static float redstoneFurnaceReducedOutputEnergyFactor = 0.6f;
	
	private static int recipeMultiplierOverride = -1;
	private static int recipeMultiplierOverrideMin = recipeMultiplierOverride;
	private static int recipeMultiplierMin = 0;
	private static int recipeMultiplierMax = 3;
	
	// Category Hierarchy
	
	private static final String CATEGORY_GENERAL = "general";
	
	private static final String CATEGORY_MOBS = "mobs";
	private static final String CATEGORY_MOBS__ENDERMITE = "mobs.endermite";
	private static final String CATEGORY_MOBS__NETHERRFISH = "mobs.netherfish";
	private static final String CATEGORY_MOBS__ZOMBIE_PIGMAN = "mobs.zombie pigman";
	
	private static final String CATEGORY_ORES = "ores";
	private static final String CATEGORY_ORES__DROP_ITEMS = "ores.drop items";
	private static final String CATEGORY_ORES__DROP_ITEMS__DROP_ITEM_ORES = "ores.drop items.drop item ores";
	private static final String CATEGORY_ORES__ORE_DICTIONARY = "ores.ore dictionary";
	private static final String CATEGORY_ORES__ORE_EXPLOSIONS = "ores.ore explosions";
	private static final String CATEGORY_ORES__ORE_EXPLOSIONS__ORE_EXPLOSION_ORES = "ores.ore explosions.ore explosion ores";

	private static final String CATEGORY_RECIPES = "recipes";
	private static final String CATEGORY_RECIPES__FURNACE_TO_ITEMS = "recipes.furnace to items";
	private static final String CATEGORY_RECIPES__FURNACE_TO_ITEMS__FURNACE_TO_ITEM_ORES = "recipes.furnace to items.furnace to item ores";
	private static final String CATEGORY_RECIPES__INTEGRATION = "recipes.integration";
	private static final String CATEGORY_RECIPES__INTEGRATION__THERMAL_EXPANSION = "recipes.integration.thermal expansion";
	private static final String CATEGORY_RECIPES__RECIPE_MULTIPLIERS = "recipes.recipe multipliers";
	private static final String CATEGORY_RECIPES__RECIPE_MULTIPLIERS__RECIPE_MULTIPLIER_ORES = "recipes.recipe multipliers.recipe multiplier ores";
	
    //
	public static void readConfig() {
		
        ConfigEx cfg = CommonProxy.config;
        
        try {        	
            cfg.load();
            loadCategoryCommentStrings(cfg);
            loadCategories(cfg);
        } catch (Exception e1) {
            Log.error("Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
        
    }
	
	//
	private static void loadCategories(ConfigEx cfg) {
        
        initGeneralSettingsConfig(cfg, CATEGORY_GENERAL);

        initMobsNetherfishConfig(cfg, CATEGORY_MOBS__NETHERRFISH);
        initMobsEndermiteConfig(cfg, CATEGORY_MOBS__ENDERMITE);
        initMobsZombiePigmanConfig(cfg, CATEGORY_MOBS__ZOMBIE_PIGMAN);
        
        initOresOreDictionaryConfig(cfg, CATEGORY_ORES__ORE_DICTIONARY);
        initOresDropItems(cfg, CATEGORY_ORES__DROP_ITEMS);
        initOresDropItemsDropItemOres(cfg, CATEGORY_ORES__DROP_ITEMS__DROP_ITEM_ORES);        
        initOresOreExplosionsConfig(cfg, CATEGORY_ORES__ORE_EXPLOSIONS);
        initOresOreExplosionOresConfig(cfg, CATEGORY_ORES__ORE_EXPLOSIONS__ORE_EXPLOSION_ORES);

        initRecipesFurnaceToItemsConfig(cfg, CATEGORY_RECIPES__FURNACE_TO_ITEMS);
        initRecipesFurnaceToItemsFurnaceToItemOresConfig(cfg, CATEGORY_RECIPES__FURNACE_TO_ITEMS__FURNACE_TO_ITEM_ORES);
        initRecipesIntegrationConfig(cfg, CATEGORY_RECIPES__INTEGRATION);
        initRecipesIntegrationThermalExpansionConfig(cfg, CATEGORY_RECIPES__INTEGRATION__THERMAL_EXPANSION);
        initRecipesRecipeMultipliersConfig(cfg, CATEGORY_RECIPES__RECIPE_MULTIPLIERS);
        initRecipesRecipeMultipliersRecipeMultiplierOresConfig(cfg, CATEGORY_RECIPES__RECIPE_MULTIPLIERS__RECIPE_MULTIPLIER_ORES);
        
	}
	
	//
    private static void loadCategoryCommentStrings(ConfigEx cfg) {

    	cfg.setCategoryComment(CATEGORY_GENERAL, "General Settings.");
    	
    	cfg.setCategoryComment(CATEGORY_MOBS, "Mob Settings.");

    	cfg.setCategoryComment(CATEGORY_ORES, "Ore Settings.");
    	cfg.setCategoryComment(CATEGORY_ORES__DROP_ITEMS, ""
    			+ "If any of the following ores is set to true, that ore will drop items instead of ore blocks.\r\n"
    			+ "Requires drop items to be enabled.\r\n"
    			+ "There is an override so all ores will drop items."
    			);
    	
    	cfg.setCategoryComment(CATEGORY_RECIPES, "Recipe Settings.");
    	cfg.setCategoryComment(CATEGORY_RECIPES__FURNACE_TO_ITEMS, ""
    			+ "If any of the following ores is set to true, that item will furnace direct to item.\r\n"
    			+ "Requires furnace to items to be enabled.\r\n"
    			+ "There is an override so all ores will smelt to item."
    			);
    	cfg.setCategoryComment(CATEGORY_RECIPES__INTEGRATION__THERMAL_EXPANSION, "" 
    			+ "Settings for Thermal Expansion machine processing.\r\n"
    			+ "Please ask the mod author trab if you need assistance understanding how this works.");
    	cfg.setCategoryComment(CATEGORY_RECIPES__RECIPE_MULTIPLIERS, ""
    			+ "-1 = Only used by the override.\r\n"
    			+ " 0 = No recipes/standard oredict, ideal for crafttweaker.\r\n"
    			+ "     Oredict entries prefixed with \"neo\" for easy crafttweaker use.\r\n"
    			+ " 1 = Oredict mode uses the same oredict name as the target ore, also adds recipe to craft target ore if needed.\r\n"
    			+ " 2 = Crush to dust at 2x rate with mod specific bonuses | Smelt to 2x oredict ore.\r\n"
    			+ "     Oredict entries prefixed with \"oreEnd\", \"oreNether\" or \"oreOverworld\" respectively.\r\n"
    			+ " 3 = Crush to 4x oredict ore | Smelt to 3x oredict ore.\r\n"
    			+ "     Oredict entries prefixed with \"oreDenseEnd\", \"oreDenseNether\" or \"oreDenseOverworld\" respectively.");

    }

	//
    private static void initGeneralSettingsConfig(ConfigEx cfg, String category) {

    	advancedDebugging = cfg.getBoolean("Advanced debugging", category, advancedDebugging, "Enable advanced debugging. Show all trace level messages in debug.log. Only enable if you really need it.");
    	
    }

    //
    private static void initMobsEndermiteConfig(ConfigEx cfg, String category) {
    	
    	endermiteEndermanHostility = cfg.getBoolean("Endermite Enderman hostility", category, endermiteEndermanHostility, "Player spawned Endermites from monster eggs are treated as hostile by Endermen. Can trap players in bad situations.");
    	endermiteWAILA = cfg.getBoolean("Endermite waila/hwyla", category, endermiteWAILA, "Enables the Endermite spawn blocks to be hidden from WAILA/HWYLA i.e. show as End Stone.");
    	
    }
    
    //
    private static void initMobsNetherfishConfig(ConfigEx cfg, String category) {
    	
        netherfishAttackDamage = cfg.getDouble("Netherfish attack damage", category, netherfishAttackDamage, netherfishAttackDamageMin, netherfishAttackDamageMax, "Netherfish attack damage multiplier.");
        netherfishKnockbackResistance = cfg.getDouble("Netherfish knockback resistance", category, netherfishKnockbackResistance, netherfishKnockbackResistanceMin, netherfishKnockbackResistanceMax, "Netherfish knockback resistance multiplier.");
        netherfishMaxHealth = cfg.getDouble("Netherfish maximum health", category, netherfishMaxHealth, netherfishMaxHealthMin, netherfishMaxHealthMax, "Netherfish maximum health in half hearts.");
        netherfishMovementSpeed = cfg.getDouble("Netherfish movement speed", category, netherfishMovementSpeed, netherfishMovementSpeedMin, netherfishMovementSpeedMax, "Netherfish movement speed multiplier.");
        netherfishSetFire = cfg.getBoolean("Netherfish set fire", category, netherfishSetFire, "Enables the Netherfish to set the player on fire during attack.");
        netherfishWAILA = cfg.getBoolean("Netherfish waila/hwyla", category, netherfishWAILA, "Enables the Netherfish spawn blocks to be hidden from WAILA/HWYLA i.e. show as Netherrack.");
    	    	
    }
    
    //
    private static void initMobsZombiePigmanConfig(ConfigEx cfg, String category) {
    	    	
    	zombiePigmanAnger = cfg.getBoolean("Zombie Pigman anger", category, zombiePigmanAnger, "Enables the Zombie Pigman anger reaction to mining ores.");  	
    	zombiePigmanAngerRangeHeight = cfg.getInt("Zombie Pigman anger range height", category, zombiePigmanAngerRangeHeight, zombiePigmanAngerRangeHeightMin, zombiePigmanAngerRangeHeightMax, "Zombie Pigman anger reaction range height in blocks up and down of the player.");
    	zombiePigmanAngerRangeRadius = cfg.getInt("Zombie Pigman anger range radius", category, zombiePigmanAngerRangeRadius, zombiePigmanAngerRangeRadiusMin, zombiePigmanAngerRangeRadiusMax, "Zombie Pigman anger reaction range square radius in blocks around the player.");
    	zombiePigmanAngerSilkTouch = cfg.getBoolean("Zombie Pigman anger silk touch", category, zombiePigmanAngerSilkTouch, "If ores are mined with a silk touch enchantment Zombie pigmen won't react.");
    	
    }

    //
    private static void initOresOreDictionaryConfig(ConfigEx cfg, String category) {
	
    	boolean setting = false;    	
    	for (OreDictionaryOtherData oD : OreDictionaryOtherData.values()) {
    		setting = cfg.getBoolean(oD.getName(), category, oD.getDefaultSetting(), "Add " + oD.getModItemDescName() + " from " + oD.getModDescName() + " to the Ore Dictionary." + oD.getConfigExtraDesc());
    		oD.setEnabled(setting);
		}
    	
    }
    
    //
    private static void initOresDropItems(ConfigEx cfg, String category) {

    	dropItems = cfg.getBoolean("Drop items", category, dropItems, "Drop items instead of blocks from mined ores. Metallic ores will try to drop dusts over ingots.");
    	dropItemsOverride = cfg.getBoolean("Drop items override", category, dropItemsOverride, "All ores will drop items ignoring per ore settings, drop items must be enabled or this will be ignored.");
   	
    }

    //
    private static void initOresDropItemsDropItemOres(ConfigEx cfg, String category) {
    	
    	boolean setting;
    	for (BlockData blockData : BlockData.values()) {
    		setting = cfg.getBlockProperty(blockData.getName(), category, blockData.getDropItems());
    		if (dropItems && dropItemsOverride) setting = true;
    		if (!(dropItems)) setting = false;
    		blockData.setDropItems(setting);
    	}
    	
	}
    
    //
    private static void initOresOreExplosionsConfig(ConfigEx cfg, String category) {

    	oreExplosion = cfg.getBoolean("Ore explosion", category, oreExplosion, "Enables the ability for ores to explode.");
    	oreExplosionChance = cfg.getDouble("Ore explosion chance", category, oreExplosionChance, oreExplosionChanceMin, oreExplosionChanceMax, "Ore explosion chance, 1 = all the time.");
    	oreExplosionFortune = cfg.getBoolean("Ore explosion fortune", category, oreExplosionFortune, "If ores are mined with a fortune enchantment their explosion chance is multiplied by the recipe multiplier. Only affects ores that are set to drop items.");
    	oreExplosionOverride = cfg.getBoolean("Ore explosion override", category, oreExplosionOverride, "All ores will explode ignoring per ore settings, ore explosions must be enabled or this will be ignored.");
    	oreExplosionSilkTouch = cfg.getBoolean("Ore explosion silk touch", category, oreExplosionSilkTouch, "If ores are mined with a silk touch enchantment they won't explode at all.");
    	oreExplosionStrength = cfg.getDouble("Ore explosion strength", category, oreExplosionStrength, oreExplosionStrengthMin, oreExplosionStrengthMax, "Ore explosion strength, 4 = TNT strength.");
   	
    }

    //
    private static void initOresOreExplosionOresConfig(ConfigEx cfg, String category) {

    	boolean setting;
    	for (BlockData blockData : BlockData.values()) {
    		setting = cfg.getBlockProperty(blockData.getName(), category, blockData.getOreExplosion());
    		if (oreExplosion && oreExplosionOverride) setting = true;
    		if (!(oreExplosion)) setting = false;
    		blockData.setOreExplosion(setting);
    	}
    	
	}
    
    //
    private static void initRecipesFurnaceToItemsConfig(ConfigEx cfg, String category) {
        
    	furnaceToItem = cfg.getBoolean("Furnace to item", category, furnaceToItem, "Enables the ability to furnace direct to items, recipe multiplier will control output count.");
    	furnaceToItemOverride = cfg.getBoolean("Furnace to item override", category, furnaceToItemOverride, "All ores will furnace direct to items ignoring per ore settings, furnace to item must be enabled or this will be ignored.");
		
    }
    
    //
    private static void initRecipesFurnaceToItemsFurnaceToItemOresConfig(ConfigEx cfg, String category) {
    	
    	boolean setting;
    	for (BlockData blockData : BlockData.values()) {
    		setting = cfg.getBlockProperty(blockData.getName(), category, blockData.getFurnaceRecipeToItem());
    		if (furnaceToItem && furnaceToItemOverride) setting = true;
    		if (!(furnaceToItem)) setting = false;
    		blockData.setFurnaceRecipeToItem(setting);
    	}
    	
	}
    
    //
    private static void initRecipesIntegrationConfig(ConfigEx cfg, String category) {

    	immersiveEngineeringRecipes = cfg.getBoolean("Immersive Engineering recipes", category, immersiveEngineeringRecipes, "Enable Immersive Engineering recipe integration.");
    	industrialCraft2Recipes = cfg.getBoolean("Industrial Craft 2 recipes", category, industrialCraft2Recipes, "Enable Industrial Craft 2 recipe integration.");
    	mekanismRecipes = cfg.getBoolean("Mekanism recipes", category, mekanismRecipes, "Enable Mekanism recipe integration.");
    	thermalExpansionRecipes = cfg.getBoolean("Thermal Expansion recipes", category, thermalExpansionRecipes, "Enable Thermal Expansion recipe integration.");
    	tinkersConstructRecipes = cfg.getBoolean("Tinkers' Construct recipes", category, tinkersConstructRecipes, "Enable Tinkers' Construct recipe integration.");
    	
    	vanillaCraftingRecipes = cfg.getBoolean("Vanilla crafting recipes", category, vanillaCraftingRecipes, "Enable crafting recipes to convert to oredict ores, only works with 1x recipe multiplier.");
		vanillaFurnaceRecipes = cfg.getBoolean("Vanilla furnace recipes", category, vanillaFurnaceRecipes, "Enable furnace recipes to smelt to oredict ores.");
    	
    }
    
    //
    private static void initRecipesIntegrationThermalExpansionConfig(ConfigEx cfg, String category) {
    	
    	inductionSmelterFullOutput = cfg.getBoolean("Induction Smelter full output", category, inductionSmelterFullOutput, "Enable full Induction Smelter output. Do not reduce output for augment compensation, uses much more energy.");
    	inductionSmelterFullOutputAmountFactor = cfg.getFloat("Induction Smelter full output amount factor", category, inductionSmelterFullOutputAmountFactor, outputFactorMin, fullOutputFactorMax, "Induction Smelter full output amount factor.");
    	inductionSmelterFullOutputEnergyFactor = cfg.getFloat("Induction Smelter full output energy factor", category, inductionSmelterFullOutputEnergyFactor, outputFactorMin, fullOutputFactorMax, "Induction Smelter full output energy factor.");    	
    	inductionSmelterReducedOutputAmountFactor = cfg.getFloat("Induction Smelter reduced output amount factor", category, inductionSmelterReducedOutputAmountFactor, outputFactorMin, reducedOutputFactorMax, "Induction Smelter reduced output amount factor.");
    	inductionSmelterReducedOutputEnergyFactor = cfg.getFloat("Induction Smelter reduced output energy factor", category, inductionSmelterReducedOutputEnergyFactor, outputFactorMin, reducedOutputFactorMax, "Induction Smelter reduced output energy factor.");
    	
    	pulverizerFullOutput = cfg.getBoolean("Pulverizer full output", category, pulverizerFullOutput, "Enable full Pulverizer output. Do not reduce output for augment compensation, uses much more energy.");
    	pulverizerFullOutputAmountFactor = cfg.getFloat("Pulverizer full output amount factor", category, pulverizerFullOutputAmountFactor, outputFactorMin, fullOutputFactorMax, "Pulverizer full output amount factor.");
    	pulverizerFullOutputEnergyFactor = cfg.getFloat("Pulverizer full output energy factor", category, pulverizerFullOutputEnergyFactor, outputFactorMin, fullOutputFactorMax, "Pulverizer full output energy factor.");    	
    	pulverizerReducedOutputAmountFactor = cfg.getFloat("Pulverizer reduced output amount factor", category, pulverizerReducedOutputAmountFactor, outputFactorMin, reducedOutputFactorMax, "Pulverizer reduced output amount factor.");
    	pulverizerReducedOutputEnergyFactor = cfg.getFloat("Pulverizer reduced output energy factor", category, pulverizerReducedOutputEnergyFactor, outputFactorMin, reducedOutputFactorMax, "Pulverizer reduced output energy factor.");
    	
    	redstoneFurnaceFullOutput = cfg.getBoolean("Redstone Furnace full output", category, redstoneFurnaceFullOutput, "Enable full Redstone Furnace output. Do not reduce output for augment compensation, uses much more energy.");
    	redstoneFurnaceFullOutputAmountFactor = cfg.getFloat("Redstone Furnace full output amount factor", category, redstoneFurnaceFullOutputAmountFactor, outputFactorMin, fullOutputFactorMax, "Redstone Furnace full output amount factor.");
    	redstoneFurnaceFullOutputEnergyFactor = cfg.getFloat("Redstone Furnace full output energy factor", category, redstoneFurnaceFullOutputEnergyFactor, outputFactorMin, fullOutputFactorMax, "Redstone Furnace full output energy factor.");    	
    	redstoneFurnaceReducedOutputAmountFactor = cfg.getFloat("Redstone Furnace reduced output amount factor", category, redstoneFurnaceReducedOutputAmountFactor, outputFactorMin, reducedOutputFactorMax, "Redstone Furnace reduced output amount factor.");
    	redstoneFurnaceReducedOutputEnergyFactor = cfg.getFloat("Redstone Furnace reduced output energy factor", category, redstoneFurnaceReducedOutputEnergyFactor, outputFactorMin, reducedOutputFactorMax, "Redstone Furnace reduced output energy factor.");
    	
    }
    
    //
    private static void initRecipesRecipeMultipliersConfig(ConfigEx cfg, String category) {
    	
    	recipeMultiplierOverride = cfg.getInt("Override Multipliers", category, recipeMultiplierOverride, recipeMultiplierOverrideMin, recipeMultiplierMax, "Change this setting to override all recipe multipliers, -1 means ignore.");
    	recipeMultiplierOverride = clamp(recipeMultiplierOverride, recipeMultiplierOverrideMin, recipeMultiplierMax);
    	
    }
    
    //
    private static void initRecipesRecipeMultipliersRecipeMultiplierOresConfig(ConfigEx cfg, String category) {
	
    	int setting;    	
    	for (BlockData blockData : BlockData.values()) {
    		setting = cfg.getBlockProperty(blockData.getName(), category, blockData.getRecipeMultiplier());
    		setting = clamp(setting, recipeMultiplierMin, recipeMultiplierMax);
    		if (recipeMultiplierOverride > recipeMultiplierOverrideMin) setting = clamp(recipeMultiplierOverride, recipeMultiplierMin, recipeMultiplierMax);
    		blockData.setRecipeMultiplier(setting);
		} 
    	
    }
    
}
