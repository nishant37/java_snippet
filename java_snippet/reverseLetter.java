/** Reverse Only Letters
 * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, 
 * and all letters reverse their positions.
 * Example 1:

Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!" 
 * 
 * 
 * 
 * 
 */



import java.util.Stack;

public class reverseLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String st ="ab-cd";
            String output = reverseOnlyLetters(st);
            System.out.println(output);       		
	}

	private static String reverseOnlyLetters(String st) {
		
		Stack<Character> stk = new Stack<>();
		for(char ch : st.toCharArray()) {
			if(Character.isLetter(ch)) {
				stk.add(ch);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(char ch : st.toCharArray()) {
			if(Character.isLetter(ch)) {
				sb.append(stk.pop());
			}
			else {
				sb.append(ch);
			}
		}
		
		
		
		return sb.toString();
	}

}
