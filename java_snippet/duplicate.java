/**
 Check if a given array contains duplicate elements within k distance from each other
 
 Given an unsorted array that may contain duplicates. Also given a number k which 
 is smaller than size of array. Write a function that returns true if 
 array contains duplicates within k distance.

  Examples:
  
  Input: k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4}
Output: false
All duplicates are more than k distance away.

Input: k = 3, arr[] = {1, 2, 3, 1, 4, 5}
Output: true
1 is repeated at distance 3.

Input: k = 3, arr[] = {1, 2, 3, 4, 5}
Output: false

Input: k = 3, arr[] = {1, 2, 3, 4, 4}
Output: true
 
 Solution:
 1. Make a hashset so as to make sure that it does not contain duplicate elements
 2. Add the base element to the hashset
 3. Check if the element exist within the hashset within the k distance
 4. if i>k-1 then remove the element from the hashset
 
 **/


import java.util.HashSet;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[] = {1, 2, 3, 4, 4, 5};
           int k =3;
           boolean var = checkDuplicate(arr,k);
           System.out.println(var);
	}

	   public static boolean checkDuplicate(int[] arr, int k) {
		  
		   
		   // To check value of k is less than length of array
		   // To check if length of an array is not equal to 1
		   if(k>arr.length || arr.length==1) {
			   return false;
		   }
		   
		   // Create a hashset to add elements to the hash set
		   HashSet<Integer> hs = new HashSet<>();
		   
		   // Add the base element to the hash set
		   hs.add(arr[0]);
		   
		   // To check if the hash set contains an element from the array
		   for(int i=1;i<arr.length;i++) {
			   if(hs.contains(arr[i])) {
				   return true;
			   }
			
			// To check if i> k-1 then remove the element from the hash set
			if(i>k-1) {
				hs.remove(arr[i-k]);
			}
			// Add the element to the hash set
			hs.add(arr[i]);
			   
		   }
		   return false;
		   
	   }
}
