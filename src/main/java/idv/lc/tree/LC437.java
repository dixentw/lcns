package idv.lc.tree;

import java.util.*;

public class LC437 {

    public int pathSum(TreeNode root, int sum) {
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        return helperPreSum(root, 0, sum, preSum);
    }

    public int helperPreSum(TreeNode node, int currSum, int target, Map<Integer,Integer> preSum) {
        if (node == null) return 0;
        currSum += node.val;
        int res = preSum.getOrDefault(currSum - target, 0);
        preSum.put(currSum, preSum.getOrDefault(currSum, 0) + 1);
        res += helperPreSum(node.left, currSum, target, preSum) + helperPreSum(node.right, currSum, target, preSum);
        // remove current, since we going back.
        preSum.put(currSum, preSum.get(currSum) - 1);
        return res;
    }

    public int pathSumDFS(TreeNode root, int sum) {
        if (root == null) return 0;
        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    public int helper(TreeNode node, int sum) {
        if (node == null) return 0;
        int curr = (sum == node.val) ? 1 : 0;
        return curr + helper(node.left, sum-node.val) + helper(node.right, sum-node.val);
    }
}
