/**
 * 
 * Transpose Matrix
 * 
 * Given a matrix A, return the transpose of A.

   The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
 * 
 * Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
 * 
 * 
 * @author Nishant
 *
 */





public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
       int[][] ans = matrix_transpose(arr);
       for(int i=0;i<ans.length;i++) {
    	   for(int j=0;j<ans[0].length;j++) {
    		   System.out.print(ans[i][j]);
    	   }
       }
	}

	private static int[][] matrix_transpose(int[][] A) {
		// TODO Auto-generated method stub
		
		// get the number of rows from 2-d array
		int row = A.length;
		
		// get the number of columns from 2-d array
		int column = A[0].length;
		
		// Define the empty 2-d matrix where the result will be stored
		int[][] ans = new int[column][row];
		
		// Loop from the A and store the values into ans
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				ans[j][i] = A[i][j];
			}
		}
		
		return ans;
	}

}
