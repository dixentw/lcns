package idv.lc.string;

import java.util.*;

public class Reverse {
    public String reverseString(String s) {
        char[] sc = s.toCharArray();
        int start = 0;
        int end = sc.length-1;
        while(start < end) {
            char tmp = sc[start];
            sc[start] = sc[end];
            sc[end] = tmp;
            start++;
            end--;
        }
        return new String(sc);
    }

    public String reverseStringOLD(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
