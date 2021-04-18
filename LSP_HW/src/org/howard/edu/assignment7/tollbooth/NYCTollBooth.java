package org.howard.edu.assignment7.tollbooth;

public class NYCTollBooth implements TollBooth {
	private int receipts = 0;
	private int totalTrucks = 0;
	
	
	/**
	 * for input as metric ton
	 */
	@Override
	public int calculateToll(Truck truck) {
		//weight is given in kg
		// 500 kgs = 1/2 ton
		
		int cost = (Math.floorDiv(truck.weight, 500)*10) + (5*truck.axels);
		totalTrucks++;
		receipts = receipts + cost;
		return cost;
	}
	
	/**
	 *  for input weight as us ton 
	 */
//	@Override
//	public int calculateToll(Truck truck) {
//		//weight is given in lbs
//		// 1000 lbs == 1/2 ton
//		totalTrucks++;
//		int cost = (Math.floorDiv(truck.weight, 1000)*10) + (5*truck.axels);
//		reciptsSinceCollection = reciptsSinceCollection + cost;
//		return cost;
//	}
	
	@Override
	public void displayData() {
		System.out.println("current recipts " + receipts + "\ntotal trucks " + totalTrucks);
		
	}

	@Override
	public void reset() {
		displayData();
		receipts = 0;
		totalTrucks = 0;
		
	}
	
	public int getNumTrucks() {
		return totalTrucks;
	}
	
	public int getReceipts() {
		return receipts;
	}
	
}
