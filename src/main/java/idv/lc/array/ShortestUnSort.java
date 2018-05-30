package idv.lc.array;

import java.util.*;

class ShortestUnSort {
    public int findUnsortedSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] < nums[i-1]) {
                if(start==0) {
                    start = i;
                }else{
                    end = i;
                }
            }
        }
        System.out.printf("%d, %d\n", start, end);
        if(start==0 && end==0) {
            return 0;
        }
        int localMax = Integer.MIN_VALUE;
        for(int i=start-1;i<=end; i++) {
            localMax = Math.max(localMax, nums[i]);
        }
        int realEnd = 0;
        for(int i=end; i<nums.length; i++) {
            if(localMax < nums[i]){
                realEnd = i;
                break;
            }
        }
        return realEnd - start+1;
    }
}
