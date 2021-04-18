package org.howard.edu.assignment7.tollbooth;

/**
 * 
 * @author avon abrahams
 * Tollbooth interface
 */
public interface TollBooth {
	
	/**
	 * @param truck
	 * @return calculation of toll based n weight in kgs and axels for each truck
	 */
	int calculateToll(Truck truck);
	
	/**
	 * displays num of trucks and total receipt nums from last collection
	 */
	
	void displayData();
	
	/**
	 * resets truck numbers and receipts nums to 0
	 */
	
	void reset();
	
	/**
	 * @return num of trucks since last collection
	 */
	
	int getNumTrucks();
	
	/**
	 * @return receipt totals since last collection
	 */
	int getReceipts();

}
