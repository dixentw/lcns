package idv.lc.array;

import java.util.*;

public class LC852 {
    public int peakIndexInMountainArray(int[] A) {
        int start = 0;
        int end = A.length-1;
        while (start <= end) {
            int mid = (start + end) /2;
            if (A[mid-1] < A[mid] && A[mid+1] < A[mid]) {
                return mid;
            } else if (A[mid-1] < A[mid] && A[mid] < A[mid+1]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        //suppose not come to here
        return -1;
    }
}
