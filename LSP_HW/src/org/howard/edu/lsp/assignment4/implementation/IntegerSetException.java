package org.howard.edu.lsp.assignment4.implementation;

/**
 * custom exception class that inherits from Exception
 * will be called and raised to check the bounds of my my implementation in IntegerSet
 * @author avon abrahams
 *
 */
public class IntegerSetException extends Exception {
	/**
	 * 
	 * @param outputMessage message to be passed in and displayed to user if this is raised
	 */
	IntegerSetException(String outputMessage){
		
		super(outputMessage);
	}
	

}
