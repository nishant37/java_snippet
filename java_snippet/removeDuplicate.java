/*Remove Duplicates from Sorted Array
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * 
 */

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] nums = {0,0,1,1,1,2,2,3,3,4};
     int duplicate = checkDuplicate(nums);
     System.out.println(duplicate);
	}

	private static int checkDuplicate(int[] nums) {
	
		int i=0;
		for(int j=0;j<nums.length;j++) {
			if(nums[j]!=nums[i]) {
				i++;
			 nums[i]=nums[j];
			}
		}
		
		
		return i+1;
	}

}
