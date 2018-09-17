package idv.lc.array;

import java.util.*;

class NonDecreaseArr {
    /*
     * 檢查decrese, 如果後面大於前面的decrese, 那就ok <- 錯誤假設
     * 
     * 如何判斷個數？還是要用cnt
     * [FAIL]沒有判斷 array length==1
     * [FAIL]錯誤假設
     * 使用線圖判斷不完判斷山谷很麻煩
     * 為了解決這個麻煩，我們可以直接先修改array的內容，以i的值為準
     * 改了之後再去看count有沒有合標
     *
     */
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int smallIdx = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] < nums[i-1]){
                count++;
                if(i-2 <0 || nums[i-2] <= nums[i]){ // find a possible way to modify, if this array survived, then count is less or equal than 1
                    nums[i-1] = nums[i];
                }else{
                    nums[i] = nums[i-1];
                }
            }
        }
        if(count > 1){
            return false;
        }
        return true;
    }
}
