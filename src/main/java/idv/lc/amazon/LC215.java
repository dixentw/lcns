package idv.lc.amazon;

import java.util.*;

public class LC215 {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int start = 0;
        int end = nums.length-1;
        while (start < end) {
            int pivot = helper(nums, start, end);
            if (pivot == k) {
                break;
            } else if (pivot < k) {
                start = pivot+1;
            } else {
                end = pivot-1;
            }
        }
        return nums[k];
    }
    public int helper(int[] nums, int start, int end) {
        int p = nums[start];
        int j = start+1;
        for (int i=start+1; i<=end; i++) {
            if (nums[i] < p) {
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                j++;
            }
        }
        j--;
        int tmp = nums[j];
        nums[j] = nums[start];
        nums[start] = tmp;
        return j;
    }
}
