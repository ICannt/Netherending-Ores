package org.icannt.netherendingores.lib;

import org.apache.commons.lang3.text.WordUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.google.common.base.CaseFormat;

/**
 * Created by ICannt on 30/08/18.
 */
public class Util {
	
    public static final Logger LOG = LogManager.getLogger(Info.MOD_NAME);
    
    public static void LogRecipeSuccess(String device, String input, String output) {
    	LOG.trace("Registered " + device + " input for \"" + input + "\", output \"" + output + "\".");
    }

    public static void LogRecipeFail(String device, String input, String output) {
    	LOG.info("Unable to register " + device + " input for \"" + input + "\", output \"" + output + "\" not found.");
    }

    public static void LogOreDict(String input, String output) {
    	LOG.trace("Ore Dictionary entry for \"" + input + "\" added for " + output);
    }
    
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
