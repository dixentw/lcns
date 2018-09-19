package idv.lc.string;

import java.util.*;

public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        int cnt = 0;
        int lenA = A.length();
        int lenB = B.length();
        String repeatA = A;
        while (repeatA.length() <= (2*lenA)+lenB) {
            cnt++;
            if (repeatA.indexOf(B) != -1) {
                return cnt;
            }
            repeatA += A;
        }
        return -1;
    }
}
