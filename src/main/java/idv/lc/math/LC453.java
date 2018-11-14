package idv.lc.math;

import java.util.*;

public class LC453 {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for (int i = 1; i< nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        int diff = 0;
        for (int i=0; i<nums.length; i++) {
            diff += nums[i] - min;
        }
        return diff;

    }
}
