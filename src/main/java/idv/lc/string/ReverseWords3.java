package idv.lc.string;

import java.util.*;

public class ReverseWords3 {
    public String reverseWords(String s) {
        int start = 0;
        char[] cs = s.toCharArray();
        for (int i=0; i<cs.length; i++) {
            if (cs[i] == ' ') {
                int end = i-1;
                while (start < end) {
                    char tmp = cs[start];
                    cs[start++] = cs[end];
                    cs[end--] = tmp;
                }
                start = i + 1;
            }
        }
        int end = cs.length-1;
        while (start < end) {
            char tmp = cs[start];
            cs[start++] = cs[end];
            cs[end--] = tmp;
        }
        return new String(cs);
    }
}
