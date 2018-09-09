package idv.lc.string;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> lookup = new HashMap<>();
        for (String str : strs) {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String key = String.valueOf(cs);
            if (!lookup.containsKey(key)) {
                lookup.put(key, new ArrayList<String>());
            }
            lookup.get(key).add(str);
        }
        List<List<String>> res = new ArrayList<>();
        for (String key : lookup.keySet()) {
            res.add(lookup.get(key));
        }
        return new ArrayList<List<String>>(lookup.values());
    }
}
