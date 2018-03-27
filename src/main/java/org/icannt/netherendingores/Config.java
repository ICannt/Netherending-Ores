package org.icannt.netherendingores;

import org.apache.logging.log4j.Level;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndModded1Type;
import org.icannt.netherendingores.proxies.CommonProxy;

import net.minecraftforge.common.config.Configuration;

public class Config {

	private static final String CATEGORY_RECIPE_MULTIPLIER = "recipe multipliers";
	private static final String CATEGORY_VERSION = "config version";
    
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initRecipeMultiplierConfig(cfg);
            initVersionConfig(cfg);
        } catch (Exception e1) {
            NetherendingOres.LOGGER.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }
    
    private static void initRecipeMultiplierConfig(Configuration cfg) {
    	cfg.addCustomCategoryComment(CATEGORY_RECIPE_MULTIPLIER, "0 = no furnace recipe/oredict; 1 = smelt to oredict ingot; 2&3 = smelt to 2x/3x oredict ore");
    	int multiplier = 0;
    	for (EnumOreEndModded1Type variant : EnumOreEndModded1Type.values()) {
    		multiplier = cfg.getInt(variant.getName(), CATEGORY_RECIPE_MULTIPLIER, variant.getDefaultRecipeMultiplier(), 0, 3, variant.getName());
    		variant.setRecipeMultiplier(multiplier);
    	}
    }
    
    private static void initVersionConfig(Configuration cfg) {
    	//cfg.addCustomCategoryComment(CATEGORY_VERSION, "Netherending Ores mod version");
    	// Find some way to control version?
    }
}
