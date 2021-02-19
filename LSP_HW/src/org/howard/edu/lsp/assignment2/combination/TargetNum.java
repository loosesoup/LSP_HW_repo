package org.howard.edu.lsp.assignment2.combination;

// import array and array list
import java.util.Arrays;
import java.util.ArrayList;

/**
 * 
 * @author avon abrahams
 * source code for HW2 problem
 *
 */

public class TargetNum {
	
	/**
	 * 
	 * @param old which is a arrayList that I want to deep copy
	 * @return new object which is a deep copy of the old
	 */
	
	private ArrayList<Integer> makeDeepCopyInteger(ArrayList<Integer> old){
	    ArrayList<Integer> copy = new ArrayList<Integer>(old.size());
	    for(Integer i : old){
	        copy.add(new Integer(i));
	    }
	    return copy;
	}

	/**
	 * @param input array and target number from testfile
	 * @return an arraylist in which each item is a solution 
	 * 
	 * implemented a stack which checked each possible combination 
	 */
	
	  public ArrayList<ArrayList<Integer>> targetNumber(int array[], int target){
	    
	    
	    int[] array2 = (int[])array.clone(); // deep copy of input

	    ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>(); // overall solution set
	    ArrayList<Integer> stack = new ArrayList<Integer>(); // stack to hold enumeration of input array
	    
	    final int max_index = array2.length-1; // index of last element in input array
	    int run = 0; // holds running total
	    

	    //loops to add indexes to stack
	    for (int i=0;i<array2.length;i++){
	      stack.add(i);
	      run+=array2[i];
	    }
	    System.out.println("\ninput array ->" + Arrays.toString(array2));
	    System.out.println("target ->" + target);

	    // loops until stack is empty at which point all solutions 
	    // would have been found and I 
	    // can return array list
	    while (stack.size() > 0) {  

	      // }
	      int idx = stack.size()-1; //  index of top of stack
	      int top = stack.get(idx);  // value at top of stack

	      // if top of stack less than max index, push to stack
	      if (top < max_index){
	        while (top < max_index){ 
	          stack.add(top+1);
	          idx = stack.size()-1;
	          top = stack.get(idx);
	          run += array2[top];
	          // System.out.println("run ->" + run);
	      
	      // add to final solution
	      if (run==target){
	        ArrayList<Integer> new_ref_stack_sol = makeDeepCopyInteger(stack);
	        ret.add(new_ref_stack_sol);
//	        System.out.println("new_ref_stack_sol = " + new_ref_stack_sol);
	    
	        }
	        }
	      }
	      
	      stack.remove(idx); // pop from stack
	      run -= array2[top];


	      if (run==target){
	        ArrayList<Integer> new_ref_stack_sol2 = makeDeepCopyInteger(stack);
	        ret.add(new_ref_stack_sol2);

//	        System.out.println("new_ref_stack_sol2 = " + stack);
	 
	      }

	      if (stack.size() == 0)
	      continue;

	      idx = stack.size()-1; // reassign len accordingly
	      top = stack.get(idx); // get new top of stack
	      

	      // System.out.println("stack after pop "+stack);

	      if (top < max_index){
	        run-= array2[top];
	        top+=1;
	        stack.set(idx, top);
	        top = stack.get(idx);
	        run+= array2[top];

	      }
	      else{
	        stack.remove(idx);
	        run -= array2[top];
	      }  

	      if (run==target){
	        ArrayList<Integer> new_ref_stack_sol3 = makeDeepCopyInteger(stack);
	        ret.add(new_ref_stack_sol3);
//	        System.out.println("new_ref_stack_sol3 = " + stack);

	      }

	  }

	  return ret;
	}

}
