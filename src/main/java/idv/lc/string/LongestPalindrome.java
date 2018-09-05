package idv.lc.string;

import java.util.*;

public class LongestPalindrome {
    int maxLen =0;
    int low = 0;
    int high = 0;

    public String longestPalindrome(String s) {
        char[] cs = s.toCharArray();
        for (int i=0; i<cs.length; i++) {
            helper(cs, i, i);
            helper(cs, i, i+1);
        }
        return s.substring(low, high);
    }
    public void helper(char[] cc, int i, int j) {
        while (i>=0 && j <cc.length && cc[i]==cc[j]) {
            i--;
            j++;
        }
        if (maxLen < (j-i-1)) {
            maxLen = j-i-1;
            low = i+1;
            high = j;
        }
    }
    /*
    public String longestPalindrome1(String s) {
        char[] cs = s.toCharArray();
        int maxLen = 0;
        int low = 0;
        int high = 0;
        for (int i=1; i<cs.length-1; i++) {
            int start = i-1;
            int end = i+1;
            while (start>=0 && end<cs.length && cs[start] == cs[end]) {
                start--;
                end++;
            }
            if (end - start -1 > maxLen) {
                maxLen = end-start-1;
                high = end-1;
                low = start+1;
            }
        }
        return s.substring(low, high+1);
    }*/
}
