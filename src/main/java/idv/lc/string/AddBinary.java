package idv.lc.string;

import java.util.*;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0;
        while (m >=0 || n>=0) {
            int sum = carry;
            if (m >=0) sum += a.charAt(m) - '0';
            if (n >=0) sum += b.charAt(n) - '0';
            carry = sum / 2;
            sb.insert(0, (char)('0'+(sum % 2)));
            m--;
            n--;
        }
        if (carry == 1) {
            sb.insert(0, '1');
        }
        return sb.toString();
    }
    public String addBinary0(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0;
        while (m >=0 || n>=0) {
            int abit;
            int bbit;
            if (m < 0) {
                abit = 0;
            } else {
                abit = a.charAt(m) - '0';
            }
            if (n < 0) {
                bbit = 0;
            } else {
                bbit = b.charAt(n) - '0';
            }
            int res = abit + bbit + carry;
            if (res > 1) {
                carry = 1;
                res = res-2;
            } else {
                carry = 0;
            }
            sb.insert(0, (char)('0'+res));
            m--;
            n--;
        }
        if (carry == 1) {
            sb.insert(0, '1');
        }
        return sb.toString();
    }
}
