/** DI String Match
 * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.

Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:

If S[i] == "I", then A[i] < A[i+1]
If S[i] == "D", then A[i] > A[i+1]
 * 
 * 
 * 
 * 
 *
 */

public class DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String st = "IDID";
             int [] arr = diStringMatch(st);
             for(int i: arr) {
            	 System.out.print(i);
             }
	}
	
	  public static int[] diStringMatch(String S) {
	        int n = S.length();
	        int low =0; 
	        int high = n;
	        int [] an = new int[n+1];
	        for(int i=0;i<n;i++){
	          if(S.charAt(i)=='I')
	              an[i] = low++;
	           else
	               an[i]= high--;
	        }
	        
	        an[n]= low;
	        return an;
	    }

}
