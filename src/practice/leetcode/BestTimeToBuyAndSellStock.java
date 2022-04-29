package practice.leetcode;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = { 7, 5, 3, 6, 4, 1 };
		System.out.println(maxProfit(prices));
		System.out.println(maxProfitBrute(prices));
	}

	private static int maxProfit(int[] prices) {
		int least = Integer.MAX_VALUE;
		int overallProfit = 0;
		int profitToday = 0;
		for (int i = 0; i < prices.length; i++) {
			if (least > prices[i]) {
				least = prices[i];
			}
			profitToday = prices[i] - least;
			if (profitToday > overallProfit) {
				overallProfit = profitToday;
			}
		}
		return overallProfit;
	}

	private static int maxProfitBrute(int[] prices) {
		int res = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int diff = prices[j] - prices[i];
				if (res < diff) {
					res = diff;
				}
			}
		}
		return res;
	}

}
