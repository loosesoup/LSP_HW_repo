package org.howard.edu.lsp.assignment4.implementation;
/**
 * imports
 */
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**IntegerSet class which has the implementation of my IntgerSet
 * 
 * @author avon abrahams
 *
 */

public class IntegerSet {

	/**
	 * constructor creates a new private ArrayList that I will add desired behaviors to
	 */
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * instantiates an exception that I will throw in a few methods
	 */
	IntegerSetException e = new IntegerSetException("Cannot search Set of length 0");
	
	/**
	 * Clears the internal representation of the set
	 * Doesn't return anything
	 */ 
	public void clear() {
		set.clear();
	};

	/**
	 * @return the length of the set
	 */
	public int length() {
		return set.size();
	}; 
	
	
	/**
	 *  
	 * @param index (int)
	 * @return item at given index (int)
	 */
	public int get(int index) {
		return set.get(index);
	}

	/**
	 * 
	 * @param takes in an object of this class (IntegerSet)
	 * @return boolean t/f depending on if the contents of the 2 sets are the same
	 */
	public boolean equals(IntegerSet b) {
		// first compare the lengths of the set and argument set
		if (b.length() != set.size())
			return false;
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>(); // create new hashmap for quick lookup
		
		//loop over b and add each item to the map
		for (int i = 0;i<b.length();i++)
			map.put(b.get(i), true);
		
		//loop over set, if the map does not contain the ith item return false otherwise continue
		for (int i =0;i<set.size();i++) {
			if (map.containsKey(set.get(i)) == false){
				return false;
			}
		}
		return true;
	};
	
	/**
	 * 
	 * @param value -> int that may or may not be a member of the set
	 * @return boolean t/f depending on whether the argument is in the set or not
	 */
	public boolean contains(int value) {
		// loop over set, if ith item is equal to argument return true
		for (int i = 0;i<set.size();i++) {
			if (value == set.get(i)){
				return true;
			}	
		}
		return false;
	}

	/**
	 * 
	 * @return largest member of the set
	 * @throws IntegerSetException a checked exception if the set is empty
	 */
	public int largest() throws IntegerSetException {
		// if length of set is 0 -> throw custom exception from IntegerSetException
		if (set.size() == 0) {
			throw e;
		}
		else {
			int max = set.get(0); // set max to 1st item
			int ithVal = set.get(0);
			// loop over set, if ith item is greater than max, update max to the value of ith item
			for (int i=0;i<set.size();i++) {
				if (ithVal > max)
					max = ithVal;
			}
			return max;
		}
			
	}

	/**
	 * 
	 * @return the smallest member in the set
	 * @throws IntegerSetException a checked exception if the set is empty
	 */
	public int smallest() throws IntegerSetException {
		// if length of set is 0 -> throw custom exception from IntegerSetException
		if (set.size() == 0) {
			throw e;
		}
		else {
			int min = set.get(0); // set min to 1st item
			int ithVal = set.get(0);
			// loop over set, if ith item is less than min, update min to the value of ith item
			for (int i=0;i<set.size();i++) {
				if (ithVal < min)
					min = ithVal;
			}
			return min;
		}		
	}

	/**
	 * returns nothing
	 * @param item that will be added as a member to the set if not already
	 * if the item is already a member, nothing happens
	 */
	public void add(int item) {
		boolean contain = set.contains(item); // create bool that telss whether the item is in the set
		// if item is not in the set, then I add it
		if (contain == false)
			set.add(item);
	}

	/**
	 * returns nothing
	 * @param item that will be removed from the set if the item is present
	 * if the item is not already a member, nothing happens
	 */
	public void remove(int item) {
		// loop over set
		for (int i=0;i<set.size();i++) {
			// if the item equals the item at the ith index, then remove it
			if (item == set.get(i))
				set.remove(i);
		}
		
	}

	/**
	 * @param intSetb an object of IntegerSet
	 * combines the unique members of both the set which is called on and the set passed as an argument
	 * this new unique set gets updated to the set to which the method was called on
	 */
	public void union(IntegerSet intSetb) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>(); // creates hahmap for quick lookup
		
		//loops over intSetb and add item to map with value of true
		for (int i = 0;i<intSetb.length();i++)
			map.put(intSetb.get(i), true);
		
		// loops over set and add item to map or does nothing if its there already
		for (int i = 0;i<set.size();i++)
			map.put(set.get(i), true);
		
		// clears the set
		set.clear();
		// adds all of the keys of the map to the set
		set.addAll(map.keySet());
		
	}

	/**
	 * @param intSetb an object of IntegerSet
	 * filters the common members of both the set which is called on and the set passed as an argument
	 * this new set which only contains items present in both the original sets gets updated to the set to which the method was called on
	 */
	public void intersect(IntegerSet intSetb) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>(); // create new hashmap for quick lookup
		
		// loop over intSetb and add it to map with value of false
		for (int i = 0;i<intSetb.length();i++)
			map.put(intSetb.get(i), false);
		
		// loop over set and if the item is already in the map, update the value to true
		for (int i = 0;i<set.size();i++) {
			if (map.containsKey(set.get(i)))
				map.put(set.get(i), true);
			else
				map.put(set.get(i), false);
		}
		// clears the set
		set.clear();
		
		List<Integer> mapKeys = new ArrayList<Integer>();
		mapKeys.addAll(map.keySet()); // creates a list of the keys in the map
		
		//loops over list of keys and if the value is true then add to set
		for (int i = 0;i<mapKeys.size();i++) {
			if (map.get(mapKeys.get(i))== true)
				set.add(mapKeys.get(i));
				
		}

	}

	/**
	 * @param intSetb an object of IntegerSet
	 * filters out the common members of both the set which is called on and the set passed as an argument
	 * this filtered set which only contains items found in the first set that are not found in the set passed as parameter,
	 * gets updated to the set to which the method was called on
	 */
	public void diff(IntegerSet intSetb) {
		
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>(); // create hashmap for quick lookup
		
		// puts items from intSetb into map
		for (int i = 0;i<intSetb.length();i++)
			map.put(intSetb.get(i), true);
		
		// loop over set and compare each item in set with map
		for (int i = set.size()-1;i>=0;i--) {
			// if the item is in map -> remove it from set
			if (map.containsKey(set.get(i))) 
				set.remove(i);
			}
		
	}

	/**
	 * 
	 * @return boolean depending on if the set is empty or not
	 */
	public boolean isEmpty() {
		
		return set.size() == 0;
	}

	/**
	 * @return string representation of the set
	 */
	public String toString() {
		// override toString
		return set.toString();
	}

}
