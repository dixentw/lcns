package idv.lc.tree;

import java.util.*;

public class LC255 {
    public boolean verifyPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length-1, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    boolean helper(int[] nums, int start, int end, int min, int max) {
        if (start > end) return true;
        int root = nums[start];
        if (root > max || root < min) return false;
        int pivot = start;
        while (pivot <= end && nums[pivot] <= root) pivot++;
        boolean left = helper(nums, start+1, pivot-1, min, root);
        boolean right = helper(nums, pivot, end, root, max);
        return left && right;
    }
}
