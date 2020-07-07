package com.StrategyPattern;

public class LinearSearch implements SearchStrategy {

	@Override
	public int search(int[] list, int elementToSearch) {
		
		int position = 0;
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] == elementToSearch) {
				position = i;
				break;
			}
		}
		
		System.out.println("Position of the elementt has been found using Linear Search");
		return position;
	}

}
