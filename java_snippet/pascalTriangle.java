/**  Pascal's Triangle
 * 
 * 
 * 
 * 
 * 
 * 
 */


import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n = 5;
         List<List<Integer>> lt = generate(n);
         for(List<Integer> i: lt) {
        	 System.out.println(i);
         }
	}

	private static List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> lt = new ArrayList<List<Integer>>();
		
		
		for(int i=0;i<numRows;i++) {
			List<Integer> lts = new ArrayList<>();
			for(int j=0;j<=i;j++) {
				if(j==0||j==i) 
					lts.add(1);
				
				else 
				   lts.add(lt.get(i-1).get(j-1)+lt.get(i-1).get(j));	
				
			
				
			}
			lt.add(lts);
		}
		
		
		return lt;
	}

}
