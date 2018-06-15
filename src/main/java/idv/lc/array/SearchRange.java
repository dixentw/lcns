package idv.lc.array;

import java.util.*;

class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        // 沒考慮到 = 0, 邊際條件
        if (nums.length == 0){
            return new int[]{-1, -1};
        }
        int[] res = new int[2];
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
            int mid = (start + end) / 2;
            if(nums[mid]==target || nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        res[0] = (nums[end] == target) ? end: -1;
        start = 0;
        end = nums.length-1;
        while(start < end) {
            int mid = (start + end) / 2 + 1;
            if(nums[mid] == target || nums[mid] < target) {
                start = mid;
            } else {
                end = mid - 1;
            }
        }
        res[1] = (nums[end] == target) ? end: -1;
        return res;
    }
}
