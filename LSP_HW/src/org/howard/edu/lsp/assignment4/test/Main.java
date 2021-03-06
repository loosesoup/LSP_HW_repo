package org.howard.edu.lsp.assignment4.test;
import org.howard.edu.lsp.assignment4.implementation.*;
/**
 * Driver class contains all of my testing of the methods on IntegerSet
 * @author avon abrahams
 *
 */

public class Main {
	/**
	 * 
	 * @param args main method
	 */
	public static void main(String[] args) {
		
		IntegerSet test = new IntegerSet(); // instantiate new object
		for (int i = 1;i<4;i++)
			test.add(i);
		
		IntegerSet test2 = new IntegerSet();
		for (int i = 1;i<6;i++)
			test2.add(i);
		
		System.out.println("test1 initially" + test.toString());
		System.out.println("test2 initially" + test2.toString());
		
		System.out.println("test2 3rd item " +test2.get(2));
		
		System.out.println("test2 length? " + test2.length());
		System.out.println("test2 contains 4? " + test2.contains(4));
		System.out.println("test contains 4? " + test.contains(4));
		System.out.println("test1 = test2? " + test.equals(test2));
		test2.diff(test);
//		System.out.println("test2-test1 " + test.toString());
//		System.out.println("test2" + test2.toString());
		System.out.println("test2-test1" + test2.toString());
		test2.clear();
		try {
			System.out.println("test2 smallest item? " + test2.smallest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("test1 largest item? " + test.largest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		System.out.println("test2 after clear" + test2.toString());
		System.out.println("test2 empty? " + test2.isEmpty());
		System.out.println("test1" + test.toString());
		test.union(test2);
		System.out.println("test1 U test2" + test.toString());
		test2.union(test);
		System.out.println("test2 U test1" + test2.toString());
		test.intersect(test2);
		System.out.println("test1 X test2" + test.toString());
		test.remove(3);
		System.out.println("test1 after remove 3" + test.toString());
		test2.remove(6);
		System.out.println("test2 after remove 6" + test2.toString());
		
		
	}

}
