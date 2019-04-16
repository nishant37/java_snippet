/**
 * Number of Matching Subsequences
 * Given string S and a dictionary of words words, 
 * find the number of words[i] that is a subsequence of S.
 * 
 * Example :
Input: 
S = "abcde"
words = ["a", "bb", "acd", "ace"]
Output: 3
Explanation: There are three words in words that are a subsequence of S: "a", "acd", "ace".
 * 
 * 
 * 
 * 
 */


import java.util.*;

public class matched {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String str="abcde";
            String[] words = {"a","bb","acd","ace"};
            int val = matchedSubseq(str,words);
            System.out.println(val);
	}

	private static int matchedSubseq(String str, String[] words) {
		// TODO Auto-generated method stub
		int count =0;
		Map<Character,List<Integer>> mp = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!mp.containsKey(ch))
				mp.put(ch, new ArrayList<Integer>());
			mp.get(ch).add(i);
		}
		for(String word: words) {
			int index = -1;
			boolean boolVal = true;
			for(int i=0;i<word.length();i++) {
				boolean flag = false;
				char ch = word.charAt(i);
				if(!mp.containsKey(ch)) {
					boolVal = false;
					break;
				}
				List<Integer> lt = mp.get(ch);
				for(int j=0;j<lt.size();j++) {
					if(lt.get(j)>index) {
						flag = true;
						index = lt.get(j);
						break;
					}
				}
				if(!flag) {
					boolVal = false;
					break;
				}
			}
				if(boolVal) {
					count++;
				}
				
			
		}
		
		
		
		return count;
	}

}
