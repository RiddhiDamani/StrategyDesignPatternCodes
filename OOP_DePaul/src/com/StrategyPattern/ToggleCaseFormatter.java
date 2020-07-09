package com.StrategyPattern;

public class ToggleCaseFormatter implements IStringFormatter {

	@Override
	public String formatString(String stringToFormat) {
		char[] chars = stringToFormat.toCharArray();
		boolean upperCase = true;
		
		StringBuilder sb = new StringBuilder();
		for(char character : chars) {
			sb.append(upperCase ? Character.toUpperCase(character) : Character.toLowerCase(character));
			upperCase = !upperCase;
		}
		
		return sb.toString();
	}
	
}
