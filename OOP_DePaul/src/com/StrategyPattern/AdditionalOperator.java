package com.StrategyPattern;

public class AdditionalOperator implements IOperator {

	@Override
	public int calculate(int int1, int int2) {
		return int1 + int2;
	}
}