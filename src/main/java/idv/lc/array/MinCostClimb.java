package idv.lc.array;

import java.util.*;

class MinCostClimb {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 0){
            return 0;
        }
        int[] DP = new int[cost.length+1];
        DP[0] = 0;
        DP[1] = 0;
        for(int i=2; i<=cost.length; i++){
            int prev = DP[i-1] + cost[i-1];
            int prev2 = DP[i-2] + cost[i-2];
            DP[i] = Math.min(prev, prev2);
        }
        return DP[cost.length];
    }
}
