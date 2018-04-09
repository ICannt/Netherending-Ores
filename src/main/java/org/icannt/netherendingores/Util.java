package org.icannt.netherendingores;

import org.apache.commons.lang3.text.WordUtils;

import com.google.common.base.CaseFormat;

/**
 * Created by ICannt on 30/08/18.
 */
public class Util {
	
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
	
    public static String getOreDictName(String name, int multiplier) {
    	
    	String prefix = "";
    	String ore = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, getRawOreName(name));
    	
    	switch (multiplier) {
			case 1:	prefix = "ore"; break;
			case 2:	prefix = "oreNether"; break;
			case 3: prefix = "denseore";
    	}
    	
    	return prefix + ore;
    }
    
    public static String getOreDictItemName(String prefix, String name) {
    	   	
    	String ore = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, getRawOreName(name));
    	
    	switch (prefix) {
			case "": prefix = "dust"; break;
			case "gem": break;
			default:
				prefix = "";
				ore = getRawOreName(name);
    	}
    	
    	return prefix + ore;    	
    }
	
    public static String getRawOreName(String name) {
    	
    	String[] words = {"_ore","overworld_","nether_","end_"};
    	
    	for(String word : words) {
    		name = name.replace(word, "");
    	}    	
    	
    	return name;
    }    
    
}
