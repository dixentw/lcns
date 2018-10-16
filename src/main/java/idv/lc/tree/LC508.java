package idv.lc.tree;

import java.util.*;

public class LC508 {
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> dic = new HashMap<>();
        helper(root, dic);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(dic.entrySet());
        Collections.sort(list, (Map.Entry<Integer,Integer> a, Map.Entry<Integer, Integer> b) -> b.getValue() - a.getValue());
        int max = list.get(0).getValue();
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            if (entry.getValue() == max) res.add(entry.getKey());
        }
        return res.stream().mapToInt(Integer::intValue).toArray();

    }
    public int helper(TreeNode root, Map<Integer,Integer> dic) {
        if (root == null) return 0;
        int left = helper(root.left, dic);
        int right = helper(root.right, dic);
        int sum = root.val + left + right;
        dic.put(sum, dic.getOrDefault(sum, 0)+1);
        return sum;
    }

}
