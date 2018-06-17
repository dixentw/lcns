package idv.lc.array;

import java.util.*;

class MinSizeSubArr {
    public int minSubArrayLen(int s, int[] nums) {
        int start = 0;
        int end = 0;
        int length = Integer.MAX_VALUE;
        int sum = 0;
        while(end < nums.length){
            sum += nums[end++];
            while(sum >= s){
                // end has been plus 1, so no need to add 1 here to count length
                length = Math.min(length, end-start);
                sum -= nums[start++];
            }
        }
        return (length == Integer.MAX_VALUE) ? 0 : length;

    }
}
