package idv.lc.array;

import java.util.*;

class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrace(candidates, res, new ArrayList<Integer>(), target, 0);
        return res;
    }
    public void backtrace(int[] nums, List<List<Integer>> res, List<Integer> tmp, int target, int start) {
        int sum = 0;
        for (Integer i : tmp) {
            sum += i;
        }
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<Integer>(tmp));
            return;
        }
        for(int i=start; i<nums.length; i++){
            if(i == start || nums[i] != nums[i-1]){
                tmp.add(nums[i]);
                backtrace(nums, res, tmp, target, i+1);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
