package idv.lc.bt;

import java.util.*;

public class LC47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        helper(res, nums, new ArrayList<Integer>(), visited);
        return res;
    }
    public void helper(List<List<Integer>> res, int[] nums, List<Integer> path, boolean[] visited){
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=0;i<nums.length; i++) {
            if (visited[i]) continue;
            if (i!=0 && nums[i]==nums[i-1]&&visited[i-1]) continue;
            path.add(nums[i]);
            visited[i] = true;
            helper(res, nums, path, visited);
            visited[i] = false;
            path.remove(path.size()-1);
        }
    }
}
