package idv.lc.math;

import java.util.*;

public class LC168 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.insert(0, (char)('A' + n%26));
            n /= 26;
        }
        return sb.toString();
    }
    public String convertToTitleFAIL(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int d = n / 26;
            int m = (d-1) % 26;
            if (d <= 1) {
                sb.append((char)('A' + m));
            } else {
                sb.append((char)('A' + n-1));
            }
            n /= 26;
        }
        return sb.toString();
    }
}
