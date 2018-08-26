package idv.lc.array;

import java.util.*;

public class BuyStock2 {
    public int maxProfit(int[] prices) {
        int result = 0;
        if (prices.length < 2) {
            return result;
        }
        int start = 0;
        int end = 0;
        for (int i=1; i<prices.length; i++) {
            int diff = prices[i] - prices[i-1];
            if ( diff > 0) {
                end = i;
            } else {
                if (end > start) {
                    result += prices[end] - prices[start];
                }
                start = i;
            }
        }
        if (end > start) {
            result += prices[end] - prices[start];
        }
        return result;
    }
}
