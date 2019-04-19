/*3Sum Closest
 * 
 * Given an array nums of n integers and an integer target, find three integers in 
 * nums such that the sum is closest to target. 
 * Return the sum of the three integers. 
 *  
 * 
 */


import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] nums = {0, 2, 1, -3};
       int target = 1;
       int closest = getSum(nums,target);
       System.out.println(closest);
	}

	private static int getSum(int[] nums, int target) {
		Arrays.sort(nums);
		int closest=0;
		int difference = Integer.MAX_VALUE;
		for(int i=0;i<nums.length-2;i++) {
			int j=i+1; int end = nums.length-1;
			
			int sum = nums[i]+ nums[j]+nums[end];
			//System.out.println(sum);
			 int findDifference = Math.abs(target-sum);
			
			if(findDifference<difference) {
				difference = findDifference;
				closest = sum;
			}
			if(target-sum>0) j++;
			else if (target-sum<0) end--;
			else return target;
			
		}
		
		
		
		
		return closest;
	}

}
