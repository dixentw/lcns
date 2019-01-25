package idv.lc.heap;

import java.util.*;

public class LC347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> q = 
            new PriorityQueue<>(k, (Map.Entry<Integer,Integer> a, Map.Entry<Integer,Integer> b) -> b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            q.offer(e);
        }
        List<Integer> res = new ArrayList<>();
        for (int i=0; i<k; i++) {
            Map.Entry<Integer, Integer> e = q.poll();
            res.add(e.getKey());
        }
        return res;
    }
}
