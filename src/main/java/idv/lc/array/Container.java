package idv.lc.array;

import java.util.*;

class Container {
    // this problem didn't assume there is a island, it only compute the diff
    // between left and right multiply their distance
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxWater = Integer.MIN_VALUE;
        while(start < end) {
            if(height[start] > height[end]) {
                // try to peak end, we want to store higher one, and compute
                // the result of peak
                maxWater = Math.max(maxWater, (end-start)*height[end]);
                end--;
            } else {
                maxWater = Math.max(maxWater, (end-start)*height[start]);
                start++;
            }
        }
        return maxWater;
    }
}
