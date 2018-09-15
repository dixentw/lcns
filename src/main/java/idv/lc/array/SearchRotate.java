package idv.lc.array;

import java.util.*;

class SearchRotate{
    /*
     * 依樣是binary search, 只是還要多判斷頭尾
     * 判斷準則：確定好斷裂發生的地方，target有沒有發生在那個地方，所以要前後夾需要兩個條件&&
     */
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                return mid;
            }else if(nums[mid] > target) {
                if(target <= nums[end] && nums[mid] > nums[end]) { //我要保證斷裂發生的地方在後面，而且target要小於end才會在斷裂裡面
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
