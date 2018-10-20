package idv.lc.tree;

import java.util.*;

public class LC617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null && t2==null) {
            return null;
        } else if(t1==null && t2 != null) {
            return t2;
        } else if (t1!=null && t2==null) {
            return t1;
        } else {
            TreeNode tr = new TreeNode(t1.val + t2.val);
            tr.left = mergeTrees(t1.left, t2.left);
            tr.right = mergeTrees(t1.right, t2.right);
            return tr;
        }
    }
    public TreeNode mergeTreesBAD(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        int val1 = (t1==null) ? 0 : t1.val;
        int val2 = (t2==null) ? 0 : t2.val;

        TreeNode newNode = new TreeNode(val1+val2);
        TreeNode left1 = (t1==null) ? null : t1.left;
        TreeNode right1 = (t1==null) ? null : t1.right;
        TreeNode left2 = (t2==null) ? null : t2.left;
        TreeNode right2 = (t2==null) ? null : t2.right;
        newNode.left = mergeTrees(left1, left2);
        newNode.right = mergeTrees(right1, right2);
        return newNode;
    }
}
