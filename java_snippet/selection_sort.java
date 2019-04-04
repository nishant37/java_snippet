public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {64,25,12,22,11};
		sort(arr);
		
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		// Find the length of array and store it in n
		
		//for loop from int i=0 to less than second last element of an array
		
		for(int i=0;i<n-1;i++) {
			
			// Store the value of i into min variable
			    int min = i;
			    
		// for loop from j=i+1 to the last element of an array
			 for(int j=i+1;j<n;j++) 
				 if(arr[j]<arr[min])
		// Store the less variable value into min
					 min = j;
				 
			 
		// Swap the variables	 
			 int temp = arr[min];
			 arr[min] = arr[i];
			 arr[i] = temp;
		}
		
		for(int i:arr) {
			System.out.print(i+ ",");
		}
		
	}

}
