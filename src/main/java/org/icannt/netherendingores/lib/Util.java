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
    
	public static String[] LOG_RECIPE_MSG = { "", "", "" };
	
	/**
	 * Receives log message data from recipe handlers
	 * 
	 * @param       device The device that the recipe is for e.g. Pulverizer
	 * @param       input Device input from a block in this mod
	 * @param       output Device output could be a block or an item
	 */
	public static void logRecipeMsg(String device, String input, String output) {
		LOG_RECIPE_MSG[0] = device;
		LOG_RECIPE_MSG[1] = input;
		LOG_RECIPE_MSG[2] = output;
	}

	//
    public static void logRecipeSuccess() {
    	logRecipeSuccess(LOG_RECIPE_MSG[0], LOG_RECIPE_MSG[1], LOG_RECIPE_MSG[2]);
    }

    //
    public static void logRecipeFail() {
    	logRecipeFail(LOG_RECIPE_MSG[0], LOG_RECIPE_MSG[1], LOG_RECIPE_MSG[2]);
    }
    
    //
    public static void logRecipeSuccess(String device, String input, String output) {
    	LOG.trace("Registered " + device + " input for \"" + input + "\", output \"" + output + "\".");
    }

    //
    public static void logRecipeFail(String device, String input, String output) {
    	LOG.info("Unable to register " + device + " input for \"" + input + "\", output \"" + output + "\" not found.");
    }

    //
    public static void logOreDict(String input, String output) {
    	LOG.trace("Ore Dictionary entry for \"" + input + "\" added for " + output);
    }
    
    //
	public static String lowerUnder(String input)
	{
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, input);
	}
	
	//
	public static String colonUnder(String input)
	{
		return input.replace(":", "_");
	}
	
	//
	public static String spaceCapital(String input) {
		return WordUtils.capitalize(input.replace("_", " "));
	}
	
	//
	public static String upperCamel(String input)
	{
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, input);
	}
	
 
    
}
