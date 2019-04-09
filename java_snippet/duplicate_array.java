/**
 
 Find duplicates in a given array when elements are not limited to a range
 
 Given an array of n integers. The task is to print the duplicates in the given 
 array. If there are no duplicates then print -1.

Example:

Input : {2, 10, 100, 2, 10, 11}
Output : 2 10

Input : {5, 40, 1, 40, 100000, 1, 5, 1}
Output : 5 40 1

*/






import java.util.*;
public class duplicate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {12,11,40,12,5,6,5,12,11};
       int n = arr.length;
       printDuplicates(arr,n);
	}

	private static void printDuplicates(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		// Make a map to store elements of an array to map
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		int count =0;
		boolean var = false;
		for(int i=0;i<n;i++) {
			if(mp.containsKey(arr[i])) {
				count = mp.get(arr[i]);
				mp.put(arr[i], count+1);
			}else
				mp.put(arr[i], 1);
			}
		
		// Use Map.Entry to check the value of an elements stored
		
		for(Map.Entry<Integer, Integer> entry: mp.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + "  ");
				var = true;
			}
			
		}
		if(!var) {
			System.out.println("-1");
		}
	}

}
