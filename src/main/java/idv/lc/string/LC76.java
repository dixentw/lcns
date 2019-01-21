package idv.lc.string;

import java.util.*;

public class LC76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> feq = new HashMap<>();
        for (char c : t.toCharArray()) {
            feq.put(c, feq.getOrDefault(c, 0)+1);
        }
        int counter = feq.size();
        int start = 0;
        int end = 0;
        int len = Integer.MAX_VALUE;
        int head = 0;
        while (end < s.length()) {
            char ec = s.charAt(end);
            if (feq.containsKey(ec)) {
                feq.put(ec, feq.get(ec)-1);
                if (feq.get(ec)==0) counter--;
            }
            end++;
            //System.out.println(counter);
            while (counter==0) {
                if (end-start < len) {
                    len = end-start;
                    head = start;
                }
                char sc = s.charAt(start);
                if (feq.containsKey(sc)) {
                    feq.put(sc, feq.get(sc)+1);
                    if (feq.get(sc) > 0) counter++;
                }
                start++;
            }
        }
        return (len==Integer.MAX_VALUE) ? "" : s.substring(head, head+len);
    }
}
