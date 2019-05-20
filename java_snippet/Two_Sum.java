import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {2,7,11,15};
		int target = 9;
		int[] output = twoSum(nums,target);
		for(int i:output) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
	}
	
	 public static int[] twoSum(int[] nums, int target) {
	       
	        Map<Integer,Integer> hm = new HashMap<>();
	        int[] ret = new int[2];
	        for(int i=0;i<nums.length;i++){
	          if(hm.containsKey(target-nums[i]))
	          {
	            ret[0] = i;
	            ret[1] = hm.get(target-nums[i]);   
	          }
	           hm.put(nums[i],i);
	             
	        }
	        return ret;

   }
}
