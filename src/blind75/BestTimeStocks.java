package blind75;

public class BestTimeStocks {

// You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.

// You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.

// Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0.

// Example 1:

// Input: prices = [10,1,5,6,7,1]

// Output: 6
// Explanation: Buy prices[1] and sell prices[4], profit = 7 - 1 = 6.

// Example 2:

// Input: prices = [10,8,7,5,2]

// Output: 0
// Explanation: No profitable transactions can be made, thus the max profit is 0.

// Constraints:

// 1 <= prices.length <= 100
// 0 <= prices[i] <= 100

    public int maxProfit(int[] prices) {

        int profit = 0; 
        int maxProfit = 0; 

        for(int i = 0; i < prices.length; i++){
            for(int k = i+1; k < prices.length; k++){
                if(prices[i]<prices[k]){
                    profit = prices[k] - prices[i];
                }

                if(profit>maxProfit){
                    maxProfit = profit; 
                }
            }
        }

        return maxProfit;
        
    }

    //alternative using Math.max
    public int maxProfitBetter(int[] prices) {

        int maxProfit = 0; 

        for(int i = 0; i < prices.length; i++){
            for(int k = i+1; k < prices.length; k++){
                maxProfit = Math.max(maxProfit, prices[k]-prices[i]);
            }
        }

        return maxProfit;
        
    }


    // using 2 pointers
    public int maxProfitPointers(int[] prices) {

        int l = 0, r = 1; 
        int maxProfit = 0; 

        while(r < prices.length){
            if(prices[l]<prices[r]){
                maxProfit = Math.max(maxProfit, prices[r]-prices[l]);
            } else {
                l = r; 
            }
            r++;
        }

        return maxProfit;
        
    }

    // using dynamic programming
    public int maxProfitDP(int[] prices) {

        int buy = prices[0];
        int maxProfit = 0; 

        for(int sell : prices){
            maxProfit = Math.max(maxProfit, sell - buy);
            buy = Math.min(buy, sell);
        }

        return maxProfit;
        
    }
    
}
