package org.howard.edu.assignment7.tollbooth;

/**
 * 
 * @author avon abrahams
 * NYCtollBooth implements Tollbooth interface
 */
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
