package idv.lc.string;

import java.util.*;

public class MultiplyStr {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m+n];
        for (int i=m-1; i>=0; i--) {
            for (int j=n-1; j>=0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i+j+1];
                result[i+j] += sum / 10; // remember plus previous
                result[i+j+1]  = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        // avoid leading zero, cannot escape middle zero, but should escape all zero
        for (int i=0; i<result.length; i++) {
            if (sb.length()==0 && result[i]==0) {
                continue;
            }
            sb.append(result[i]);
        }
        //corner case
        if (sb.length()==0) {
            return "0";
        }
        return sb.toString();
    }
}
