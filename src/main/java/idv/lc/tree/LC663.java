package idv.lc.tree;

import java.util.*;

public class LC663 {
    public boolean checkEqualTree(TreeNode root) {
        if (root == null) return false;
        Set<Integer> sum = new HashSet<>();
        int totalSum = root.val + subsum(root.left, sum) + subsum(root.right, sum);
        return (totalSum %2==0)&& sum.contains(totalSum/2);
    }
    public int subsum(TreeNode root, Set<Integer> sum) {
        if (root == null) return 0;
        int currSum = root.val +
            subsum(root.left, sum) +
            subsum(root.right, sum);
        sum.add(currSum);
        return currSum;
    }
}
