package idv.lc.string;

import java.util.*;

public class ReverseStr2 {
    public void reverseWords(char[] str) {
        int start = 0;
        int end = str.length - 1;
        reverse(str, start, end);
        for (int i=0; i<str.length; i++) {
            if (str[i] == ' ') {
                reverse(str, start, i-1);
                start = i+1;
            }
        }
        reverse(str, start, str.length-1);
    }
    public void reverse(char[] str, int start, int end) {
        while (start < end) {
            char tmp = str[start];
            str[start] = str[end];
            str[end] = tmp;
            start++;
            end--;
        }
    }
}
