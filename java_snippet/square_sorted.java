import java.util.Arrays;

// Given array: [-4,-1,0,3,10]
// Output Result: [0,1,9,16,100]


public class square_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-4,-1,0,3,10};
		
		squareArray(arr);		
	}

	private static void squareArray(int[] arr) {
		// TODO Auto-generated method stub
		
		int len = arr.length;
		
		// Initialize an empty array with the length of given array
		
		int[] value = new int[len];
		
		// loop through the array (arr) square the values and insert the values in the empty array
		
		for(int i=0;i<arr.length;i++) {
			value[i] = arr[i]*arr[i];
		}
		
		// Sort the array
		Arrays.sort(value);
		
		for(int k:value) {
			System.out.print(k+" ");
		}
		
		
	}
	
}
