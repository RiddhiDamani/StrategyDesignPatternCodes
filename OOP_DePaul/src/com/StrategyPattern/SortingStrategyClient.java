package com.StrategyPattern;

import java.util.Scanner;

public class SortingStrategyClient {

	public static void main(String[] args) {
		
		System.out.println("Please enter sorting algorithm: 'Bubble Sort' or 'Insertion Sort' or 'Selection Sort'");
		Scanner scanner = new Scanner(System.in);
		String sortAlgo = scanner.next();
		System.out.println("Sort Algorithm is: " + sortAlgo);
		
		SortContext ctx = new SortContext(); 
		
		if("BubbleSort".equalsIgnoreCase(sortAlgo)) {
			// Setting specific strategy to context
			ctx.setSortingStrategy(new BubbleSort());
		}
		else if("SelectionSort".equalsIgnoreCase(sortAlgo)) {
			ctx.setSortingStrategy(new SelectionSort());
		}
		else if("InsertionSort".equalsIgnoreCase(sortAlgo)) {
			ctx.setSortingStrategy(new InsertionSort());
		}
		
		ctx.sort();
	}

}
