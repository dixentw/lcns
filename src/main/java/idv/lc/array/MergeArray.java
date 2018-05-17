package idv.lc.array;

import java.util.*;

class MergeArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int endIdx = m + n - 1;
        int i = m-1;
        int j = n-1;
        while(endIdx >= 0) {
            if(i<0) {
                nums1[endIdx--]=nums2[j--];continue;
            } 
            if(j<0) {
                nums1[endIdx--]=nums1[i--];continue;
            } 
            if(nums2[j]>nums1[i]){
                nums1[endIdx--] = nums2[j--];
            }else{
                nums1[endIdx--] = nums1[i--];
            }
        }
        return nums1;
    }
}
