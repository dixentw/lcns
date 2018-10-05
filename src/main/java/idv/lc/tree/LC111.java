package idv.lc.tree;

import java.util.*;

public class LC111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left==0 || right==0) {
            return left + right + 1; //the non zero length should be taken, this code is most concise
        }
        return Math.min(left, right)+1;
    }
}
