package ext.basics;

import java.util.Arrays;

public class BestTimeToBuyAndSaleOperation {

	public static void main(String[] args) {
		
		int[] arr = { 2,4,1 };

		System.out.println(buyAndSale(arr));

	}

	public static int buyAndSale(int[] prices) {
		
		int bd = Integer.MAX_VALUE;
		int sd = 0;
		
		for(int i = 0; i<prices.length; i++) {
			if(prices[i] < bd) {
				bd = prices[i];
			}else {
				int profit = prices[i] - bd;
				if(profit > sd) {
					sd = profit;
				}
			}
		}
		
		System.out.println(bd);
		System.out.println(sd);
		
		if(sd < bd) {
			return 0;
		}
		
		System.out.println(Arrays.toString(prices));
		return sd;

	}

}
