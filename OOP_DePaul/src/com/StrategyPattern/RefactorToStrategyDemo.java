package com.StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RefactorToStrategyDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text to convert");
		String arg = br.readLine();
		System.out.println("Enter type of Conversion");
		String input;
		
		StringPrinter printer = new StringPrinter(arg);
		while(!(input = br.readLine()).toLowerCase().equals("exit")) {
			IStringFormatter formatter;
			
			switch(input.toLowerCase()) {
			case "lowercase":
				formatter = new LowerCaseFormatter();
				break;
			case "uppercase":
				formatter = new UpperCaseFormatter();
				break;
			case "togglecase":
				formatter = new ToggleCaseFormatter();
				break;
			default:
				continue;
			}
			
			printer.print(formatter);
		}

	}

}
