package org.howard.edu.assignment7.tollbooth;

public class ToyotaTruck extends Truck {
	

	public ToyotaTruck(int axels, int weight){
		super(axels,weight);
		make =  "Toyota";
	}
	
	public String toString() {
		return "make " + make + "\nweight " + this.weight + "\naxels " + this.axels;
	}
}
