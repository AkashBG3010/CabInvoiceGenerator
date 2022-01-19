package com.bridgelabz;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	CabInvoiceGeneratorMain generator = null;
	@Before
	public void setUp() {
		generator = new CabInvoiceGeneratorMain();
	}
	
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
	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {

		CabRide[] rides = {new CabRide(2.0, 5), 
						new CabRide(0.1, 1)};
		double totalFare = generator.calculateFare(rides);
		assertEquals(30, totalFare, 0.0);
	}
}