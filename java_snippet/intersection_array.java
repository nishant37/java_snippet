import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class intersection_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {1,2,2,1};
		int [] nums2 = {2,2};
		int[] value = findArray(nums1,nums2);
		for(int i:value) {
			System.out.println(i);
		}
	}

	private static int[] findArray(int[] nums1, int[] nums2) {
     
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int n:nums1) {
			hm.put(n, hm.getOrDefault(n, 0)+1);
		}
		
		List<Integer> lt = new ArrayList<>();
		
		for(int n:nums2) {
			if(hm.containsKey(n) && hm.get(n)!=0 ) {
				hm.put(n, hm.get(n)-1);
				lt.add(n);
			}
		}
		
		
		
		int[] arr = new int[lt.size()]; 
		  
        // ArrayList to Array Conversion 
        for (int i =0; i < lt.size(); i++) 
            arr[i] = lt.get(i); 
		
		return arr;
		}
		
	
        
        
		
	

}
