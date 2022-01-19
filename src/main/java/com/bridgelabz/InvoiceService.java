package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InvoiceService {
	Map<String, ArrayList<CabRide>> rideMap;

	public InvoiceService() {
		this.rideMap= new HashMap<>();
	}

	public void addRide(String customerId, ArrayList<CabRide> rides) {
		if(customerId != null)
			rideMap.put(customerId, rides);
	}
	public ArrayList<CabRide> getRides(String customerId){
		if(rideMap.containsKey(customerId))
			return rideMap.get(customerId);
		return null;
	}
}