package idv.lc.string;

import java.util.*;

public class AmbiguousCoordinates {
    public List<String> ambiguousCoordinates(String S) {
        List<String> res = new ArrayList<>();
        for (int i=1; i<S.length()-2; i++) {
            // separate with ', '
            List<String> A = valid(S.substring(1, i+1));
            List<String> B = valid(S.substring(i+1, S.length()-1)); //didn't count )
            for (String a : A) {
                for (String b: B) {
                    res.add("(" + a + ", " + b + ")");
                }
            }
        }
        return res;
    }
    // process decimal point
    public List<String> valid(String s) {
        List<String> res = new ArrayList<>();
        int n = s.length();
        if (n==0 || (n>1 && s.charAt(0) == '0' && s.charAt(n-1) == '0')) return res;
        if (n>1 && s.charAt(0) == '0') {
            res.add("0." + s.substring(1));
            return res;
        }
        res.add(s);
        if (n==1 || s.charAt(n-1) == '0') return res;
        for (int i=1; i<n; i++) {
            res.add(s.substring(0, i) + '.' + s.substring(i));
        }
        return res;
    }
}
