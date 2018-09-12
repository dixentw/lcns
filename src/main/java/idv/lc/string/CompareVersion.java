package idv.lc.string;

import java.util.*;

public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int full = Math.max(v1.length, v2.length);
        for (int i=0; i<full; i++) {
            int v1elm = 0;
            int v2elm = 0;
            if (i<v1.length) {
                v1elm = Integer.parseInt(v1[i]);
            }
            if (i<v2.length) {
                v2elm = Integer.parseInt(v2[i]);
            }
            if (v1elm < v2elm) {
                return -1;
            }
            if (v1elm > v2elm) {
                return 1;
            }
        }
        return 0;
    }
}
