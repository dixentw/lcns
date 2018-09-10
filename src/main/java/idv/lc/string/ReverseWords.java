package idv.lc.string;

import java.util.*;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] data = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = data.length-1; i>=0; i--) {
            if (data[i].length() != 0) {
                sb.append(data[i]);
                sb.append(" ");
            }
        }
        if (sb.length() > 1) {
            return sb.deleteCharAt(sb.length()-1).toString();
        }
        return "";
    }
}
