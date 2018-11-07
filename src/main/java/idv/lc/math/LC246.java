package idv.lc.math;

import java.util.*;

public class LC246 {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> table = new HashMap<>();
        table.put('0', '0');
        table.put('1', '1');
        table.put('6', '9');
        table.put('8', '8');
        table.put('9', '6');
        StringBuilder sb = new StringBuilder();
        for (int i=num.length()-1; i>=0; i--) {
            char c = num.charAt(i);
            if (!table.containsKey(c)) {
                return false;
            }
            char p = table.get(c);
            sb.append(p);
        }
        return num.equals(sb.toString());

    }
}
