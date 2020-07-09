package com.StrategyPattern;

public class StringPrinter {
	
	private String printString;
	
	StringPrinter(String printString) {
		this.printString = printString;
	}

	public void print(IStringFormatter stringFormatter) {
		System.out.println(stringFormatter.formatString(printString));
	}
}
