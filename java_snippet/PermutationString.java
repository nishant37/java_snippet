/**  Permutation of a String
 * 
 * 
 * 
 * 
 * 
 * 
 */



import java.util.Map;
import java.util.TreeMap;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str="abc";
           computePermute(str);
	}

	private static void computePermute(String str) {
		// TODO Auto-generated method stub
		char[] st = str.toCharArray();
		Map<Character,Integer> mp = new TreeMap<Character,Integer>();
		for(char ch: st) {
		mp.compute(ch, (key,val)->{
			if(val==null) {
				return 1;
			}else {
				return val+1;
			}
			
		});
		}
		
		char [] strs = new char[mp.size()];
		int [] ints = new int[mp.size()];
		int index = 0;
		for(Map.Entry<Character,Integer>entry: mp.entrySet() ) {
			strs[index] = entry.getKey();
			ints[index] = entry.getValue();
			index++;
		}
		
		char [] result = new char[st.length];
		
		permutateUtil(strs,ints,result,0);
		
	}

	private static void permutateUtil(char[] strs, int[] ints, char[] result, int level) {
		// TODO Auto-generated method stub
		
		if (level == result.length) {
			printArray(result);
			return;
		}
		
		for(int i=0;i<strs.length;i++) {
			if(ints[i]==0) {
				continue;
			}
			result[level] = strs[i];
			ints[i]--;
			permutateUtil(strs,ints,result,level+1);
			ints[i]++;
		}
		
		
	}

	private static void printArray(char[] result) {
		// TODO Auto-generated method stub
		for(char ch: result) {
			System.out.print(ch);
			 
		}
		System.out.println("");
	}

}
