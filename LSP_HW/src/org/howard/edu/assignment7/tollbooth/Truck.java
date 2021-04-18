package org.howard.edu.assignment7.tollbooth;
/**
 * 
 * @author avon abrahams
 * abstract Truck class
 */
public abstract class Truck {
	
	int axels;
	int weight;
	protected String make;
	
	/**
	 * 
	 * @param axels
	 * @param weight
	 * Truck constructor that binds data to each instance that extends this class
	 */
	public Truck(int axels, int weight){
		this.weight = weight;
		this.axels = axels;
	}
	
	/**
	 * 
	 * @return the make of the truck from each class that extends this one
	 */
	public String getMake() {
		return make;
	}
}
