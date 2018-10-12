package idv.lc.tree;

import java.util.*;

public class LC297 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return Arrays.toString(res.toArray());
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            int nullCnt = 0;
            for (int i=0; i<n; i++) {
                if (q.get(i) == null ) nullCnt++;
            }
            if (nullCnt == n) break;
            for (int i=0; i<n; i++) {
                TreeNode tr = q.poll();
                if (tr == null) {
                    res.add(null);
                } else {
                    q.offer(tr.left);
                    q.offer(tr.right);
                    res.add(tr.val);
                }
            }
        }
        return Arrays.toString(res.toArray()).replace(" ","");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == "") return null;
        String[] ns = data.substring(1, data.length()-1).split(",");
        ns = Arrays.stream(ns).filter(s -> !s.isEmpty()).toArray(String[]::new);
        if (ns.length==0) return null;
        Queue<TreeNode> lv = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(ns[0]));
        lv.offer(root);
        for (int i=1; i<ns.length; i+=2) {
            TreeNode p = lv.poll();
            if (!ns[i].equals("null")) {
                p.left = new TreeNode(Integer.parseInt(ns[i]));
                lv.offer(p.left);
            }
            if (!ns[i+1].equals("null")) {
                p.right = new TreeNode(Integer.parseInt(ns[i+1]));
                lv.offer(p.right);
            }
        }
        return root;
    }
    public TreeNode deserializeFAIL(String data) {
        String[] ns = data.substring(1, data.length()-1).split(",");
        LinkedList<TreeNode> lv = new LinkedList<>();
        for (String n : ns) {
            if (n.equals("null")) lv.add(null);
            else lv.add(new TreeNode(Integer.parseInt(n)));
        }
        int i=1;
        while (i*2 <= lv.size()) {
            System.out.println(i);
            for (int j=i-1; j<j+i-1; j++) {
                lv.get(j).left = lv.get(i*2-1);
                lv.get(j).right = lv.get(i*2);
            }
            i = i*2;
        }
        return lv.get(0);
    }


}
