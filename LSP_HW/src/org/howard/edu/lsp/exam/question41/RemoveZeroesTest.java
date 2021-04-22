package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * 
 * @author avon abrahams
 * implementation of remove Zeros method
 */
class RemoveZeroesTest {
	/**
	 * 
	 * @param a -- array list
	 * this method will remove all zeros from the list
	 */
	
	private void removeZeroes(ArrayList<Integer> a) {
		if (a.size() == 0)
			return;
		int right = a.size()-1;
		int left = 0;
		
		while (left<= right) {
			if (a.get(left) == 0){
				a.remove(left);
                right--;
            }
			else
				left++;
		}
    }
		
	
	@Test
	@DisplayName("Test Cases for Remove Zeroes")
	public void testRemoveZeroes() {
		ArrayList a = new ArrayList<Integer>();
		
		a.add(0);
	    a.add(0);
	    a.add(0);
	    a.add(0);
	    
	    assertTrue(a.size()==4);
	    
	    
	    removeZeroes(a);
	    assertTrue(a.isEmpty());
	    
		ArrayList b = new ArrayList<Integer>();
		
		b.add(7);
	    b.add(0);
	    b.add(2);
	    b.add(0);
	    b.add(0);
	    b.add(4);
	    b.add(0);
		
	    
	    
	    removeZeroes(b);
	    assertEquals(b,new ArrayList<>(Arrays.asList(7,2,4)));
	   
		ArrayList c = new ArrayList<Integer>();
		
		c.add(1);
		c.add(4);
		c.add(100);
		c.add(-1);
		
		int ogLenofC = c.size();
		removeZeroes(c);
		int newLenofC = c.size();
		assertTrue(newLenofC ==ogLenofC);
		
		
	}

	


}
