package com.StrategyPattern;

public class UpperCaseFormatter implements IStringFormatter {
	
	@Override
	public String formatString(String stringToFormat) {
		return stringToFormat.toUpperCase();
	}
}
