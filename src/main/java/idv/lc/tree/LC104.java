package idv.lc.tree;

import java.util.*;

public class LC104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxLv = Math.max(maxDepth(root.left), maxDepth(root.right));
        return maxLv+1;
    }
}
