import java.util.HashMap;

public class validAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "anagram";
        String t ="nagaram";
      boolean b =  checkAnagram(s,t);
      System.out.println(b);
	}

	
	private static boolean checkAnagram(String s, String t) {
		// TODO Auto-generated method stub
		
		  if(s.length()!=t.length())
	            return false;
	        int[] count = new int[26];
	        for(int i=0;i<s.length();i++){
	            count[s.charAt(i) - 'a']++;
	            count[t.charAt(i) - 'a']--;
	        }
	        for(int i:count){
	            if(i!=0){
	                return false;
	            }
	           
	        }
	         return true;
	    }
	}
	


