package org.icannt.netherendingores;

import org.icannt.netherendingores.common.block.metadata.EnumOreEndModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndVanillaType;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherVanillaType;
import org.icannt.netherendingores.common.block.metadata.EnumOreOther1Type;
import org.icannt.netherendingores.proxies.CommonProxy;

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
            NetherendingOres.LOGGER.error("Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }
    
    private static void initRecipeMultiplierConfig(Configuration cfg) {
    	
    	cfg.addCustomCategoryComment(CATEGORY_RECIPE_MULTIPLIER, "0 = no recipes/oredict; 1 = craft ores that have item drops; 2&3 = smelt to 2x/3x oredict ore");
    	
    	int multiplier = 0;
    	int minMult = 0;
    	int maxMult = 3;
    	
		for (EnumOreNetherVanillaType variant : EnumOreNetherVanillaType.values()) {
    		multiplier = cfg.getInt(Util.SpaceCapital(variant.getRecipeRegistryName()), CATEGORY_RECIPE_MULTIPLIER, variant.getDefaultRecipeMultiplier(), minMult, maxMult, Util.SpaceCapital(variant.getRecipeRegistryName()));
    		multiplier = Math.min(maxMult, Math.max(minMult, multiplier));
    		variant.setRecipeMultiplier(multiplier);
		}
		
    	for (EnumOreNetherModded1Type variant : EnumOreNetherModded1Type.values()) {
    		multiplier = cfg.getInt(Util.SpaceCapital(variant.getRecipeRegistryName()), CATEGORY_RECIPE_MULTIPLIER, variant.getDefaultRecipeMultiplier(), minMult, maxMult, Util.SpaceCapital(variant.getRecipeRegistryName()));
    		multiplier = Math.min(maxMult, Math.max(minMult, multiplier));
    		variant.setRecipeMultiplier(multiplier);
    	}
    	
    	for (EnumOreEndVanillaType variant : EnumOreEndVanillaType.values()) {
    		multiplier = cfg.getInt(Util.SpaceCapital(variant.getRecipeRegistryName()), CATEGORY_RECIPE_MULTIPLIER, variant.getDefaultRecipeMultiplier(), minMult, maxMult, Util.SpaceCapital(variant.getRecipeRegistryName()));
    		multiplier = Math.min(maxMult, Math.max(minMult, multiplier));
    		variant.setRecipeMultiplier(multiplier);
    	}
    	
    	for (EnumOreEndModded1Type variant : EnumOreEndModded1Type.values()) {
    		multiplier = cfg.getInt(Util.SpaceCapital(variant.getRecipeRegistryName()), CATEGORY_RECIPE_MULTIPLIER, variant.getDefaultRecipeMultiplier(), minMult, maxMult, Util.SpaceCapital(variant.getRecipeRegistryName()));
    		multiplier = Math.min(maxMult, Math.max(minMult, multiplier));
    		variant.setRecipeMultiplier(multiplier);
    	}
    	
    	for (EnumOreOther1Type variant : EnumOreOther1Type.values()) {
    		multiplier = cfg.getInt(Util.SpaceCapital(variant.getRecipeRegistryName()), CATEGORY_RECIPE_MULTIPLIER, variant.getDefaultRecipeMultiplier(), minMult, maxMult, Util.SpaceCapital(variant.getRecipeRegistryName()));
    		multiplier = Math.min(maxMult, Math.max(minMult, multiplier));
    		variant.setRecipeMultiplier(multiplier);
    	}
    	
    }

}
