package idv.lc.array;

import java.util.*;

class MinSizeSubArr {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        int start = 0;
        int end = 0;
        int sum = nums[0];
        int mLen = Integer.MAX_VALUE; // wrong init with 0
        while (start < nums.length && end < nums.length) {
            if (sum < s) {
                end++;
                if (end == nums.length) continue;
                sum += nums[end];
            } else {
                mLen = Math.min(mLen, end-start+1);
                sum -= nums[start++];
            }
        }
        return (mLen == Integer.MAX_VALUE) ? 0 : mLen;
    }
    public int minSubArrayLenOld(int s, int[] nums) {
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
