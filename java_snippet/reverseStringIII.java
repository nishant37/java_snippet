/** 557. Reverse Words in a String III
 * 
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
 * 
 * 
 * 
 * @author nisha
 *
 */



public class reverseStringIII {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str ="Let's take LeetCode contest";
		String word = reverseStr(str);
		System.out.println(word);
		
	}

	private static String reverseStr(String s) {
		
		
		String[] split = s.split("\\s+");
		String finalWord="";
		for(int i=0;i<split.length;i++) {
			String word = split[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord = reverseWord+word.charAt(j);
			}
			
			finalWord = finalWord+reverseWord+ " ";
			
		}
		
		finalWord = finalWord.trim();
		
		return finalWord;
	}

}
