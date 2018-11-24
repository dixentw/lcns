package idv.lc.math;

import java.util.*;

public class LC633 {
    public boolean judgeSquareSum(int c) {
        int num = (int) Math.sqrt(c);
        int start = 0;// fail with init 1
        int end = num;
        while (start <= end) { // fail, the number can be repeated
            int sum = start * start + end * end;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}
