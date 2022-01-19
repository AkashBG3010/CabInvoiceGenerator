package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

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
	public void givenMultipleRides_ShouldReturnInvoice() {

		CabRide[] rides = {new CabRide(2.0, 5), 
						new CabRide(0.1, 1)};
		double totalFare = generator.calculateFare(rides);
		assertEquals(30, totalFare, 0.0);
	}
	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {

		ArrayList<CabRide> rides = new ArrayList<CabRide>();
		rides.add(new CabRide(2.0, 5));
		rides.add(new CabRide(0.1, 1));
		int size = rides.size();
		assertEquals(2,size);
	}
	@Test
	public void givenUserId_ShouldReturnInvoiceSummary() {
		String userId = "User1";
		InvoiceService invoiceService = new InvoiceService();
		ArrayList<CabRide> invoiceList = new ArrayList<>();
		invoiceList.add(new CabRide(2.0, 5));
		invoiceList.add(new CabRide(0.1, 1));
		invoiceService.addRide(userId, invoiceList);
		ArrayList<CabRide> listOfRides = invoiceService.getRides(userId);
		int size = listOfRides.size();
		assertEquals(2,size);
	}
}