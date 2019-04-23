/*  Maximum Subarray
 * 
 * Given an integer array nums, find the contiguous subarray (containing at least one number) 
 * which has the largest sum and return its sum.
 * 
 * 
 * 
 * 
 */



public class maximumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    int output =  maxSubArray(nums);
    System.out.println(output);
	}

	private static int maxSubArray(int[] nums) {
		
		if(nums.length==1) {
			return nums[0];
		}
		int min = Integer.MIN_VALUE;
		int i =0;
		int sum = 0;
		while(i<nums.length) {
			sum +=nums[i];
			min = Math.max(sum, min);
			if(sum<0) {
				sum = 0;
			}
			i++;
		}
		
		return min;
		
	}

}
