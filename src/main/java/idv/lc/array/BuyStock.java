package idv.lc.array;

import java.util.*;

class BuyStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(lowPrice > prices[i]){
                lowPrice = prices[i];
            }
            if(maxProfit < prices[i] - lowPrice) {
                maxProfit = prices[i] - lowPrice;
            }
        }
        return maxProfit;
    }
}
