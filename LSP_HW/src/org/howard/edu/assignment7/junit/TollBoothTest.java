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

		Truck ford = new FordTruck(5, 12000); 	// 5 axles and 12000 kilograms
		
		Truck toyota = new ToyotaTruck(1, 12000); 	// 5 axles and 12000 kilograms
		
		assertTrue(booth.calculateToll(ford)== 265);
		
		assertTrue(booth.calculateToll(toyota)== 245);
	}
	
	
	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
