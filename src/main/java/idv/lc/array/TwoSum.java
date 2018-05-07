package idv.lc.array;

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
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
