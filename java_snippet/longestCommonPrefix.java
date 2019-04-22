

public class longestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		String[] strs = {"flower","flow","flight"};
		String prefix = longCommon(strs);
		System.out.println(prefix);
	}

	private static String longCommon(String[] strs) {
		// TODO Auto-generated method stub
		
		if(strs==null || strs.length==0) {
			return "";
		}
		String longest = strs[0];
		for(int i=1;i<strs.length;i++) {
			String character = strs[i];
			int j =0;
			while(j<longest.length() && j<character.length() && longest.charAt(j)==character.charAt(j)) {
				j++;
			}
			if(j==0) {
				return "";
			}
			longest = longest.substring(0, j);
		}
		
		
		return longest;
	}

}
