package org.howard.edu.lsp.assignment4.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;



public class IntegerSet {

	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();
	
	
	static IntegerSetException e = new IntegerSetException("Cannot search Set of length 0");
	
	// Clears the internal representation of the set
	public void clear() {
		set.clear();
	};

	// Returns the length of the set
	public int length() {
		return set.size();
	}; 
	
	// Returns item at given index
	public int get(int index) {
		return set.get(index);
	}

	/*
	             * Returns true if the 2 sets are equal, false otherwise;
	* Two sets are equal if they contain all of the same values in ANY order.
	*/
	public boolean equals(IntegerSet b) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0;i<b.length();i++)
			map.put(b.get(i), true);
		
		for (int i =0;i<set.size();i++) {
			if (map.containsKey(set.get(i)) == false){
				return false;
			}
		}
		return true;
	};
	
	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		for (int i = 0;i<set.size();i++) {
			if (value == set.get(i)){
				return true;
			}	
		}
		return false;
	}

	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty
	public int largest() throws IntegerSetException {
		if (set.size() == 0) {
			throw e;
		}
		else {
			int max = set.get(0);
			int ithVal = set.get(0);
			for (int i=0;i<set.size();i++) {
				if (ithVal > max)
					max = ithVal;
			}
			return max;
		}
			
	}

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException {
		if (set.size() == 0) {
			throw e;
		}
		else {
			int min = set.get(0);
			int ithVal = set.get(0);
			for (int i=0;i<set.size();i++) {
				if (ithVal < min)
					min = ithVal;
			}
			return min;
		}		
	}

	// Adds an item to the set or does nothing it already there	
	public void add(int item) {
		boolean contain = set.contains(item);
		if (contain == false)
			set.add(item);
	}

	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		for (int i=0;i<set.size();i++) {
			if (item == set.get(i))
				set.remove(i);
		}
		
	}

	// Set union
	public void union(IntegerSet intSetb) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0;i<intSetb.length();i++)
			map.put(intSetb.get(i), true);
		
		for (int i = 0;i<set.size();i++)
			map.put(set.get(i), true);
		
		set.clear();
		set.addAll(map.keySet());
		
	}

	// Set intersection
	public void intersect(IntegerSet intSetb) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0;i<intSetb.length();i++)
			map.put(intSetb.get(i), false);
		
		for (int i = 0;i<set.size();i++) {
			if (map.containsKey(set.get(i)))
				map.put(set.get(i), true);
			else
				map.put(set.get(i), false);
		}
		set.clear();
		
		List<Integer> mapKeys = new ArrayList<Integer>();
		mapKeys.addAll(map.keySet());
		for (int i = 0;i<mapKeys.size();i++) {
			if (map.get(mapKeys.get(i))== true)
				set.add(mapKeys.get(i));
				
		}

	}

	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0;i<intSetb.length();i++)
			map.put(intSetb.get(i), true);
		
		for (int i = set.size()-1;i>=0;i--) {
			if (map.containsKey(set.get(i))) 
				set.remove(i);
			}
		
	}

	// Returns true if the set is empty, false otherwise
	public boolean isEmpty() {
		
		return set.size() == 0;
	}

	// Return String representation of your set
	public String toString() {
		return set.toString();
	}

}
