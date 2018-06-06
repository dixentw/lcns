package idv.lc.array;

import java.util.*;

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int[] DP = new int[nums.length];
        DP[0] = nums[0];
        int max = nums[0];
        for(int i=1;i < nums.length; i++){
            DP[i] = Math.max(DP[i-1] + nums[i], nums[i]);
            if(DP[i] > max) {
                max = DP[i];
            }
        }
        return max;
    }
}
