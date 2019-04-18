/*Given a string containing characters A and B only. Your task is to change it into a string such that there are no 
 * matching adjacent characters.  To do this, you are allowed to delete zero or more characters in the string.
 *Task is to find the minimum number of required deletions.
 *For example, given the string s = AABAAB , remove an A at positions 0  and 3  to make s= ABAB  in 2 deletions.
 *
 *
 *
 */



public class altCharcaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "AABAAB";
     int value =  chkOperation(str);
     System.out.println(value);
	}

	private static int chkOperation(String str) {
		// TODO Auto-generated method stub
		int output = 0;
		
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				output++;
			}
		}
		
		return output;
	}

}
