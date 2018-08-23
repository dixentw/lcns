package idv.lc.array;

import java.util.*;

class SearchRotate{
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                return mid;
            }else if(nums[mid] > target) {
                if(target <= nums[end] && nums[mid] > nums[end]) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else if(nums[mid] < target) {
                if(target >= nums[start] && nums[mid] < nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
