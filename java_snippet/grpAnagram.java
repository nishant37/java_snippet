/** Grouping Anagrams in java
 * Given an array of strings, group anagrams together.
 * 
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 * 
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class grpAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String strs[] = {"eat","tea","tan","ate","nat","bat"};
     List<List<String>> ls =   groupAnagrams(strs);
       for(List<String> st:ls) {
    	   System.out.println(st);
       }
      }
	
	 @SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<List<String>> groupAnagrams(String[] strs) {
		 if(strs.length==0) {
			 return new ArrayList();
		 }
		 
		 Map<String,List> mp = new HashMap<String,List>();
		 for(String st:strs) {
			 char[] cha = st.toCharArray();
			 Arrays.sort(cha);
			 String value = String.valueOf(cha);
			 if(!mp.containsKey(value)) mp.put(value, new ArrayList());
			 mp.get(value).add(st);
		 }
		 
		 
		 
		 return new ArrayList(mp.values());
		 
		 
		 
	 }
	 

}
