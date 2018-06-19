package idv.lc.array;

import java.util.*;

class MinRotateArr {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int start = 0;
        int end = nums.length-1;
        // 如果是start+end/2 算出來的mid, 在終端條件的時候，都會等於start, 所以最後都會以start+1當作前進的動力。
        while(start < end) {
            int mid = (start + end) / 2;
            if(nums[mid] < nums[start] && nums[start] > nums[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return nums[mid];
    }
}
