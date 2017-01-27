package com.insurance.runner;

import java.util.Scanner;

import com.insurance.calculator.MotorcyclePrizeCalculator;
import com.insurance.entity.Customer;
import com.insurance.entity.Gender;
import com.insurance.entity.Insurance;
import com.insurance.entity.VehicleType;

public class Runner {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			Customer customer = new Customer();
			
			System.out.print("Customer Name: ");
			customer.setName(scanner.next());
			System.out.print("Customer Age: ");
			customer.setAge(scanner.nextInt());
			System.out.print("Customer Gender (M/F): ");
			String gender = scanner.next();
			
			while (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F") ) {
				System.out.print("Please provide a valid gender (M/F): ");
				gender = scanner.next();				
			}
			
			customer.setGender(getGender(gender));
			Insurance insurance = new Insurance(customer);
			
			while(true) {
				System.out.print("Vehicle Type is Car(1) Motorcycle(2): ");
				int vehicleType = scanner.nextInt();
				VehicleType type = VehicleType.values()[vehicleType - 1];
				
				System.out.print("Vehicle value: ");
				int vehiclePrice = scanner.nextInt();
				
				insurance.setVehiclePrice(vehiclePrice);
				insurance.setCalculator(type.getPrizeCalculator());
				
				System.out.print(insurance.generate());
				System.out.println();
				
			}
			
		}

	}

	private static Gender getGender(String gender) {
		return gender.equalsIgnoreCase("M") ? Gender.MALE: Gender.FEMALE;
	}

}
