package org.howard.edu.assignment7.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.assignment7.tollbooth.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TollBoothTest {
	@Test
	@DisplayName("Test Cases for calculateToll")
	public void testCalculateToll() {
		TollBooth booth = new NYCTollBooth();

		
		Truck toyota = new ToyotaTruck(1, 12000); 	// 1 axles and 12000 kilograms
		assertTrue(booth.calculateToll(toyota)== 245);
		
		Truck ford = new FordTruck(0, 0); 	// 5 axles and 12000 kilograms
		assertTrue(booth.calculateToll(ford) == 0);
	
		Truck toyota2 = new ToyotaTruck(4, 1000); 	// 1 axles and 12000 kilograms
		assertTrue(booth.calculateToll(toyota2)== 40);
	}
	
	@Test
	@DisplayName("Test Cases for Truck Make")
	public void testTruckMake() {
		
		Truck toyota = new ToyotaTruck(1, 12000); 	// 1 axles and 12000 kilograms
		
		Truck ford = new FordTruck(0, 0); 	// 5 axles and 12000 kilograms
		
		assertTrue(ford.getMake()== "Ford");
		assertTrue(toyota.getMake()== "Toyota");
	}
	
	@Test
	@DisplayName("Test Cases for Display data")
	public void testDisplayData() {
		
TollBooth booth = new NYCTollBooth();

		
		Truck toyota = new ToyotaTruck(1, 12000); 	// 1 axles and 12000 kilograms
		booth.calculateToll(toyota);
		
		Truck ford = new FordTruck(0, 0); 	// 5 axles and 12000 kilograms
		booth.calculateToll(ford);
	
		Truck toyota2 = new ToyotaTruck(4, 1000); 	// 1 axles and 12000 kilograms
		booth.calculateToll(toyota2);
		
		
		assertTrue(booth.getNumTrucks()==3);
		
		assertTrue(booth.getReceipts()==285);
		
	}
	
	@Test
	@DisplayName("Test Cases for reset")
	public void testReset() {
		TollBooth booth = new NYCTollBooth();

		Truck toyota = new ToyotaTruck(1, 12000); 	// 1 axles and 12000 kilograms
		booth.calculateToll(toyota);
		
		Truck ford = new FordTruck(0, 0); 	// 5 axles and 12000 kilograms
		booth.calculateToll(ford);
	
		Truck toyota2 = new ToyotaTruck(4, 1000); 	// 1 axles and 12000 kilograms
		booth.calculateToll(toyota2);
		
		assertTrue(booth.getNumTrucks()==3);
		assertTrue(booth.getReceipts()==285);
		
		booth.reset();
		assertTrue(booth.getNumTrucks()==0);
		assertTrue(booth.getReceipts()==0);
		
	}
	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
