/** Rotate Array
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4] 
 *
 */


public class rotateArray {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5,6,7};
		int k =3;
		rotate(arr,k);

	}

	private static void rotate(int[] nums, int k) {
	
		int len = nums.length, l = 0, r = len-1;
        if(len == 0) return;
        k = k % len;
        int mid = len -k;
        reverse(nums, l, mid-1);
        reverse(nums, mid, r);
        reverse(nums, l, r);
        for(int i:nums) {
        	System.out.print(i);
        }
	}

	private static void reverse(int[] nums, int start, int end) {
		
		while(start<end) {
			int temp = nums[start];		
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		
	}
}
