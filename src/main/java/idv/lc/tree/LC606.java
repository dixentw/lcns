package idv.lc.tree;

import java.util.*;

public class LC606 {
    public String tree2str(TreeNode t) {
        if (t == null) return "";
        String curr = String.valueOf(t.val);
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        if (left == "" && right =="") return curr;
        if (left == "" ) return curr + "()" +"(" + right + ")";
        if (right == "" ) return curr + "(" + left + ")";
        return curr + "(" + left + ")" + "(" + right + ")";
    }
}
