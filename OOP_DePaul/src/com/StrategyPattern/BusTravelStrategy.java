package com.StrategyPattern;

public class BusTravelStrategy implements TravelStrategy {

	@Override
	public void gotoAirport() {
		System.out.println("Traveler is going to airport by Bus and will be charged $35.");
		
	}

}
