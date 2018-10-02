package idv.lc.tree;

import java.util.*;

public class LC536 {
    public TreeNode str2tree(String s) {
        TreeNode root = null;
        if (s.length() == 0) return root;
        Stack<Character> st = new Stack<>();
        int lcs = s.indexOf('(');
        if (lcs == -1) {
            return new TreeNode(Integer.parseInt(s));
        } else {
            root = new TreeNode(Integer.parseInt(s.substring(0, lcs)));
        }
        if (lcs == -1) return root;
        st.push(s.charAt(lcs));
        int i = lcs+1;
        while (!st.empty()) {
            if (s.charAt(i) == '(') {
                st.push('(');
            }
            else if (s.charAt(i) == ')') {
                st.pop();
            }
            i++;
        }
        root.left = str2tree(s.substring(lcs+1, i-1));
        int rcs = s.indexOf('(', i-1);
        if (rcs == -1) return root;
        st.push(s.charAt(rcs));
        i = rcs + 1;
        while (!st.empty()) {
            if (s.charAt(i) == '(') st.push('(');
            else if (s.charAt(i) == ')') st.pop();
            i++;
        }
        root.right = str2tree(s.substring(rcs+1, i-1));
        return root;
    }
}
