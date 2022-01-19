package com.bridgelabz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	
	@Test
	public void whenDistanceAndTimeGiven_ShouldReturnTotalFare() {
		CabInvoiceGeneratorMain generator = new CabInvoiceGeneratorMain();
		double distance=1;
		int time = 6;
		double fare = generator.totalFare(distance,time);
		assertEquals(16,fare,0.0);
	}
	@Test
	public void whenDistanceAndTimeGiven_WhenTotalFareLessThan5_ShouldReturnMinFare() {
		CabInvoiceGeneratorMain generator = new CabInvoiceGeneratorMain();
		double distance=0.1;
		int time = 2;
		double fare = generator.totalFare(distance,time);
		assertEquals(5,fare,0.0);
	}
}