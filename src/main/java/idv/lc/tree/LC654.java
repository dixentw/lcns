package idv.lc.tree;

import java.util.*;

public class LC654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    public TreeNode helper(int[] nums, int start, int end) {
        //[FAIL] start==end is leaf
        if (start > end) return null;
        int max = Integer.MIN_VALUE;
        int maxIdx = 0;
        for (int i=start; i<=end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }
        TreeNode tr = new TreeNode(max);
        tr.left = helper(nums, start, maxIdx-1);
        tr.right = helper(nums, maxIdx+1, end);
        return tr;
    }
}
