package idv.lc.array;

import java.util.*;

class FindPeakElem {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(mid == 0 && mid == nums.length-1) {
                return mid;
            }
            if(mid==nums.length-1) {
                return (nums[mid-1] < nums[mid]) ? mid : mid-1;
            }
            if(mid==0) {
                return (nums[mid+1] < nums[mid]) ? mid : mid+1;
            }
            if(nums[mid-1] < nums[mid] && nums[mid+1] < nums[mid]) {
                return mid;
            } else if (nums[mid+1] > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
