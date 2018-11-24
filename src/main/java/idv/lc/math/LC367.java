package idv.lc.math;

import java.util.*;

public class LC367 {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid*mid == num) {
                return true;
            } else if (mid*mid > num) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return false;
    }
    public boolean __isPerfectSquare(int num) {
        if (num == 0) return false;
        int i = 1;
        while (num - i*i > 0) i++;
        return i*i - num == 0;
    }
}
