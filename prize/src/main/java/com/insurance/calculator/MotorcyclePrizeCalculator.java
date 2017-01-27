package com.insurance.calculator;

import com.insurance.commons.PrizeCalculator;
import com.insurance.entity.Customer;

public class MotorcyclePrizeCalculator implements PrizeCalculator {
	
	private static final double PERCENTAGE = 0.3;

	public double calculate(Customer customer, double vehiclePrice) {
		 return vehiclePrice * PERCENTAGE;
	}

}
