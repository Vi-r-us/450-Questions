package array;


public class MaxProfitFromStocks {

	public static void main(String[] args) {
		// 26 : Maximum profit by buying and selling a share at most twice
		
		int[] prices = {10, 22, 5, 75, 65, 80};
		
		int n = prices.length;
		int profit[] = new int[n];

        int max_price = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {

            if (prices[i] > max_price)
                max_price = prices[i];

            profit[i] = Math.max(profit[i + 1],
                                 max_price - prices[i]);
        }
 
        int min_price = prices[0];
        for (int i = 1; i < n; i++) {

            if (prices[i] < min_price)
                min_price = prices[i];

            profit[i] = Math.max(
                profit[i - 1],
                profit[i] + (prices[i] - min_price));
        }
        int result = profit[n - 1];
        
        System.out.println(result);
		
	}

}
