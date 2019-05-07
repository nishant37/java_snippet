/** Jewels and Stones (771)
 * You're given strings J representing the types of stones that are jewels, and S 
 * representing the stones you have.  Each character in S is a type of stone you have.  
 * You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class jewelsStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String J ="aA";
         String S = "aAAbbbb";
         int output = numJewelsInStones(J,S);
         System.out.println(output);
	}

	private static int numJewelsInStones(String J, String S) {
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		char[] ch1 = S.toCharArray();
		char[] ch2 = J.toCharArray();
		for(int i=0;i<ch1.length;i++) {
			
			hm.put(ch1[i], hm.getOrDefault(ch1[i], 0)+1);
		}
		
		/*for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
		    System.out.println(entry.getKey()+" : "+entry.getValue());

		}*/
		
		int count = 0;
		for(int j=0;j<ch2.length;j++) {
			if(hm.containsKey(ch2[j])) {
				count += hm.get(ch2[j]);
			}
		}
		
		return count;
	}

}
