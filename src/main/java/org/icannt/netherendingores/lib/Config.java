package org.icannt.netherendingores.lib;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;

/**
 * Created by ICannt on 25/08/18.
 */
public class Config {

	private static final String CATEGORY_RECIPE_MULTIPLIER = "recipe multipliers";
    
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initRecipeMultiplierConfig(cfg);
        } catch (Exception e1) {
            Util.LOG.error("Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }
    
    private static void initRecipeMultiplierConfig(Configuration cfg) {    	
    	cfg.addCustomCategoryComment(CATEGORY_RECIPE_MULTIPLIER, "0 = no recipes/oredict; 1 = craft ores that have item drops; 2&3 = smelt to 2x/3x oredict ore");
    	// TODO: Integrate a proper override in the config file, some users might make use of it.
    	int override = 2;
    	int multiplier = 0;
    	int minMult = 0;
    	int maxMult = 3;
    	for (BlockRecipeData blockData : BlockRecipeData.values()) {
    		multiplier = cfg.getInt(Util.SpaceCapital(blockData.getName()), CATEGORY_RECIPE_MULTIPLIER, blockData.getDefaultRecipeMultiplier(), minMult, maxMult, Util.SpaceCapital(blockData.getName()));
    		multiplier = Math.min(maxMult, Math.max(minMult, multiplier));
    		if (override > -1) {
    			multiplier = Math.min(maxMult, Math.max(minMult, override));
    		}
    		blockData.setRecipeMultiplier(multiplier);
		}    	
    }

}
