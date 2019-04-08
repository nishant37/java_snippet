import java.util.HashSet;

public class checkPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {1,4,45,6,10,8};
       int sum = 16;
       printPair(arr,sum);
	}

	private static void printPair(int[] arr, int sum) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			int temp = sum-arr[i];
			
			if(temp>=0 && hs.contains(temp)) {
				System.out.println("The pairs with the given sum" + sum + " is (" + arr[i] + " , "+temp+ " )"  );
				}
			hs.add(arr[i]);
		}
	}

}
