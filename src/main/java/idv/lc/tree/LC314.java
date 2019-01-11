package idv.lc.tree;

import java.util.*;

public class LC314 {
    class Data {
        int val;
        int level;
        public Data(int v, int l) {
            this.val = v;
            this.level = l;
        }
    }
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Map<Integer, List<Data>> table = new TreeMap<>();
        helper(root, table, 0, 1);
        for (Integer k : table.keySet()) {
            List<Data> ld = table.get(k);
            Collections.sort(ld, (Data a, Data b)-> a.level-b.level);
            List<Integer> l = new ArrayList<>();
            for (Data d : ld) l.add(d.val);
            res.add(l);
        }
        return res;
    }
    public void helper(TreeNode node, Map<Integer, List<Data>> table, int index, int level){
        if (node == null) return;
        List<Data> l = table.getOrDefault(index, new ArrayList<Data>());
        l.add(new Data(node.val, level));
        table.put(index, l);
        helper(node.left, table, index-1, level+1);
        helper(node.right, table, index+1, level+1);
    }
}
