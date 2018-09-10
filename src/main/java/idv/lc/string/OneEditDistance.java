package idv.lc.string;

import java.util.*;

public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        int m = s.length();
        int n = t.length();
        for (int i=0; i<Math.min(m,n); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (m == n) {
                    return s.substring(i+1).equals(t.substring(i+1));
                } else if (m < n) {
                    return s.substring(i).equals(t.substring(i+1));
                } else {
                    return t.substring(i).equals(s.substring(i+1));
                }
            }
        }
        // easy to forget, to check the last characters  aaabbb, aaabbbccc
        return Math.abs(m - n) == 1;
    }
    public boolean isOneEditDistanceOld(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (Math.abs(m-n) > 1) {
            return false;
        }
        if (m > n) {
            for (int i=0; i<m; i++) {
                if (t.equals(s.substring(0, i) + s.substring(i+1, m))) {
                    return true;
                }
            }
        } else if (m < n) {
            for (int i=0; i<n; i++) {
                if (s.equals(t.substring(0, i) + t.substring(i+1, n))) {
                    return true;
                }
            }
        } else { // replace
            int cnt = 0;
            for (int i=0; i<m; i++) {
                if(s.charAt(i) != t.charAt(i)) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                return true;
            }
        }
        return false;
    }
}
