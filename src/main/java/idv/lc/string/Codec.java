package idv.lc.string;

import java.util.*;

public class Codec {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("_").append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < s.length()) {
            int d = s.indexOf("_", i);
            int size = Integer.parseInt(s.substring(i, d));
            res.add(s.substring(d+1, d+1+size));
            i = d+1+size;
        }
        return res;
    }
}
