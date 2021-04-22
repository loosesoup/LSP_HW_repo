package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

public class Question41 {
	
	 public static void removeZeroes(ArrayList<Integer> a) {
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
	

}
