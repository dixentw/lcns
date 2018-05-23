package idv.lc.array;

import java.util.*;

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int[] DP = new int[nums.length+1];
        DP[0] = 0;
        int max = Integer.MIN_VALUE;
        for(int i=1;i < DP.length; i++){
            DP[i] = Math.max(DP[i-1] + nums[i-1], nums[i-1]);
            if(DP[i] > max) {
                max = DP[i];
            }
        }
        return max;
    }
}
