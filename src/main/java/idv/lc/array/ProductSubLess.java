package idv.lc.array;

import java.util.*;

class ProductSubLess {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int j = 0;
        long p = 1l; //<-- trap, the init is 1
        int sum = 0;
        while (j < nums.length) {
            p *= nums[j];
            while (i <= j && p >= k) {
                p /= nums[i];
                i++;
            }
            sum += (j - i + 1);
            j++;
        }
        return sum;
    }
}
