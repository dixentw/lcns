package idv.lc.string;

import java.util.*;

public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String ws : words) {
            if (ws.length() != pattern.length()) continue;
            Map<Character, Character> p = new HashMap<>();
            boolean broke = false;
            for (int i=0; i<ws.length(); i++) {
                if (!p.containsKey(ws.charAt(i))) {
                    for (Map.Entry<Character, Character> e : p.entrySet()) {
                        if (e.getValue() == pattern.charAt(i)) {
                            broke = true;
                            break;
                        }
                    }
                    p.put(ws.charAt(i), pattern.charAt(i));
                }
                if (p.get(ws.charAt(i)) != pattern.charAt(i)) {
                    broke = true;
                    break;
                }
            }
            if (broke) continue;
            res.add(ws);
        }
        return res;
    }
}
