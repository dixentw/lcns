package idv.lc.tree;

import java.util.*;

public class LC865 {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) return null;
        int dl = depth(root.left);
        int dr = depth(root.right);
        if (dl==dr) return root; // it is top down, so the first encounter is that node with deepest nodes.
        if (dl > dr) return subtreeWithAllDeepest(root.left);
        else return subtreeWithAllDeepest(root.right);
    }
    public int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
