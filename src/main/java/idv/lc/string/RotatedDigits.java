package idv.lc.string;

import java.util.*;

public class RotatedDigits {
    public int rotatedDigits(int N) {
        String ptn = ".*[2569]+.*";
        String ptn2 = ".*[347]+.*";
        int res = 0;
        for (int i=1; i<=N; i++) {
            String strVal = String.valueOf(i);
            if (strVal.matches(ptn) && !strVal.matches(ptn2)) {
                res++;
            }
        }
        return res;
    }
}
