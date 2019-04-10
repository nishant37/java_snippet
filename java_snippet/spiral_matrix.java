/**
 * Spiral Matrix
 * 
 * Given a matrix of m x n elements (m rows, n columns),
 *  return all elements of the matrix in spiral order.
 * 
 * Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 */


import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       List<Integer> lt =  spiralOutput(matrix);
        for(int i:lt) {
        	System.out.print(i+ " ");
        }
	}

	
	private static List<Integer> spiralOutput(int[][] matrix) {
		// TODO Auto-generated method stub
		
		List<Integer> ans = new ArrayList<Integer>();
		if(matrix.length==0) return ans;
		
	     int rowStart = 0;
	     int rowEnd = matrix.length-1;
	     
	     int colStart = 0;
	     int colEnd = matrix[0].length-1;
	    
	     while(rowStart<=rowEnd && colStart<=colEnd) {
	    	 for(int i=colStart;i<=colEnd;i++) {
	    		 //System.out.println(matrix[rowStart][i]);
	    		 ans.add(matrix[rowStart][i]);
	    	 }
	    	 rowStart++;
	    	 
	    	 for(int i=rowStart;i<=rowEnd;i++) {
	    		 ans.add(matrix[i][colEnd]);
	    	 }
	    	 colEnd--;
	    	
	    	 if(rowStart<=rowEnd) {
	    		 for(int i=colEnd;i>=colStart;i--) {
	    			 ans.add(matrix[rowEnd][i]);
	    		 }
	    		
	    	 }
	    	 rowEnd--;
	    	 
	    	 if(colStart<=colEnd) {
	    		 for(int i=rowEnd;i>=rowStart;i--) {
	    			 ans.add(matrix[i][colStart]);
	    		 }
	    		
	    	 }
	    	 colStart++;
	     }
		
		return ans;
	}

}
