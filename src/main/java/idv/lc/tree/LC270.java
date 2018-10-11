package idv.lc.tree;

import java.util.*;

public class LC270 {
    public int closestValue(TreeNode root, double target) {
        int a = root.val;
        TreeNode next = target < a ? root.left : root.right;
        if (next == null) return a;
        int b = closestValue(next, target);
        double da = Math.abs(a - target);
        double db = Math.abs(b - target);
        return da > db ? b : a;
    }
    public int closestValueOld(TreeNode root, double target) {
        double[] diff = new double[1];
        diff[0] = Double.MAX_VALUE;
        int[] closest = new int[1];
        helper(root, target, diff, closest);
        return closest[0];
    }
    public void helper(TreeNode node, double target, double[] diff, int[] closest) {
        if (node == null) return;
        if (target == (double) node.val) {
            closest[0] = node.val;
            diff[0] = 0;
            return;
        }
        TreeNode next;
        if (target > (double) node.val) {
            next = node.right;
        } else {
            next = node.left;
        }
        double d = Math.abs(target - (double)node.val);
        if (d < diff[0]) {
            diff[0] = d;
            closest[0] = node.val;
        }
        helper(next, target, diff, closest);
    }
}
