package idv.lc.string;

import java.util.*;

public class CountSay {
    public String countAndSay(int n) {
        String init = "1";
        if (n==1) return "1";
        for (int i=2; i<=n; i++) {
            int count = 0;
            String next = "";
            for (int j=0; j<init.length()-1; j++) {
                if (init.charAt(j) == init.charAt(j+1)) {
                    count++;
                } else {
                    next += String.valueOf((char)('0'+count+1)) + String.valueOf(init.charAt(j));
                    count = 0;
                }
            }
            next += String.valueOf((char)('0'+count+1)) + String.valueOf(init.charAt(init.length()-1));
            init = next;
        }
        return init;
    }
}
