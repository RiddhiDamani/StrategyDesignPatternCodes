package com.StrategyPattern;

import java.util.Scanner;

public class SearchStrategyClient {

	public static void main(String[] args) {
		
		System.out.println("Please enter Search Algorithm: 'Linear' or 'Binary'");
		Scanner scanner = new Scanner(System.in);
		String searchAlgo = scanner.next();
		System.out.println("Search Algorithm is: " + searchAlgo);
		
		System.out.println("Please enter number to be searched: ");
		Scanner scanner1 = new Scanner(System.in);
		int elementToSearch = scanner1.nextInt();
		System.out.println("ElementToSearch is: " + elementToSearch);

		SearchContext context = new SearchContext();
		
		
		if("Linear".equalsIgnoreCase(searchAlgo)) {
			context.setSearchStrategy(new LinearSearch());
		}
		else if("Binary".equalsIgnoreCase(searchAlgo)) {
			context.setSearchStrategy(new BinarySearch());
		}
		
		int[] sortedList = { 1, 2, 3, 4, 5, 6, 7, 8};
		
		int position = context.search(sortedList, elementToSearch);
		
		System.out.println("Position of the element is: " + position);
		
	}

}
