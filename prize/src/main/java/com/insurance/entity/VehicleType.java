package com.insurance.entity;

import com.insurance.calculator.CarPrizeCalculator;
import com.insurance.calculator.MotorcyclePrizeCalculator;
import com.insurance.commons.PrizeCalculator;

public enum VehicleType {

	CAR {
		@Override
		public PrizeCalculator getPrizeCalculator() {
			return new CarPrizeCalculator();
		}
	},
	
	MOTORCYCLE {
		@Override
		public PrizeCalculator getPrizeCalculator() {
			return new MotorcyclePrizeCalculator();
		}
	};

	public abstract PrizeCalculator getPrizeCalculator();

}
