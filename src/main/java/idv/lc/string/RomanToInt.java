package idv.lc.string;

import java.util.*;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> table = new HashMap<>();
        table.put('M', 1000);
        table.put('D', 500);
        table.put('C', 100);
        table.put('L', 50);
        table.put('X', 10);
        table.put('V', 5);
        table.put('I', 1);
        int sum = 0;
        char[] str = s.toCharArray();
        for (int i=0; i<s.length()-1; i++) {
            if (table.get(str[i]) < table.get(str[i+1])) { // 9 or 4 version
                sum -= table.get(str[i]);
            } else {
                sum += table.get(str[i]);
            }
        }
        sum += table.get(str[str.length-1]);
        return sum;
    }
}
