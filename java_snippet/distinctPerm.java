// To get the distinct Permutations of a String


import java.util.ArrayList;

public class distinctPerm {

	public static void main(String[] args) {
		
         String str = "abc";
         System.out.println(distinctPermute(str));
	}

	private static ArrayList<String> distinctPermute(String str) {
		
		   if (str.length() == 0) { 
			  
            
            ArrayList<String> empty = new ArrayList<>(); 
            empty.add(""); 
            return empty; 
        } 
		   
		// Get the first character of the String
	        char ch = str.charAt(0); 
	        
	    // Get the substring starting from the second character
	        String subStr = str.substring(1); 
	        
	        
	  
	     // Call the function recursively
	        ArrayList<String> prevResult = distinctPermute(subStr); 
	        
	     // Store the final result into the arraylist
	        ArrayList<String> Res = new ArrayList<>(); 
	  
	        for (String val : prevResult) { 
	            for (int i = 0; i <= val.length(); i++) { 
	                Res.add(val.substring(0, i) + ch + val.substring(i)); 
	            } 
	        } 
		

		
		
		return Res;
	}

}
