package com.StrategyPattern;

public class TaxiTravelStrategy implements TravelStrategy {
	
	@Override
	public void gotoAirport() {
		System.out.println("Traveler is going to airport by Taxi and will be charged $100.");
		
	}
}
