package idv.lc.array;

import java.util.*;

class NextPerm {
    /*
     * 從後面算過來的第一個下降就是pivot, 把pivot跟pivot-1交換，
     * 再從後面找一個num比pivot-1還小，如果沒找到就是pivot跟pivot-1交換
     * 換過後在sort即可
     */
    public void nextPermutation(int[] nums) {
        int pivot = nums.length - 1;
        while (pivot > 0 ) {
            if (nums[pivot] > nums[pivot-1]) {
                break;
            }
            pivot--;
        }
        if (pivot <= 0) {
            Arrays.sort(nums);
            return;
        }
        // 再找一個比pivot-1小的number
        for (int i=nums.length-1; i>=pivot; i--) {
            if (nums[i] > nums[pivot-1]) {
                int tmp = nums[i];
                nums[i] = nums[pivot-1];
                nums[pivot-1] = tmp;
                break;
            }
        }
        sort(nums, pivot, nums.length-1);
    }

    public void nextPermutationOld(int[] nums) {
        int pivot = nums.length-1;
        while(pivot > 0){
            if(nums[pivot] > nums[pivot-1]){
                break;
            }
            pivot--;
        }
        if(pivot == 0) {
            Arrays.sort(nums);
            return;
        }
        int large = 0;
        int minDiff = Integer.MAX_VALUE;
        for(int j=pivot+1; j<nums.length; j++){
            if(nums[j] > nums[pivot-1] && nums[j]-nums[pivot-1] < minDiff) {
                large = j;
                minDiff = nums[j] - nums[pivot-1];
            }
        }
        if(large == 0) { //後面全部都比pivot-1小, 要把pivot-1塞到最後
            int tmp = nums[pivot-1];
            nums[pivot-1] = nums[pivot];
            nums[pivot] = tmp;
            sort(nums, pivot, nums.length-1);
        }else { // 有人大於pivot-1, 對調
            int tmp = nums[pivot-1];
            nums[pivot-1] = nums[large];
            nums[large] = tmp;
            sort(nums, pivot, nums.length-1);
        }
    }
    public void sort(int[] nums, int start, int end){
        for(int i=start; i<=end; i++){
            int key = nums[i];
            int j = i-1;
            while(j>=start && nums[j] > key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
}
