package algorithms.arrays;

class BestTimeToBuyAndSell {

    /*
    You are given an integer array prices where prices[i] is the price of a
    given stock on the ith day.

    On each day, you may decide to buy and/or sell the stock. You can only hold
    at most one share of the stock at any time. However, you can buy it then
    immediately sell it on the same day.

    Find and return the maximum profit you can achieve.
     */

    private static int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int potential = 0;
        int profit = 0;

        // start with left at 0 and right at 1
        while (r < prices.length) {
            // find the profit if you sold
            int profitIfSOld = prices[r] - prices[l];
            // if profit would be positive
            if (profitIfSOld > 0) {
                // but worse than yesterday
                if ( profitIfSOld < potential ) {
                    // take the profit
                    profit += potential;
                    // sell yesterday, buy tomorrow
                    l = r--;
                    // reset potential
                    potential = 0;
                } else {
                    // more profit than yesterday
                    // save this as potential profit
                    potential = profitIfSOld;

                }
            } else {
                // profit would be negative
                if (potential > 0) {
                    // take the profit
                    profit += potential;
                    // reset potential
                    potential = 0;
                }
                // buy more
                l = r;
            }
            // go to bed, wake up the next day
            r++;
        }
        return profit + potential;
    }

    private static int rev(int x) {
        return Integer.parseInt(new StringBuilder().append(x).reverse().toString());
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

}