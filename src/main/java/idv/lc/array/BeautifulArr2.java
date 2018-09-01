package idv.lc.array;

import java.util.*;

public class BeautifulArr2 {
    public int[] constructArray(int n, int k) {
        int[] output = new int[n];
        int start = 1;
        int end = n;
        int i=0;
        while (i < k) {
            output[i++] = start++;
            if (i<k) output[i++] = end--;
        }
        if (k % 2 == 0) {
            while(i<output.length) output[i++] = end--;
        } else {
            while(i<output.length) output[i++] = start++;
        }
        return output;
    }
}
