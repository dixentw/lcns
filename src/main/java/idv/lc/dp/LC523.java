package idv.lc.dp;

import java.util.*;

public class LC523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) return false;
        Map<Integer, Integer> map = new HashMap<>();
        int preSum = 0;
        for (int i=0; i<nums.length; i++) {
            preSum += nums[i];
            int modSum = (k!=0) ? preSum %k : preSum;
            if (modSum == 0 && i>=1) return true;
            if (map.containsKey(modSum)) {
                if (i - map.get(modSum) > 1) return true;
            } else {
                map.put(modSum, i);
            }
        }
        return false;
    }
}
