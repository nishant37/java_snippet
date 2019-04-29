/*Reverse String II
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from 
 * the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k 
 * but greater than or equal to k characters, then reverse the first k characters and left the other as original.
 * 
 * 
 */

public class reverseStringII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              String str = "abcdefg";
              int k =2;
              String output = reverseStr(str,k);
              System.out.println(output);
	}

	private static String reverseStr(String str, int k) {
		
		char[] ch = str.toCharArray();
		for(int start =0;start<ch.length;start +=2*k) {
			int i = start, j= Math.min(start+k-1, ch.length-1);
			while(i<j) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
		}
		
		return new String(ch);
	}

}
