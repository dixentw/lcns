package idv.lc.math;

import java.util.*;

public class LC728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left ; i <= right; i++) {
            int num = i;
            boolean ok = true;
            while (num > 0) {
                int d = num % 10;
                if (d == 0) {
                    ok = false;
                    break;
                }
                if (i % d != 0) {
                    ok = false;
                    break;
                }
                num /= 10;
            }
            if (ok) res.add(i);
        }
        return res;
    }
}
