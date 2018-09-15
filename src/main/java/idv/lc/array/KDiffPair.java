package idv.lc.array;

import java.util.*;

class KDiffPair {
    /*
     * sort the array, find the k diff and return result
     */
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int p = 0;
        for(int i = 0; i<nums.length-1; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            System.out.println(i);
            for(int j=i+1; j<nums.length;j++){
                if(nums[j]-nums[i]==k){
                    p++;
                    break;
                }
            }
        }
        return p;
    }
}
