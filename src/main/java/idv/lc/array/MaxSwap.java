package idv.lc.array;

import java.util.*;

public class MaxSwap {
    public int maximumSwap(int num) {
        StringBuffer numS = new StringBuffer(String.valueOf(num));
        for (int i=0; i<numS.length()-1; i++) {
            char cur = numS.charAt(i);
            char nextMax = '0';
            int maxIdx = 0;
            for (int j=i+1; j<numS.length(); j++) {
                char next = numS.charAt(j);
                if (nextMax <= next) {
                    nextMax = next;
                    maxIdx = j;
                }
            }
            if (nextMax > cur) {
                numS.replace(i, i+1, Character.toString(nextMax));
                numS.replace(maxIdx, maxIdx+1, Character.toString(cur));
                break;
            }
        }
        return Integer.parseInt(numS.toString());
    }
}
