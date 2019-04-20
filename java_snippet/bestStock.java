/**  Best Time to Buy and Sell Stock II
 * Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as 
you like (i.e., buy one and sell one share of the stock multiple times).
 * 
 * 
 * 
 * 
 * 
 *
 */


public class bestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] stock = {7,1,5,3,6,4};
         int value = maxProfit(stock);
         System.out.println(value);
	}

	private static int maxProfit(int[] prices) {
		int sum = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                sum = sum+ (prices[i]-prices[i-1]);
        }
        return sum;
    }
}
