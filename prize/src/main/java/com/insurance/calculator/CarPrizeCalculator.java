package com.insurance.calculator;

import com.insurance.commons.PrizeCalculator;
import com.insurance.entity.Customer;

public class CarPrizeCalculator implements PrizeCalculator {
	
	private static final double PERCENTAGE = 0.5;

	public double calculate(Customer customer, double vehiclePrice) {
		
		return vehiclePrice * PERCENTAGE;
	}

}
