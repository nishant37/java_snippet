/** Contains Duplicate
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
Example 1:
Input: [1,2,3,1]
Output: true
Example 2:
Input: [1,2,3,4]
Output: false
Example 3:
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 * 
 * 
 */

import java.util.*;
public class containsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num[] = {1,2,3,1};
       boolean var = checkDuplicate(num);
       System.out.println(var);
	}

	private static boolean checkDuplicate(int[] num) {
	
	      Set<Integer> st = new HashSet<Integer>();	
			      for(int i:num) {
	    	  if(st.contains(i)==true) {
	    		  return true;
	    	  }
	    	  else {
	    		  st.add(i);
	    	  }
	      }
	      
		return false;
	}

}
