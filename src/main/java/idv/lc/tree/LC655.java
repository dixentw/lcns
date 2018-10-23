package idv.lc.tree;

import java.util.*;

public class LC655 {
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> res = new ArrayList<>();
        if (root == null) return res;
        int d = depth(root);
        int w = (int)(Math.pow(2, d)-1);
        List<String> row = new ArrayList<>();
        for (int i=0; i<w; i++) row.add("");
        for (int i=0; i<d; i++) res.add(new ArrayList<>(row));
        fillList(root, 1, res, 0, w-1);
        return res;
    }
    public int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right))+1;
    }
    public void fillList(TreeNode root, int depth, List<List<String>> res, int start, int end) {
        if (depth > res.size() || root==null) return;
        int mid = (start+end)/2;
        res.get(depth-1).set(mid, String.valueOf(root.val));
        fillList(root.left, depth+1, res, start, mid-1);
        fillList(root.right, depth+1, res, mid+1, end);
    }
}
