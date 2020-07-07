package com.StrategyPattern;

public class ByCashPaymentStrategy implements PaymentStrategy{

	@Override
	public void pay(String amount) {
		System.out.println("Customer pays the money " + amount + "Rs. as a Cash.");
		
	}

}
