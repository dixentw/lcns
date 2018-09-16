package idv.lc.array;

import java.util.*;

class ShortestUnSort {
    /*
     *  沒有sort過的array，就是從前面數來最大的那個element
     *  跟後面數來最小的那個element的長度
     */
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min =nums[n-1];
        int maxIdx = 0;
        int minIdx = 0;
        for (int i=0; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n-1-i]);
            if (nums[i] < max) maxIdx = i;
            if (nums[n-1-i] > min) minIdx = n-1-i;
        }
        if (maxIdx==0 && minIdx ==0) return 0;
        return maxIdx - minIdx + 1;
    }

    public int findUnsortedSubarrayOld(int[] nums) {
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
