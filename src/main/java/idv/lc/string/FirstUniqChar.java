package idv.lc.string;

import java.util.*;

public class FirstUniqChar {
    /*
     *  1. naive 兩個迴圈 O(n^2)
     *  2. 先用 26個 int[] 存起來，在迴圈進去掃 O(2n), 但不知道char range
     *  3. use assumption, 就用2實作吧
     *  [FAIL]
     *  test case "cc"
     *  -> this is the first index setup problem
     */
    public int firstUniqChar(String s) {
        int[] cs = new int[26];
        for (int i=0; i<s.length(); i++) {
            cs[s.charAt(i)-'a']++;
        }
        for (int i=0; i<s.length(); i++) {
            if (cs[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqCharOLD(String s) {
        int[] cs = new int[26];
        for (int i=0; i<s.length(); i++) {
            cs[s.charAt(i)-'a']++;
        }
        int first = Integer.MAX_VALUE;
        for (int i=0; i<cs.length; i++) {
            if (cs[i] == 1 && s.indexOf((char)(i+'a')) < first) { // [FAIL] `i+'0'`
                first = s.indexOf((char)(i+'a')); // FAIL `i+'0'`
            }
        }
        if (first == Integer.MAX_VALUE) {
            return -1;
        }
        return first;
    }
}
