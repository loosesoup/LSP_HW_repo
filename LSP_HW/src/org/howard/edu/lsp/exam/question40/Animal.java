package org.howard.edu.lsp.exam.question40;
/**
 * 
 * @author avon abrahams
 *	general abstract animal class that all other animals will inherit from
 */
public abstract class Animal {
	/**
	 * outputs and acknowledges that the specific animal will speak
	 */
	public void speak() {
		System.out.println("This animal speaks");
	}
	/**
	 * outputs and acknowledges that the specific animal will move forward
	 */
	public void move() {
		System.out.println("This animal moves forward");
	}
}
