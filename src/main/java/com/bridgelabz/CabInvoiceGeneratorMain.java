package com.bridgelabz;
 
public class CabInvoiceGeneratorMain {
	private static final double MIN_COST_PER_KM = 10;
	private static final int MIN_COST_PER_MINUTE = 1;
	private static final double MIN_CAB_FARE = 5;


	public double totalFare(double distance, int time) {
		double fare = distance *MIN_COST_PER_KM + time * MIN_COST_PER_MINUTE;
		double totalCabFare = Math.max(MIN_CAB_FARE, fare);
		return totalCabFare;
	}

}