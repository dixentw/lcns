package idv.lc.string;

import java.util.*;

public class UncommonWord {
    public String[] uncommonFromSentences(String A, String B) {
        String all = A + " " + B;
        String[] words = all.split(" ");
        Map<String, Integer> table = new HashMap<>();
        for (String s: words) {
            Integer val = table.get(s);
            if (val == null) {
                table.put(s, 1);
            } else {
                table.put(s, ++val);
            }
        }
        List<String> res = new ArrayList<>();
        for (String key : table.keySet()) {
            if (table.get(key) == 1) {
                res.add(key);
            }
        }
        return res.toArray(new String[0]);
    }
}
