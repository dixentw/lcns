package idv.lc.math;

import java.util.*;

public class LC415 {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int t1 = num1.length()-1;
        int t2 = num2.length()-1;
        StringBuilder sb = new StringBuilder();
        while (t1 >= 0 || t2 >= 0) {
            if (t1 < 0) {
                int sum = num2.charAt(t2--) - '0' + carry;
                carry = sum / 10;
                sb.insert(0, String.valueOf(sum%10));
                continue;
            }
            if (t2 < 0) {
                int sum = num1.charAt(t1--) - '0' + carry;
                carry = sum / 10;
                sb.insert(0, String.valueOf(sum%10));
                continue;
            }
            int sum = (num1.charAt(t1--) - '0') + (num2.charAt(t2--) - '0') + carry;
            carry = sum / 10;
            sb.insert(0, String.valueOf(sum % 10));
        }
        if (carry != 0) sb.insert(0, String.valueOf(carry));
        return sb.toString();
    }
}
