package org.howard.edu.lsp.exam.question40;
/**
 * 
 * @author avon abrahams
 * Goose class will be subclass of animal since gooses are animals and will implement flying since they are also able to fly
 */
public class Goose extends Animal implements Flying {
	
	public void speak() {
		System.out.println("This Goose speaks");
	}
	
	public void move() {
		System.out.println("This Goose moves forward");
	}

	@Override
	public void fly() {
		
		System.out.println("I was born to fly");
	}
}
