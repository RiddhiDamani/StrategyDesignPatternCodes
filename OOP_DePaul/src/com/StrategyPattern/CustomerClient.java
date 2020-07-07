package com.StrategyPattern;

import java.util.Scanner;

public class CustomerClient {

	public static void main(String[] args) {
		
		System.out.println("Please enter payment tu=ype : 'Credit Card' or 'Debit Card' or 'ByCash'");
		Scanner scanner = new Scanner(System.in);
		String paymentType = scanner.next();
		System.out.println("Payment type is: " + paymentType);
		
		System.out.println("Please enter amount to pay: ");
		Scanner scanner1 = new Scanner(System.in);
		String amount = scanner1.next();
		System.out.println("Amount is: " + amount);
		
		PaymentContext ctx = null;
		ctx = new PaymentContext();
		
		if("CreditCard".equalsIgnoreCase(paymentType)) {
			ctx.setPaymentStrategy(new CreditCardPaymentStrategy());
		}
		else if("DebitCard".equalsIgnoreCase(paymentType)) {
			ctx.setPaymentStrategy(new DebitCardPaymentStrategy());
		}
		else if("ByCash".equalsIgnoreCase(paymentType)) {
			ctx.setPaymentStrategy(new ByCashPaymentStrategy());
		}
		
		System.out.println("Payment Context has: " + ctx.getPaymentStrategy());
		ctx.pay(amount);
	}

}
