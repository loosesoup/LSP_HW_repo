package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment6.integerset.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerSetTest {



	@Test
	@DisplayName("Test Cases for clear")
	public void testClear() {
		
		IntegerSet set1 = new IntegerSet();
		for (int i = 1;i<4;i++)
			set1.add(i);		
		set1.clear();
		assertTrue(set1.isEmpty());
		
		
		IntegerSet set2 = new IntegerSet();
		set2.clear();
		assertTrue(set2.isEmpty());
	}
	
	@Test
	@DisplayName("Test Cases for length")
	public void testLength() {
		IntegerSet set1 = new IntegerSet();
		for (int i = 0;i<100;i++)
			set1.add(i);
		assertTrue(set1.length()==100);
		
		IntegerSet set2 = new IntegerSet();
		assertTrue(set2.length()==0);
		
	}
	
	@Test
	@DisplayName("Test Cases for equals")
	public void testEquals() {
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		assertTrue(set1.equals(set2)== true);
		
		for (int i = 0;i<100;i++)
			set1.add(i);
		assertFalse(set1.equals(set2)== true);
		
		for (int i = 0;i<100;i++)
			set2.add(i);
		
		assertTrue(set1.equals(set2)== true);
	}
	
	@Test
	@DisplayName("Test Cases for contains")
	public void testContains() {
		
		IntegerSet set1 = new IntegerSet();
		assertFalse(set1.contains(0));
		assertFalse(set1.contains(90));
		
		for (int i = 0;i<100;i++)
			set1.add(i);
		assertFalse(set1.contains(100));
		assertTrue(set1.contains(99));
		assertTrue(set1.contains(49));
		
		
	}
	
	@Test
	@DisplayName("Test Cases for largest")
	public void testLargest() {

		IntegerSet set1 = new IntegerSet();
		IntegerSetException exception = new IntegerSetException("Cannot search Set of length 0");
		assertThrows(exception,set1.largest());
		assertFalse(set1.contains(90));
		
		for (int i = 0;i<100;i++)
			set1.add(i);
	}
	
	@Test
	@DisplayName("Test Cases for smallest")
	public void testSmallest() {
		//assertEquals()
	}
	
	@Test
	@DisplayName("Test Cases for add")
	public void testAdd() {
		IntegerSet set1 = new IntegerSet();
		set1.add(0);
		assertTrue(set1.contains(0));
		assertFalse(set1.contains(1));
		set1.add(0);
		assertTrue(set1.length()==1);
		for (int i = 1;i<100;i++) {
			set1.add(i);
			assertTrue(set1.contains(i));
			assertFalse(set1.contains(i*100));
		}
		
	}
	
	@Test
	@DisplayName("Test Cases for remove")
	public void testRemove() {
		IntegerSet set1 = new IntegerSet();
		set1.remove(0);
		assertFalse(set1.contains(0));
		assertTrue(set1.isEmpty());
		
		for (int i = 2;i<100;i++) {
			set1.add(i);
			set1.remove(i);
			assertFalse(set1.contains(i));
		}
	}
	
	@Test
	@DisplayName("Test Cases for union")
	public void testUnion() {
		//assertEquals()
	}
	
	@Test
	@DisplayName("Test Cases for intersection")
	public void testIntersection() {
		//assertEquals()
	}
	
	@Test
	@DisplayName("Test Cases for difference")
	public void testDiff() {
		//assertEquals()
	}
	
	@Test
	@DisplayName("Test Cases for empty?")
	public void testIsEmpty() {
		IntegerSet set1 = new IntegerSet();
		assertTrue(set1.isEmpty());
		set1.add(0);
		assertFalse(set1.isEmpty());
		
		for (int i = 2;i<10;i++) {
			set1.add(i);
		}
		assertFalse(set1.isEmpty());
		
		set1.clear();
		assertTrue(set1.isEmpty());
	}
	
	
	@Test
	@DisplayName("Test Cases for toString")
	public void testToString() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		assertTrue(set1.toString().equals(set2.toString()));
		
		for (int i = 2;i<10;i++) {
			set1.add(i);
		}
		assertFalse(set1.toString().equals(set2.toString()));
		
		for (int i = 2;i<10;i++) {
			set2.add(i);
		}
		
		assertTrue(set1.toString().equals(set2.toString()));
		
		
	}
	
	
	
	@Test
	void test() {
		fail("Not yet implemented");
		
	}
	
	
	
	
	
//	@AfterEach
//	void tearDown() throws Exception {
//		IntegerSet test = null;
//		
//		IntegerSet test2 = null;
//		
//	}
}
