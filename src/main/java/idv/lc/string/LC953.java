package idv.lc.string;

import java.util.*;

public class LC953 {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<order.length(); i++) map.put(order.charAt(i), i);
        if (words.length==1) return true;
        for (int i=1; i<words.length; i++) {
            int p = 0;
            int q = 0;
            while (p<words[i-1].length() || q<words[i].length()) {
                int prev = (p>=words[i-1].length()) ? -1 : map.get(words[i-1].charAt(p));
                int curr = (q>=words[i].length()) ? -1 : map.get(words[i].charAt(q));
                if (prev > curr) return false;
                if (prev < curr) break;
                p++;
                q++;
            }
        }
        return true;
    }
}
