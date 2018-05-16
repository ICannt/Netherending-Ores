package org.icannt.netherendingores.lib;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;

/**
 * Created by ICannt on 25/08/18.
 */
public class Config {

	public static Boolean fullRedstoneFurnaceOutput = false;
	public static Boolean fullPulverizerOutput = false;
	
	private static final String CATEGORY_MACHINES = "machine recipe settings";
	private static final String CATEGORY_RECIPE_MULTIPLIER_OVERRIDE = "recipe override";
	private static final String CATEGORY_RECIPE_MULTIPLIER = "recipe multipliers";
	
	private static int override = -1;
	private static int minMult = 0;
	private static int maxMult = 3;
	    
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initMachineRecipeSettingsConfig(cfg);
            initRecipeMultiplierConfig(cfg);
            initRecipeMultiplierOverrideConfig(cfg);
        } catch (Exception e1) {
            Util.LOG.error("Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }
    
    private static void initMachineRecipeSettingsConfig(Configuration cfg) {
    	cfg.addCustomCategoryComment(CATEGORY_MACHINES, "Settings for specific machines");
    	fullRedstoneFurnaceOutput = cfg.getBoolean("Full Redstone Furnace output", CATEGORY_MACHINES, fullRedstoneFurnaceOutput, 
    			"Enable full Redstone Furnace output. Do not reduce output for augment compensation, uses much more energy");
    	fullPulverizerOutput = cfg.getBoolean("Full Pulverizer output", CATEGORY_MACHINES, false, 
    			"Enable full Pulverizer output. Do not reduce output for augment compensation, uses much more energy");
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
