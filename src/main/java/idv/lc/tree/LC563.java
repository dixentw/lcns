package idv.lc.tree;

import java.util.*;

public class LC563 {
    public int findTilt(TreeNode root) {
        if (root == null) return 0;
        int lt = findTilt(root.left);
        int rt = findTilt(root.right);
        int l = sum(root.left);
        int r = sum(root.right);
        return Math.abs(l-r) + lt + rt;
    }
    public int sum(TreeNode root) {
        if (root == null) return 0;
        int sLeft = sum(root.left);
        int sRight = sum(root.right);
        return sLeft + sRight + root.val;
    }
}
