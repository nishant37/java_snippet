/**  Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */
 
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char[] S = {'h','e','l','l','o'};
     reverse(S);
	}

	private static void reverse(char[] s) {
        int left = 0;
		int right = s.length-1;
		
		while(left<right){
			char temp = s[left];
			
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
		System.out.println(s);
    }
}
