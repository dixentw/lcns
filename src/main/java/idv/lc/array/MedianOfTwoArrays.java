package idv.lc.array;

import java.util.*;

class MedianOfTwoArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int e1 = nums1.length - 1;
        int e2 = nums2.length - 1;
        int totalLen = e1 + e2 + 2;
        if(totalLen % 2 == 0) {
            int r = helper(nums1, 0, e1, nums2, 0, e2, (totalLen)/2);
            int l = helper(nums1, 0, e1, nums2, 0, e2, (totalLen)/2-1);
            return (l+r) / 2.0;
        } else {
            return helper(nums1, 0, e1, nums2, 0, e2, (totalLen)/2-1) / 1.0;
        }
    }
    // find k th elemnet in two sorted array (k from 0)
    public int helper(int[] n, int s1, int e1, int[] m, int s2, int e2, int k) {
        // terminate condition
        System.out.printf(">>>>> %d, %d, %d, %d, %d\n", s1, e1, s2, e2, k);
        if(s1 > e1) return m[k+s2];
        if(s2 > e2) return n[k+s1];
        if(k == 0) return Math.min(n[s1], m[s2]);
        // main part
        int mid1 = (e1 - s1) / 2;
        int mid2 = (e2 - s2) / 2;
        if (mid1 + mid2 < k) { //取不夠, 要往s1 or s2 = mid1 or mid2 方向取
            if(n[s1+mid1] > m[s2+mid2]) {
                System.out.println("a");
                return helper(n, s1, e1, m, s2+mid2+1, e2, k-(mid2+1));
            } else {
                System.out.println("b");
                return helper(n, s1+mid1+1, e1, m, s2, e2, k-(mid1+1));
            }
        } else {
            if(n[s1+mid1] > m[s2+mid2]) {
                System.out.println("c");
                return helper(n, s1, s1+mid1-1, m, s2, e2, k);
            } else {
                System.out.println("d");
                return helper(n, s1, e1, m, s2,s2+mid2-1, k);
            }
        }
    }
}
