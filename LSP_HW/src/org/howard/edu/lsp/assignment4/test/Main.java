package org.howard.edu.lsp.assignment4.test;
import org.howard.edu.lsp.assignment4.implementation.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerSet test = new IntegerSet();
		for (int i = 1;i<4;i++)
			test.add(i);
		
		IntegerSet test2 = new IntegerSet();
		for (int i = 1;i<6;i++)
			test2.add(i);
		
		System.out.println("1st item " +test.get(0));
		
		System.out.println("test1 length? " + test.length());
		System.out.println("contains 3? " + test.contains(3));
		System.out.println("test1 = test2? " + test.equals(test2));
		System.out.println("test1" + test.toString());
		System.out.println("test2" + test2.toString());
		test2.diff(test);
//		System.out.println("test1utest2 " + test.toString());
//		System.out.println("test2" + test2.toString());
		System.out.println("test2-test1" + test2.toString());
		test2.clear();
		System.out.println("test2" + test2.toString());
//		System.out.println("test2"+test2);
//		System.out.println("test1 empty? " + test2.isEmpty());

		
		
	}

}
