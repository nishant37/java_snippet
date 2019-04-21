/**  First Unique Character in a String
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


import java.util.HashMap;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "leetcode";
        int unique = firstUniqChar(s);
        System.out.println(unique);
	}

	private static int firstUniqChar(String s) {

		  HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
			
			for(int i=0;i<s.length();i++){
				Character val = s.charAt(i);
				hm.put(val, hm.getOrDefault(val, 0)+1 );
			}
			
			//System.out.println(Arrays.asList(hm));
			
			for(int i=0;i<s.length();i++){
				if(hm.get(s.charAt(i))==1){
					return i;
				}
			}
			
			return -1;
		}
}
