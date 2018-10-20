package idv.lc.tree;

import java.util.*;

public class LC572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null || t == null) return false;
        return isSubtree(s.right, t) || isSubtree(s.left, t) || same(s, t);
    }
    public boolean same(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s != null && t == null) return false;
        if (s == null && t != null) return false;
        return s.val == t.val && same(s.left, t.left) && same(s.right, t.right);
    }
}
