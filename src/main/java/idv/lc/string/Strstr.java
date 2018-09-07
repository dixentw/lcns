package idv.lc.string;

import java.util.*;

public class Strstr {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i=0; i<=haystack.length()-needle.length(); i++) {
            boolean broke = false;
            for (int j=0; j<needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(j+i)) {
                    broke = true;
                }
            }
            if (!broke) return i;
        }
        return -1;
    }
}
