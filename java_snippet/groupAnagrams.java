/**
 * Group Anagrams in a String and Find the value of the output whose length>1
 * 
 * Ex:  String[] str = {"cat","dog","tac","god","act","value"};
 * Output: [cat, tac, act]
             [dog, god]
 * 
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String[] str = {"cat","dog","tac","god","act","value"};
           printAnagrams(str);
	}

	private static void printAnagrams(String[] str) {
		
		// Initialize the map
		Map<Integer,List<String>> mp = new HashMap<>();
		
		// Loop through the array of string
		for(int i=0;i<str.length;i++) {
			// Store each value of an array into the String
			String word = str[i];
			// Convert each word to the character array
			char[] chs = word.toCharArray();
			// Sort each character array
			Arrays.sort(chs);
			// Make a new string and convert charcter array to the String
			String newValue = new String(chs);
			// Compute the hashcode of each string
			int hashcode = newValue.hashCode();
			
			// To check if map contains the hashcode
			if(mp.containsKey(hashcode)) {
				List<String> words = mp.get(hashcode);
				words.add(word);
				mp.put(hashcode, words);
			}else {
				List<String> words = new ArrayList<>();
				words.add(word);
				mp.put(hashcode, words);
			}
			
		}
		
		// Iterate through the map and find the values of arraylist whose length is >1
		for(Integer i: mp.keySet()) {
			List<String> lt = mp.get(i);
			if(lt.size()>1) {
				System.out.println(lt);
			}
		}
		
	}

}
