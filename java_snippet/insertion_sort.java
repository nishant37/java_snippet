
public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = {12,11,3,5,1};
         insert_sort(arr);
	}

	private static void insert_sort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		
		for(int i=1;i<len;i++) {
			
			int key = arr[i];
			
			int j = i-1;
			
			while(j>=0&&arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
			
		}
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
		
	}

}
