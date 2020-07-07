package com.StrategyPattern;

public class DebitCardPaymentStrategy implements PaymentStrategy{

	@Override
	public void pay(String amount) {
		System.out.println("Customer pays the money " + amount + "Rs. using debit card.");
		
	}

}
