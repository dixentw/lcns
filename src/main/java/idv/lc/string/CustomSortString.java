package idv.lc.string;

import java.util.*;

public class CustomSortString {
    public String customSortString(String S, String T) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : T.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for (char s : S.toCharArray()) {
            int cnt = map.getOrDefault(s, 0);
            for (int i=0; i<cnt; i++) {
                sb.append(s);
            }
            if (cnt != 0) {
                map.remove(s);
            }
        }
        for (char c : map.keySet()) {
            for (int i=0; i<map.getOrDefault(c, 0); i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
