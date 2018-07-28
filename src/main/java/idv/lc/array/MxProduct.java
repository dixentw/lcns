package idv.lc.array;

import java.util.*;

public class MxProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int p = nums[n] * nums[n-1] * nums[n-2];
        int neg = nums[n] * nums[0] * nums[1];
        return (p > neg) ? p : neg;

    }
}
