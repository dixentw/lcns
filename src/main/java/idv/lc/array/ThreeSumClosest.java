package idv.lc.array;

import java.util.*;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int minSum = 0;
        for (int i=0; i<nums.length-2; i++) {
            int start = i+1;
            int end = nums.length-1;
            while (start < end) {
                int val = nums[i] + nums[start] + nums[end];
                if (Math.abs(val - target) < minDiff) {
                    minDiff = Math.abs(val - target);
                    minSum = val;
                }
                if (val-target <0) {
                    start++;
                }else{
                    end--;
                }
            }
        }
        return minSum;
    }
}
