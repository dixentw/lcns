package idv.lc.bt;

import java.util.*;

public class LC46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, nums, new ArrayList<Integer>());
        return res;
    }
    public void helper(List<List<Integer>> res, int[] nums, List<Integer> path) {
        if (path.size()==nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=0; i<nums.length; i++) {
            if (path.contains(nums[i])) continue;
            path.add(nums[i]);
            helper(res, nums, path);
            path.remove(path.size()-1);
        }
    }
}
