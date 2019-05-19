//import java.util.Iterator;
import java.util.PriorityQueue;

public class KthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,2,1,5,1,7};
		int k =2;
		int output = findKthLargest(nums,k);
		System.out.println(output);
	}

	private static int findKthLargest(int[] nums, int k) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i:nums){
            minHeap.add(i);
           /* Iterator it = minHeap.iterator();

            System.out.println("Priority queue values are: ");
            
            while (it.hasNext()) {
               System.out.println("Value: "+ it.next() + " "+minHeap.size()); 
            }*/
            if(minHeap.size()>k){
            	
                minHeap.remove();
            }
        }
        
       
        
        return minHeap.remove();
		
		
	}

}
