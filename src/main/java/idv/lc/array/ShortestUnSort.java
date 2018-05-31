package idv.lc.array;

import java.util.*;

class ShortestUnSort {
    public int findUnsortedSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        int n = nums.length;
        int localMax = nums[0];
        int localMin = nums[n-1];
        for(int i=1; i<nums.length; i++) {
            localMax = Math.max(localMax, nums[i]);
            localMin = Math.min(localMin, nums[n-i-1]);
            if(nums[i] < localMax) end = i;
            if(nums[n-1-i] > localMin) start = n-1-i;
        }
        if(start ==0 && end ==0){
            return 0;
        }
        return end-start+1;
    }
}
