package idv.lc.string;

import java.util.*;

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        //check duplicate
        if (A.equals(B)) {
            int max = 0;
            char[] map = new char[26];
            for (int i=0; i<A.length(); i++) {
                map[A.charAt(i)-'a']++;
                max = Math.max(map[A.charAt(i)-'a'], max);
            }
            return max >= 2;
        }
        int cnt = 0;
        int[] idxes= new int[2];
        for (int i=0; i<A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (cnt<2) idxes[cnt++] = i;
                else return false;
            }
        }
        return A.charAt(idxes[0]) == B.charAt(idxes[1]) &&
            A.charAt(idxes[1]) == B.charAt(idxes[0]);
    }
}
