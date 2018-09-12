package idv.lc.string;

import java.util.*;

public class GroupShiftStr {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> m = new HashMap<>();
        for (String s : strings) {
            String pattern = "";
            for (int i=1; i<s.length();i++) {
                int diff = s.charAt(i) - s.charAt(i-1);
                pattern += (diff<0) ? diff+26 : diff;
                pattern += ",";
            }
            if (!m.containsKey(pattern)) {
                m.put(pattern, new ArrayList<String>());
            }
            m.get(pattern).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
