/** Backspace String Compare
 * 
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. 
 * # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
 * 
 * 
 * 
 */



import java.util.Stack;

public class backspaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String S = "a##c";
       String T = "#a#c";
       boolean var = backspaceCompare(S,T);
       System.out.println(var);
	}

	private static boolean backspaceCompare(String S, String T) {
	    
		return buildStack(S).equals(buildStack(T));
		
		
	}

	private static String buildStack(String S) {
		// TODO Auto-generated method stub
		
		Stack<Character> st = new Stack<>();
		
		for(char ch : S.toCharArray() ) {
			if(ch!='#') {
				st.push(ch);
			}
			else if(!st.isEmpty()) {
				st.pop();
			}
		}
		
		return String.valueOf(st);
	}

}
