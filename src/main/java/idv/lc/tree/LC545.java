package idv.lc.tree;

import java.util.*;

public class LC545 {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        res.add(root.val);
        traverseLeft(root.left, res);
        leaves(root, res);
        traverseRight(root.right, res);
        return res;
    }
    public void traverseLeft(TreeNode root, List<Integer> res) {
        if (root == null || (root.left == null && root.right == null)) return;
        res.add(root.val);
        if (root.left == null) traverseLeft(root.right, res);
        else traverseLeft(root.left, res);
    }
    public void traverseRight(TreeNode root, List<Integer> res) {
        if (root==null||(root.left==null&&root.right==null)) return;
        if (root.right==null) traverseRight(root.left, res);
        else traverseRight(root.right, res);
        res.add(root.val);
    }
    public void leaves(TreeNode root, List<Integer> res) {
        if (root == null) return;
        if (root.left ==null && root.right==null) {
            res.add(root.val);
            return;
        }
        leaves(root.left, res);
        leaves(root.right, res);
    }
}
