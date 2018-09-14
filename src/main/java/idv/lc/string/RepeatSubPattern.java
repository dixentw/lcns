package idv.lc.string;

import java.util.*;

public class RepeatSubPattern {
    /*
     * 1個字元往後查，兩個字元往後查....到s.length()/2, 很慢
     * 「看了解答」：可以用整除這個string的所有因數下去找，好像是比較快一點
     * 「一山還有一山高」：double原本字串，去頭去尾，但如何得證我得再想想
     */
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length()-1).contains(s);
    }
    public boolean repeatedSubstringPatternOLD(String s) {
        int len = s.length();
        for (int i=len/2; i>=1; i--) {
            if (len % i == 0) {
                String ptn = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j=0; j<len/i; j++) {
                    sb.append(ptn);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
