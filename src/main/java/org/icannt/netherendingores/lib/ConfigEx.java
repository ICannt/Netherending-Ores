package org.icannt.netherendingores.lib;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

/**
 * Created by ICannt on 07/09/19.
 */

public class ConfigEx extends Configuration {

	public ConfigEx(File file, String cfgVersion) {
		super(file, cfgVersion);
	}
	
    /**
     * Creates a double property.
     *
     * @param name Name of the property.
     * @param category Category of the property.
     * @param defaultValue Default value of the property.
     * @param minValue Minimum value of the property.
     * @param maxValue Maximum value of the property.
     * @param comment A brief description what the property does.
     * @return The value of the new double property.
     */
	public double getDouble(String name, String category, double defaultValue, double minValue, double maxValue, String comment) {
		comment += " [range: " + minValue + " ~ " + maxValue + ", default: " + defaultValue + "]";
		return get(category, name, defaultValue, comment, minValue, maxValue).getDouble();
	}
	
    /**
     * Creates a block property. Integer version.
     *
     * @param name Name of the property.
     * @param category Category of the property.
     * @param defaultValue Default value of the property.
     * @return The value of the new block property.
     */
	public int getBlockProperty(String name, String category, int defaultValue) {
		return get(category, StringUtil.spaceCapital(name), defaultValue).getInt();
	}
	
    /**
     * Creates a block property. Boolean version.
     *
     * @param name Name of the property.
     * @param category Category of the property.
     * @param defaultValue Default value of the property.
     * @return The value of the new block property.
     */
	public boolean getBlockProperty(String name, String category, boolean defaultValue) {
		return get(category, StringUtil.spaceCapital(name), defaultValue).getBoolean();
	}
	
    /**
     * Creates a block property. String version.
     *
     * @param name Name of the property.
     * @param category Category of the property.
     * @param defaultValue Default value of the property.
     * @return The value of the new block property.
     */
	public String getBlockProperty(String name, String category, String defaultValue) {
		return get(category, StringUtil.spaceCapital(name), defaultValue).getString();
	}


}
