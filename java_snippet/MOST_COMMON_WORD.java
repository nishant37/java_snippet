/** 819. Most Common Word
 * 
 * 
 * 
 * 
 * 
 */


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MOST_COMMON_WORD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "Bob, hit, ball, value";
		String[] banned = {"hit"};
		String output = mostCommonWord(paragraph,banned);
		System.out.println(output);
	}

	private static String mostCommonWord(String paragraph, String[] banned) {
		
		Set<String> st = new HashSet<>();
		
		for(String ban:banned) {
			st.add(ban);
		}
		Map<String,Integer> paramap = new HashMap<>();
		for(String word: paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase().split(" ")) {
			if(!st.contains(word))
				paramap.put(word, paramap.getOrDefault(word, 0)+1);
		}
		
		//System.out.println(paramap);
		
		String result="";
		for(String key:paramap.keySet()) {
			if(result.equals("") || paramap.get(key)>paramap.get(result)) {
				//System.out.println(result);
				result = key;
			}
		}
		
		
		
		return result;
	}

}
