package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.TargetNum;


import java.util.Arrays;
import java.util.ArrayList;

/**
 * test the algorithm from my source code
 * @author avon abrahams
 */

class TargetPractice {

	/**
	 * 
	 * runs each test case
	 * my main method
	 * 
	 */

  public static void main(String[] args) {
    int[] array1 = {5,5,15,10};
		int target1 = 15;
		
		int[] array2 = {1,2,3,4,5,6};
		int target2 = 6;
		
		int[] array3 = {};
		int target3 = -1;
		
		int[] array4 = {4,0,0,-1};
		int target4 = 1;

		int[] array5 = {10, -5, -10, 0, 5};
		int target5 = 5;
		
        TargetNum firstTry = new TargetNum();
		System.out.println(firstTry.targetNumber(array1,target1)+"\n");

		TargetNum secondTry = new TargetNum();
		System.out.println(secondTry.targetNumber(array2,target2)+"\n");

		TargetNum thirdTry = new TargetNum();
		System.out.println(thirdTry.targetNumber(array3,target3)+"\n");

		TargetNum fourthTry = new TargetNum();
		System.out.println(fourthTry.targetNumber(array4,target4)+"\n");

		TargetNum lastTry = new TargetNum();
		System.out.println(lastTry.targetNumber(array5,target5));

  }
}