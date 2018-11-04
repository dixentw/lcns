package idv.lc.math;

import java.util.*;

public class LC202 {
    public boolean isHappy(int n) {
        Set<Integer> loop = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            int tmpNum = n;
            while (tmpNum > 0) {
                sum += (tmpNum % 10) * (tmpNum % 10);
                tmpNum /= 10;
            }
            n = sum;
            if (n == 1) return true;
            if (!loop.add(n)) return false;
        }
        return true;
    }
}
