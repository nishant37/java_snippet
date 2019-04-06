import java.util.HashSet;

// The goal of this program to find whether one array is subset of another array
// using hashing


public class subset_array_hash {

	public static void main(String[] args) {
		
		int[] arr1 = {11,13,21,3,7};
		
		int[] arr2 = {11,3,7,21};
		
		int m = arr1.length;
		int n = arr2.length;
		
        if(checkSubset(arr1,arr2,m,n)) {
        	System.out.println("True");
        }else {
        	System.out.println("False");
        }
        
		
	}

	private static boolean checkSubset(int[] arr1, int[] arr2, int m, int n) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hset = new HashSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			if(!hset.contains(arr1[i])) {
				hset.add(arr1[i]);
			}
		}
		
	    for(int j=0;j<arr2.length;j++) {
	    	if(!hset.contains(arr2[j])) {
	    		return false;
	    	}
	    } 
		
		
		return true;
	}
	
}
