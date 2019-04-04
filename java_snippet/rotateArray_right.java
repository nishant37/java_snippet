
public class rotateArray_right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] nums = {1,2,3,4,5,6,7};
         int k =3;
         rotate(nums,k);
	}

	private static void rotate(int[] nums, int k) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		while(start<end) {
			int temp = nums[start];		
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		
	}
	
}
