package idv.lc.math;

import java.util.*;

public class LC166 {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        StringBuilder sb = new StringBuilder();
        if (numerator < 0 && denominator > 0 ||numerator > 0 && denominator < 0) {
            sb.append("-");
        }
        long num = Math.abs((long)numerator);
        long denum = Math.abs((long)denominator);

        sb.append(num/denum);
        num = num % denum;
        if (num == 0) return sb.toString();

        sb.append(".");
        Map<Long, Integer> table = new HashMap<>();
        table.put(num, sb.length());
        while (num != 0) {
            num *= 10;
            sb.append(num/denum);
            num %= denum;
            System.out.println(num);
            if (table.containsKey(num)) {
                int index = table.get(num);
                sb.insert(index, "(");
                sb.append(")");
            } else {
                table.put(num, sb.length());
            }
        }
        return sb.toString();
    }
}
