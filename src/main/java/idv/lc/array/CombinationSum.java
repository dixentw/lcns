package idv.lc.array;

import java.util.*;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrace(candidates, res, new ArrayList<Integer>(), target, 0);
        return res;
    }
    public void backtrace(int[] nums, List<List<Integer>> res, List<Integer> tmp, int target, int start) {
        int sum = 0;
        for(Integer i : tmp){
            sum += i;
        }
        if(sum >= target) {
            if(sum == target) {
                res.add(new ArrayList<Integer>(tmp));
            }
            return;
        }
        for(int i=start; i<nums.length; i++){
            tmp.add(nums[i]);
            backtrace(nums, res, tmp, target, i);
            tmp.remove(tmp.size()-1);
        }
    }
}
