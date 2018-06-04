package idv.lc.array;

import java.util.*;

class ContainDups2 {
    // naive, too slow
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            for(int j=i-k; j<=i+k; j++){
                if(j>=0 && j<nums.length && i!=j && nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> table = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            Integer saved = table.get(nums[i]);
            if(saved==null){
                table.put(nums[i], i);
            }else{
                int diff = Math.abs(saved - i);
                if(diff <= k){
                    return true;
                }else{
                    table.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
