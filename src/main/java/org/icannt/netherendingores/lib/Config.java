package org.icannt.netherendingores.lib;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;

/**
 * Created by ICannt on 25/08/18.
 */
public class Config {

	public static Boolean redstoneFurnaceFullOutput = false;
	public static float redstoneFurnaceFullOutputAmountFactor = 1f;
	public static float redstoneFurnaceFullOutputEnergyFactor = 2f;
	public static float redstoneFurnaceReducedOutputAmountFactor = 2/3f;
	public static float redstoneFurnaceReducedOutputEnergyFactor = 0.6f;
	
	public static Boolean pulverizerFullOutput = false;
	public static float pulverizerFullOutputAmountFactor = 1f;
	public static float pulverizerFullOutputEnergyFactor = 2f;
	public static float pulverizerReducedOutputAmountFactor = 2/3f;
	public static float pulverizerReducedOutputEnergyFactor = 0.6f;
	
	private static final String CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING = "machine recipe settings";
	private static final String CATEGORY_RECIPE_MULTIPLIER_OVERRIDE = "recipe multipliers override";
	private static final String CATEGORY_RECIPE_MULTIPLIER = "recipe multipliers";
	
	private static int override = -1;
	private static int minMult = 0;
	private static int maxMult = 3;
	
	    
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            // Load order is different so the override will load first, the config sorter will change the position anyway.
            initMachineRecipeSettingsConfig(cfg);
            initRecipeMultiplierOverrideConfig(cfg);
            initRecipeMultiplierConfig(cfg);
        } catch (Exception e1) {
            Util.LOG.error("Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }
    
    
    private static void initMachineRecipeSettingsConfig(Configuration cfg) {
    	
    	cfg.addCustomCategoryComment(CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, "" 
    			+ "Settings for Thermal Expansion machine processing\r\n"
    			+ "PLEASE ASK THE MOD AUTHOR TRAB FOR HELP IF YOU DON'T KNOW WHAT YOU ARE DOING");   	
    	
    	pulverizerFullOutput = cfg.getBoolean("Pulverizer full output", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, pulverizerFullOutput, "Enable full Pulverizer output. Do not reduce output for augment compensation, uses much more energy.");
    	pulverizerFullOutputAmountFactor = cfg.getFloat("Pulverizer full output amount factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, pulverizerFullOutputAmountFactor, 0.5f, 3, "Pulverizer full output amount factor.");
    	pulverizerFullOutputEnergyFactor = cfg.getFloat("Pulverizer full output energy factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, pulverizerFullOutputEnergyFactor, 0.5f, 3, "Pulverizer full output energy factor.");    	
    	pulverizerReducedOutputAmountFactor = cfg.getFloat("Pulverizer reduced output amount factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, pulverizerReducedOutputAmountFactor, 0.5f, 1, "Pulverizer reduced output amount factor.");
    	pulverizerReducedOutputEnergyFactor = cfg.getFloat("Pulverizer reduced output energy factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, pulverizerReducedOutputEnergyFactor, 0.5f, 1, "Pulverizer reduced output energy factor.");
    	
    	redstoneFurnaceFullOutput = cfg.getBoolean("Redstone Furnace full output", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, redstoneFurnaceFullOutput, "Enable full Redstone Furnace output. Do not reduce output for augment compensation, uses much more energy.");
    	redstoneFurnaceFullOutputAmountFactor = cfg.getFloat("Redstone Furnace full output amount factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, redstoneFurnaceFullOutputAmountFactor, 0.5f, 3, "Redstone Furnace full output amount factor.");
    	redstoneFurnaceFullOutputEnergyFactor = cfg.getFloat("Redstone Furnace full output energy factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, redstoneFurnaceFullOutputEnergyFactor, 0.5f, 3, "Redstone Furnace full output energy factor.");    	
    	redstoneFurnaceReducedOutputAmountFactor = cfg.getFloat("Redstone Furnace reduced output amount factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, redstoneFurnaceReducedOutputAmountFactor, 0.5f, 1, "Redstone Furnace reduced output amount factor.");
    	redstoneFurnaceReducedOutputEnergyFactor = cfg.getFloat("Redstone Furnace reduced output energy factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, redstoneFurnaceReducedOutputEnergyFactor, 0.5f, 1, "Redstone Furnace reduced output energy factor.");
    	
    }
    
    
    private static void initRecipeMultiplierConfig(Configuration cfg) {
    	
    	cfg.addCustomCategoryComment(CATEGORY_RECIPE_MULTIPLIER, ""
    			+ "0 = No recipes/standard oredict, ideal for craftweaker.\r\n"
    			+ "    Oredict entries prefixed with \"neo\" for easy craftteaker use.\r\n"
    			+ "1 = Oredict mode uses the same oredict name as the target ore, also adds recipe to craft target ore if needed.\r\n"
    			+ "2 = Crush to dust at 2x rate with mod specific bonuses | Smelt to 2x oredict ore.\r\n"
    			+ "    Oredict entries prefixed with \"oreEnd\", \"oreNether\" or \"oreOverworld\" respectively.\r\n"
    			+ "3 = Crush to 4x oredict ore | Smelt to 3x oredict ore.\r\n"
    			+ "    Oredict entries prefixed with \"oreDenseEnd\", \"oreDenseNether\" or \"oreDenseOverworld\" respectively.\r\n");
    	int multiplier = 0;
    	
    	for (BlockRecipeData blockData : BlockRecipeData.values()) {
    		multiplier = cfg.get(CATEGORY_RECIPE_MULTIPLIER, Util.SpaceCapital(blockData.getName()), blockData.getDefaultRecipeMultiplier()).getInt();
    		multiplier = Math.min(maxMult, Math.max(minMult, multiplier));
    		if (override > -1) {
    			multiplier = Math.min(maxMult, Math.max(minMult, override));
    		}
    		blockData.setRecipeMultiplier(multiplier);
		} 
    	
    }
    
    
    private static void initRecipeMultiplierOverrideConfig(Configuration cfg) {
    	
    	override = cfg.getInt("Override Multipliers", CATEGORY_RECIPE_MULTIPLIER_OVERRIDE, -1, -1, maxMult, "Change this setting to override all recipe multipliers, -1 means ignore.");
    	override = Math.min(maxMult, Math.max(-1, override));
    	
    }

}
