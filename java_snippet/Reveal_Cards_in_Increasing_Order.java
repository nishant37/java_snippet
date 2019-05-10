/* 950:Reveal Cards In Increasing Order
 * 
 * 
 * 
 * 
 */


import java.util.Arrays;
import java.util.*;
import java.util.LinkedList;

public class Reveal_Cards_in_Increasing_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] deck = {17,13,11,2,3,5,7};
		int[] output = deckRevealedIncreasing(deck);
        for(int i:output) {
        	System.out.println(i);
        }
	}

	private static int[] deckRevealedIncreasing(int[] deck) {
	
		int n= deck.length;
        Arrays.sort(deck);
        Queue<Integer> q= new LinkedList<>();
        for (int i=0; i<n; i++) q.add(i);
        int[] res= new int[n];
        for (int i=0; i<n; i++){
        	
            res[q.poll()]=deck[i];
          
            q.add(q.poll());

        }
        return res;
	   
	  }

}
