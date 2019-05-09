/*1021. Remove Outermost Parentheses
 * 
 * 
 * 
 *
 */


public class removeOuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String S = "(()())(())";
         String output = removeOuterParentheses(S);
         System.out.println(output);
	}

	private static String removeOuterParentheses(String s) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
	    int count =0;
	    for(int i=0;i<s.length();i++) {
	    	char ch = s.charAt(i);
	    	if(ch=='(') {
	    		count++;
	    		if(count!=1) {
	    			sb.append(ch);
	    		}
	    	}else if(ch==')') {
	    		count--;
	    		if(count!=0) {
	    			sb.append(ch);
	    		}
	    	}
	    	
	    }
		
		return sb.toString();
	}

}
