package idv.lc.array;

import java.util.*;

public class SearchRotate2 {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                if (nums[mid] == nums[end]) {
                    end--;
                    continue;
                }
                if (target <= nums[end] && nums[mid] > nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (nums[mid] < target) {
                if (nums[mid] == nums[start]) {
                    start++;
                    continue;
                }
                if (target >= nums[start] && nums[mid] < nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }
}
