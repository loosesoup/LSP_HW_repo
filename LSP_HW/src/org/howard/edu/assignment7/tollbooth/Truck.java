package org.howard.edu.assignment7.tollbooth;

public abstract class Truck {
	
	int axels;
	int weight;
	protected String make;
	
	public Truck(int axels, int weight){
		this.weight = weight;
		this.axels = axels;
	}
	
	public String getMake() {
		return make;
	}
}
