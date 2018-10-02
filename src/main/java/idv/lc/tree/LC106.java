package idv.lc.tree;

import java.util.*;

public class LC106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1);
    }
    public TreeNode helper(int[] postorder, int ps, int pe, int[] inorder, int is, int ie) {
        if (ps > pe || is > ie) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        for (int i=is; i<=ie; i++) {
            if (inorder[i] == postorder[pe]) {
                root.left = helper(postorder, ps, ps+(i-is)-1, inorder, is, i-1);
                root.right = helper(postorder, ps+(i-is), pe-1, inorder, i+1, ie);
                break;
            }
        }
        return root;
    }
}
