package idv.lc.string;

import java.util.*;

public class SimilarRGB {
    String[] shortHexs = new String[]{"00", "11", "22", "33", "44",
    "55", "66", "77", "88", "99",
    "aa", "bb", "cc", "dd", "ee", "ff"};

    public String similarRGB(String color) {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (int i=1; i<color.length(); i+=2) {
            String inHex = color.substring(i, i+2);
            int min = Integer.MAX_VALUE;
            String minShort = "";
            for (String s : shortHexs) {
                if (Math.abs(hexToVal(s) - hexToVal(inHex)) < min) {
                    min = Math.abs(hexToVal(s) - hexToVal(inHex));
                    minShort = s;
                }
            }
            sb.append(minShort);
        }
        return sb.toString();
    }
    public int hexToVal(String s) {
        int val = 0;
        if (Character.isDigit(s.charAt(0))) {
            val += 16* (s.charAt(0) - '0');
        } else {
            val += 16* ((s.charAt(0) - 'a') + 10);
        }
        if (Character.isDigit(s.charAt(1))) {
            val += s.charAt(1) - '0';
        } else {
            val += ((s.charAt(1) - 'a') + 10);
        }
        return val;
    }
}
