package idv.lc.tree;

import java.util.*;

public class LC549 {
    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
        //path pass throught root
        int l1 = helper(root.left, root.val, -1) + helper(root.right, root.val, 1) + 1;
        int l2 = helper(root.left, root.val, 1) + helper(root.right, root.val, -1) + 1;
        int childLongL = longestConsecutive(root.left);
        int childLongR = longestConsecutive(root.right);
        int cpc = Math.max(l1 , l2);
        int c = Math.max(childLongL, childLongR);
        return Math.max(cpc, c);
    }
    public int helper(TreeNode root, int parent, int diff) {
        if (root == null) return 0;
        if (root.val == parent+diff) {
            int left = helper(root.left, root.val, diff);
            int right = helper(root.right, root.val, diff);
            return Math.max(left, right) + 1;
        }
        return 0;
    }
    /*
    public int longestConsecutive(TreeNode root) {
        int[] max = new int[1];
        helper(root, max);
        return max[0];
    }
    public int[] helper(TreeNode root, int[] max) {
        if (root == null) return new int[]{0, 0};
        int inc = 1;
        int dec = 1;
        if (root.left != null) {
            int[] l = helper(root.left, max);
            if (root.val == root.left.val + 1) {
                dec = Math.max(dec, l[1] + 1);
            } else if (root.val == root.left.val - 1){
                inc = Math.max(inc, l[0] + 1);
            }
        }
        if (root.right != null) {
            int[] r = helper(root.right, max);
            if (root.val == root.right.val + 1) {
                dec = Math.max(dec, r[1]+1);
            } else if (root.val == root.right.val - 1) {
                inc = Math.max(inc, r[0]+1);
            }
        }
        max[0] = Math.max(max[0], inc+dec-1);
        return new int[]{inc, dec};
    }*/
}
