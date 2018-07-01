package idv.lc.array;

import java.util.*;

class MaxConsecutiveOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            int local = 0;
            while(i<nums.length && nums[i]==1) {
               local++;
               i++;
            }
            max = Math.max(max, local);
        }
        return max;
    }
}
