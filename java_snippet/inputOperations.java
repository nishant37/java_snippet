import java.util.HashMap;
import java.util.Set;


public class inputOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int []arr = {1,5,2,1,3,2,1};
           int n = arr.length;
           minOperations(arr,n);
	}

	private static void minOperations(int[] arr, int n) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) 
			  if(hs.containsKey(arr[i]))
				  hs.put(arr[i], hs.get(arr[i])+1);
			  else
				  hs.put(arr[i], 1);
		int maximum = 0;
		// This method is used to get all the keys in the set
	    Set<Integer> st = hs.keySet();
	    for(int i: st) {
	    	if(maximum<hs.get(i))
	    // This method is used to get the keys from the hashmap
	    		maximum = hs.get(i);
	    }
	    System.out.println(n-maximum);
	}

}
