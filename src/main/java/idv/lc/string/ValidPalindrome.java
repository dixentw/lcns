package idv.lc.string;

import java.util.*;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;
        while(start < end) {
            char sc = s.charAt(start);
            char se = s.charAt(end);
            if (!Character.isLetter(sc) && !Character.isDigit(sc)) {
                start++;
                continue;
            }
            if (!Character.isLetter(se) && !Character.isDigit(se)) {
                end--;
                continue;
            }
            if (sc!=se) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
