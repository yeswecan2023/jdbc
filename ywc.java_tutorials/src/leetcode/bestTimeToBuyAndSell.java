package leetcode;

import java.util.Arrays;
import java.util.List;

public class bestTimeToBuyAndSell {

	public static void main(String[] args) {
		int[] price = {7, 1, 5, 1, 6, 7};
		
		if(price == null || price.length == 0) {
			System.out.println("0");
		}
		
		int profit = 0;
		int buying_price = price[0];
		
		for ( int i =1; i< price.length; i++ ) {
			if(price[i] <= buying_price) {
				buying_price = price[i];
				continue;
			}
			profit = Math.max(profit, price[i]-buying_price);
		}
		System.out.println(profit);
	}

}
