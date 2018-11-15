package idv.lc.math;

import java.util.*;

public class LC273 {
    String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        int idx = 0;
        List<String> res = new ArrayList<>();
        while( num > 0) {
            int group = num % 1000;
            if (group > 0) {
                String word = helper(group);
                if (idx >0) word += " " + THOUSANDS[idx];
                res.add(0, word);
            }
            idx++;
            num /= 1000;
        }
        return String.join(" ", res).trim();
    }
    public String helper(int num) {
        if (num < 20) {
            return LESS_THAN_20[num];
        } else if (num < 100) {
            String last = helper(num % 10);
            return (last == "") ? TENS[num/10] : TENS[num/10] + " " + last;
        } else {
            String last = helper(num % 100);
            return (last == "") ? LESS_THAN_20[num/100] + " Hundred" : LESS_THAN_20[num/100] + " Hundred " + last;
        }
    }
}
