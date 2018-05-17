package org.icannt.netherendingores.lib;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;

/**
 * Created by ICannt on 25/08/18.
 */
public class Config {

	public static Boolean rf1FullRedstoneFurnaceOutput = false;
	public static float rf3FullRedstoneFurnaceEnergyFactor = 1f;
	public static float rf2FullRedstoneFurnaceAmountFactor = 1f;
	public static float rf5ReducedRedstoneFurnaceEnergyFactor = 2/3f;
	public static float rf4ReducedRedstoneFurnaceAmountFactor = 2/3f;
	
	public static Boolean p1FullPulverizerOutput = false;
	public static float p3FullPulverizerEnergyFactor = 1f;
	public static float p2FullPulverizerAmountFactor = 1f;
	public static float p5ReducedPulverizerEnergyFactor = 2/3f;
	public static float p4ReducedPulverizerAmountFactor = 2/3f;
	
	private static final String CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING = "machine recipe settings";
	private static final String CATEGORY_RECIPE_MULTIPLIER_OVERRIDE = "recipe override";
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
    	
    	cfg.addCustomCategoryComment(CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, "Settings for Thermal Expansion Machine Processing");

    	p1FullPulverizerOutput = cfg.getBoolean("Full Pulverizer output", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, p1FullPulverizerOutput, "Enable full Pulverizer output. Do not reduce output for augment compensation, uses much more energy", "");
    	p2FullPulverizerAmountFactor = cfg.getFloat("Full Pulverizer amount factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, p2FullPulverizerAmountFactor, 0.5f, 3, "Full Pulverizer amount factor");
    	p3FullPulverizerEnergyFactor = cfg.getFloat("Full Pulverizer anergy factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, p3FullPulverizerEnergyFactor, 0.5f, 3, "Full Pulverizer anergy factor");    	
    	p4ReducedPulverizerAmountFactor = cfg.getFloat("Reduced Pulverizer amount factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, p4ReducedPulverizerAmountFactor, 0.5f, 1, "Reduced Pulverizer amount factor");
    	p5ReducedPulverizerEnergyFactor = cfg.getFloat("Reduced Pulverizer energy factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, p5ReducedPulverizerEnergyFactor, 0.5f, 1, "Reduced Pulverizer energy factor");
    	
    	rf1FullRedstoneFurnaceOutput = cfg.getBoolean("Full Redstone Furnace output", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, rf1FullRedstoneFurnaceOutput, "Enable full Redstone Furnace output. Do not reduce output for augment compensation, uses much more energy");
    	rf2FullRedstoneFurnaceAmountFactor = cfg.getFloat("Full Redstone Furnace amount factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, rf2FullRedstoneFurnaceAmountFactor, 0.5f, 3, "Full Redstone Furnace amount factor");
    	rf3FullRedstoneFurnaceEnergyFactor = cfg.getFloat("Full Redstone Furnace energy factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, rf3FullRedstoneFurnaceEnergyFactor, 0.5f, 3, "Full Redstone Furnace energy factor");    	
    	rf4ReducedRedstoneFurnaceAmountFactor = cfg.getFloat("Reduced Redstone Furnace amount factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, rf4ReducedRedstoneFurnaceAmountFactor, 0.5f, 1, "Reduced Redstone Furnace amount factor");
    	rf5ReducedRedstoneFurnaceEnergyFactor = cfg.getFloat("Reduced Redstone Furnace energy factor", CATEGORY_THERMAL_EXPANSION_MACHINE_PROCESSING, rf5ReducedRedstoneFurnaceEnergyFactor, 0.5f, 1, "Reduced Redstone Furnace energy factor");
    	
    }
    
    
    private static void initRecipeMultiplierConfig(Configuration cfg) {
    	
    	cfg.addCustomCategoryComment(CATEGORY_RECIPE_MULTIPLIER, "0 = no recipes/oredict; 1 = craft ores that have item drops; 2&3 = smelt to 2x/3x oredict ore");    	
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
    	
    	override = cfg.getInt("Override multipliers", CATEGORY_RECIPE_MULTIPLIER_OVERRIDE, -1, -1, maxMult, "Change this setting to override all recipe multipliers");
    	
    }

}
