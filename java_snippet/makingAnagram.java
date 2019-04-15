// Count the number of operations performed to make the Two Strings anagrams
/**
 * For example: String1 = abc
 * String2 = cde
 * Number of operations performed to make them anagram is 4
 * 
 */



import java.util.HashMap;
import java.util.Map;


public class makingAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str1 = "abc";
          String str2 = "cde";
          countOperations(str1,str2);
	}

	private static void countOperations(String str1, String str2) {
		// Initialize the hashmap
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
	
		// Loop through String1 and add the values to the hashmap
		for(int i=0;i<str1.length();i++) {
			if(hm.containsKey(str1.charAt(i))) {
				int value = hm.get(str1.charAt(i));
				hm.put(str1.charAt(i), value+1);
			}else {
				hm.put(str1.charAt(i), 1);
			}
			
		}
		
		// Loop through String2 and check if the values exist in the hashmap or not
		
		int count = 0;
		for(int i=0;i<str2.length();i++) {
		
			if(hm.containsKey(str2.charAt(i))) {
				int value = hm.get(str2.charAt(i));
					if(value==1) {
						hm.remove(str2.charAt(i));
						}
					else {
						hm.put(str2.charAt(i), value-1);
					}
				
				}else {
				      count++;
			}
			
	}
		
		for(Integer i: hm.values() ) {
			count = count+i;
		}
		
		System.out.println("Number of operations performed to make the two Strings anagram are: "+count);
		
	}

}
