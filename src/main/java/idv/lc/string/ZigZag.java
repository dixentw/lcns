package idv.lc.string;

import java.util.*;

public class ZigZag {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[] cc = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        int i=0;
        while (i < numRows) {
            int j=0;
            while (j+i < s.length()) {
                sb.append(s.charAt(j+i));
                j += numRows *2 -2;
                if (i>0 && i<numRows-1 && (j-i) < s.length()) { //need to add additional characters
                    sb.append(s.charAt(j-i));
                }
            }
            i++;
        }
        return sb.toString();

    }
}
