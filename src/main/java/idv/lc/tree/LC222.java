package idv.lc.tree;

import java.util.*;

public class LC222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int levelLeft = helperLeft(root.left);
        int middle = helperLeft(root.right);
        int count = 1;
        if (levelLeft == middle) { // the left subtree is full
            count += (1<<levelLeft) - 1;
            count += countNodes(root.right);
        } else { // the right is full at height-1, left is not complete
            count += (1<<middle) -1;
            count += countNodes(root.left);
        }
        return count;
    }
    public int helperLeft(TreeNode node) {
        int i = 0;
        TreeNode cur = node;
        while (cur != null) {
            cur = cur.left;
            i++;
        }
        return i;
    }
}
