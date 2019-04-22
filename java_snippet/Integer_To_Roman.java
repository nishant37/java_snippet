/** Given an integer convert it into Roman numeral
 * 
 * 
 * 
 * 
 * 
 *
 */


public class Integer_To_Roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n = 489;
         String return_value = intToRoman(n);
         System.out.println(return_value);
	}

	private static String intToRoman(int n) {
		  StringBuffer val = new StringBuffer();
			if(n>=1000){
				int len=n/1000;
	            for(int i=0;i<len;i++){
	                val.append("M");
	                n-=1000;
	            }
			}
			if(n>=500){
				if(n<900){
					val.append("D");
					n -=500;
				}
				else{
					val.append("CM");
					n -=900;
				}
			}
			if(n>=100){
				if(n<400){
					int l = n/100;
					for(int i=1;i<=l;i++){
						val.append("C");
						n -=100;
					}
				}
				else{
					val.append("CD");
					n -=400;
				}
			}
			if(n>=50){
				if(n<90){
					val.append("L");
					n -=50;
				}
				else{
					val.append("XC");
					n -=90;
				}
			}
			if(n>=10){
				if(n<40){
					int length = n/10;
					for(int i=1;i<=length;i++){
						val.append("X");
						n -=10;
					}	
				}
				else{
					val.append("XL");
					n -=40;
				}
			}
			if(n>5&&n<10){
				if(n<9){
					val.append("V");
					n -=5;
				}
				else if(n==9){
					val.append("IX");
				}
				
			}
			if(n>=0 && n<=5){
				if(n<4){
					for(int i=1;i<=n;i++){
					val.append("I");
					
					}
				}
				else if(n==4){
				  val.append("IV");
					n =0;
				}
				else{
					 val.append("V");
					n=0;
				}
			}
			return val.toString();
	    }

}
