package idv.lc.string;

import java.util.*;

public class CountSubstrings {
    /*
     * naive : for each length, count the palindrome string
     * [a,b,c] -> 3 p substring
     * [a,a,b,c] -> 4 including [aa]
     * This is O(N^3) method
     *
     * palindrome有什麼特性可以用呢？想到這裡就停了
     *
     * Fuck, 結果一開頭的 longest parlindrome就可以拿來用了
     * O(N^2)
     *
     */
    public int countSubstrings(String s) {
        int ret = 0;
        for (int i=0; i<s.length(); i++) {
            ret += extend(s, i, i+1);
            ret += extend(s, i, i);
        }
        return ret;
    }
    public int extend(String s, int i, int j) {
        int res = 0;
        while (i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
            res++;
            i--;
            j++;
        }
        return res;
    }
}
