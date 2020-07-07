package com.StrategyPattern;

import java.util.Scanner;

public class TravelerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter Travel Type: 'Bus' or 'Auto' or 'Taxi'");
		Scanner scanner = new Scanner(System.in);
		String travelType = scanner .next();
		
		System.out.println("Travel type is: " +travelType);
		
		TravelContext ctx = null;
		ctx = new TravelContext();
		
		//Here client has chosen Bus based on bus travel strategy and based on travel context i.e. bus travel strategy context
		// ctx calls the gotoAirport method!
		
		if("Bus".equalsIgnoreCase(travelType)) {
			ctx.setTravelStrategy(new BusTravelStrategy());
		}
		else if("Auto".equalsIgnoreCase(travelType)) {
			ctx.setTravelStrategy(new AutoTravelStrategy());
		}
		else if("Taxi".equalsIgnoreCase(travelType)) {
			ctx.setTravelStrategy(new TaxiTravelStrategy());
		}
		System.out.println("Travel Context has: "+ ctx.getTravelStrategy().toString());		
		ctx.gotoAirport();
	}

}
