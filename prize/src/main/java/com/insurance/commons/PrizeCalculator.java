package com.insurance.commons;

import com.insurance.entity.Customer;

public interface PrizeCalculator {
	
	public double calculate(Customer customer, double vehiclePrice);

}
