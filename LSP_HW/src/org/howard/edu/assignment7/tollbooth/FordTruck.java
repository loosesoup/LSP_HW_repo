package org.howard.edu.assignment7.tollbooth;

public class FordTruck extends Truck {
	
	public FordTruck(int axels, int weight){
	super(axels,weight);
	make =  "Ford";
	}
	
	
	public String toString() {
		return "make " + make + "\nweight " + this.weight + "\naxels " + this.axels;
	}
	
}
