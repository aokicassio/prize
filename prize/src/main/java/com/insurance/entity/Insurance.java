package com.insurance.entity;

import com.insurance.commons.PrizeCalculator;

public class Insurance {
	
	private Customer customer;
	
	private int vehiclePrice;
	
	private PrizeCalculator calculator;
	
	public Insurance(Customer customer) {
		this.customer = customer;
	}

	public String generate(){
		return "Your prize is $" + calculator.calculate(customer, vehiclePrice);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getVehiclePrice() {
		return vehiclePrice;
	}

	public void setVehiclePrice(int vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}

	public PrizeCalculator getCalculator() {
		return calculator;
	}

	public void setCalculator(PrizeCalculator calculator) {
		this.calculator = calculator;
	}

}
