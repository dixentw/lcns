package idv.lc.misc;

import java.util.*;

public class LC771 {
    public int numJewelsInStones(String J, String S) {
        Set<Character> s = new HashSet<>();
        for (char c : J.toCharArray()) {
            s.add(c);
        }
        int res = 0;
        for (char c : S.toCharArray()) {
            if (s.contains(c)) res++;
        }
        return res;
    }
}
