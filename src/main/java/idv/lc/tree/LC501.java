package idv.lc.tree;

import java.util.*;

public class LC501 {
    // using extra space
    public int[] findMode(TreeNode root) {
        Map<String, Integer> data = new HashMap<String, Integer>();
        List<Integer> res = new ArrayList<>();
        data.put("currVal", 0);
        data.put("currCount", 0);
        data.put("maxCount", 0);
        inorder(root, data, null);
        data.put("currVal", 0);
        data.put("currCount", 0);
        inorder(root, data, res);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public void inorder(TreeNode node, Map<String, Integer> data, List<Integer> res) {
        if (node == null) return;
        inorder(node.left, data, res);
        if (node.val != data.get("currVal")) {
            data.put("currVal", node.val);
            data.put("currCount", 0);
        }
        data.put("currCount", data.get("currCount")+1);
        if (res == null) {
            if (data.get("currCount") > data.get("maxCount")) {
                data.put("maxCount", data.get("currCount"));
            }
        } else {
            if (data.get("currCount") == data.get("maxCount")) {
                res.add(node.val);
            }
        }
        inorder(node.right, data, res);
    }
}
