package idv.lc.array;

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> table = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (table.containsKey(target - nums[i])) {
                Integer idx = table.get(target - nums[i]);
                return new int[]{Math.min(i, idx), Math.max(i, idx)};
            }
            table.put(nums[i], i);
        }
        return new int[]{};
    }
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> table = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            table.put(nums[i], i);
        }
        for (int i=0; i<nums.length; i++) {
            Integer pair = table.get(target - nums[i]);
            if (pair != null && pair != i) {
                return new int[]{Math.min(i, pair), Math.max(i, pair)};
            }
        }
        return new int[]{};
    }
    public int[] twoSum1(int[] nums, int target) {
        int[] tmp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(tmp);
        int i = 0;
        int j = nums.length - 1;
        int[] res = new int[2];
        while(i < j) {
            if(tmp[i] + tmp[j] < target) {
                i++;
            }else if (tmp[i]+ tmp[j] > target) {
                j--;
            }else {
                break;
            }
        }
        int first = 0;
        for(int k=0; k<nums.length; k++){
            if(nums[k] == tmp[i]){
                res[0] = k;
                first = k;
                break;
            }
        }
        for(int k=0; k<nums.length; k++){
            if(nums[k] == tmp[j] && k != first){
                res[1] = k;
            }
        }
        return res;
    }
}
