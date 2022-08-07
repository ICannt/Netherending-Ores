package org.icannt.netherendingores.lib;

import java.util.Locale;

import com.google.common.base.CaseFormat;
import com.ibm.icu.lang.UCharacter;

/**
 * -
 */

public class NeoString {

	private static final Locale locale = Locale.ENGLISH;

	//
	public static String lowerUnder(String input) {
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, input);
	}

	//
	public static String colonUnder(String input) {
		return input.replace(":", "_");
	}

	//
	public static String upperCamel(String input) {
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, input);
	}

	public static String toLower(String input) {
		return input.toLowerCase(locale);
	}

	public static String toUpper(String input) {
		return input.toUpperCase(locale);
	}

	public static String toTitleSpaced(String input) {
		return UCharacter.toTitleCase(locale, input.replace("_", " "), null);
	}

}
