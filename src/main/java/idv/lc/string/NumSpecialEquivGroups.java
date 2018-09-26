package idv.lc.string;

import java.util.*;

public class NumSpecialEquivGroups {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String w : A) {
            int[] odd = new int[26];
            int[] even = new int[26];
            for (int i=0; i<w.length(); i++) {
                if (i%2==0) even[w.charAt(i)-'a']++;
                else odd[w.charAt(i)-'a']++;
            }
            String seg = Arrays.toString(odd) + Arrays.toString(even);
            set.add(seg);
        }
        return set.size();
    }
}
