package org.howard.edu.assignment7.tollbooth;

public interface TollBooth {
	
	int calculateToll(Truck truck);
	
	void displayData();
	
	void reset();
	
	int getNumTrucks();
	
	int getReceipts();

}
