/*  3Sum
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.
 * 
 * Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 * 
 * 
 */





import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class threeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] sum = {-1,0,1,2,-1,-4};
        List<List<Integer>> lt = getNumbers(sum);
        for(List<Integer> l: lt) {
        	System.out.print(l);
        }
        
	}

	private static List<List<Integer>> getNumbers(int[] nums) {
		
		Arrays.sort(nums);
		List<List<Integer>> lt = new LinkedList<>();
		Set<List<Integer>> st = new HashSet<>();
		for(int i=0;i<nums.length-2;i++) {
			int lo = i+1, high = nums.length-1, sum = 0-nums[i];
			while(lo<high) {
				if(nums[lo]+nums[high]==sum) {
					st.add(Arrays.asList(nums[i],nums[lo],nums[high]));
					lo++;
					high--;
				}
				else if(nums[lo]+nums[high]<sum) {
					lo++;
				}
				else {
					high--;
				}
			}
		}
		
		for(List<Integer> l: st) {
			lt.add(l);
		}
		
		return lt;
		
		
	}

}
