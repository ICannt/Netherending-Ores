package org.icannt.netherendingores.lib;

import org.apache.commons.lang3.text.WordUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.icannt.netherendingores.NetherendingOres;

import com.google.common.base.CaseFormat;

/**
 * Created by ICannt on 30/08/18.
 */
public class Util {
	
    public static final Logger LOG = LogManager.getLogger(NetherendingOres.MOD_NAME);
	
	public static String LowerUnder(String input)
	{
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, input);
	}
	
	public static String ColonUnder(String input)
	{
		return input.replace(":", "_");
	}
	
	public static String SpaceCapital(String input) {
		return WordUtils.capitalize(input.replace("_", " "));
	}
	
	public static String UpperCamel(String input)
	{
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, input);
	}
	
 
    
}
