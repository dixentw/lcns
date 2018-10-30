package idv.lc.tree;

import java.util.*;

public class LC889 {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return helper(pre, post, 0, pre.length-1, 0, post.length-1);
    }
    public TreeNode helper(int[] pre, int[] post, int ps, int pe, int os, int oe) {
        if (ps > pe || os > oe) {
            return null;
        }
        TreeNode root = new TreeNode(pre[ps]);
        if (ps==pe || os==oe) return root;
        int leftChild = pre[ps+1];
        int i=os;
        for (;i<=oe; i++) {
            if (post[i] == leftChild) break;
        }
        int len = i - os;
        root.left = helper(pre, post, ps+1, ps+1+len, os, i);
        root.right = helper(pre, post, ps+1+len+1, pe, i+1, oe-1);
        return root;
    }
}
