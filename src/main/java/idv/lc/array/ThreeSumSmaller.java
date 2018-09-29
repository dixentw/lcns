package idv.lc.array;

import java.util.*;

public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        int res = 0;
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++) {
            int start = i+1;
            int end = nums.length-1;
            while (start < end) {
                if (nums[i] + nums[start] + nums[end] < target) {
                    res += end - start;
                    start++;
                } else {
                    end--;
                }
            }
        }
        return res;
    }
}
