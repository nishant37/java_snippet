import java.util.Arrays;

// To check if an array is a subset of another array using sorting and merging techniques



public class subset_array_sorting_merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] arr1 = {11,13,21,3,7};
		
		int[] arr2 = {11,3,7,21};
		
		int m = arr1.length;
		int n = arr2.length;
		
        if(checkSubset(arr1,arr2,m,n)) {
        	System.out.println("True");
        }else {
        	System.out.println("False");
        }
        
		
	}

	private static boolean checkSubset(int[] arr1, int[] arr2, int m, int n) {
		// TODO Auto-generated method stub
		
		int i=0,j=0;
		
		if(m<n) return false;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		while(i<n && j<m) {
			if(arr1[j]<arr2[i])
				j++;
			else if (arr1[j]==arr2[i]) {
				i++;
			    j++;
			}else if(arr1[j]>arr2[i])
				return false;
			}
		if(i<n)
			return false;
		else {
			return true;
		}
	}

}
