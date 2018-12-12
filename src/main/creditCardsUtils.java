package main;

public class creditCardsUtils {
	
	public static String mask(String ccNumber) {
		return "XXXXXXXXXXXX"+ccNumber.substring(ccNumber.length()-4);
	}

}
