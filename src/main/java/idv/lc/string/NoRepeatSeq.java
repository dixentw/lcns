package idv.lc.string;

import java.util.*;

public class NoRepeatSeq {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        Set<Character> cs = new HashSet<>();
        int max = 0;
        while (end < s.length()) {
            if (cs.contains(s.charAt(end))) {
                cs.remove(s.charAt(start++));
            } else{
                cs.add(s.charAt(end++));
                max = Math.max(max, end-start);
            }
        }
        return max;
    }
}
