package idv.lc.tree;

import java.util.*;

public class LC666 {
    public int pathSum(int[] nums) {
        int[][] leaves = new int[5][9]; //represent how many times it should multiply for calculate path sum. the root is multiply most time
        int res = 0;
        for (int i=nums.length-1; i>=0; i--) {
            int d = nums[i] / 100;
            int idx = nums[i]%10 / 10;
            if (leaves[d][idx] == 0) leaves[d][idx] = 1;
            leaves[d-1][(idx+1)/2] += leaves[d][idx];
            res += nums[i]%10 * leaves[d][idx];
        }
        return res;
    }

    public int pathSumIncomplete(int[] nums) {
        int[] res = new int[1];
        helper(nums, 1, 1, 0, res);
        return res[0];
    }
    public void helper(int[] nums, int index, int depth, int path, int[] res) {
        // find array num
        int target = depth*10 + index;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]/10 == target) {
                helper(nums, index*2-1, depth+1, path+nums[i]%10, res);
                helper(nums, index*2, depth+1, path+nums[i]%10, res);

            }
        }
    }
}
