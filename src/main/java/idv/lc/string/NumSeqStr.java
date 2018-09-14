package idv.lc.string;

import java.util.*;
import java.util.stream.Collectors;

public class NumSeqStr {
    // FAIL : 沒考慮到 "" case
    // FAIL : 還要刪掉substring length為0的案例
    public int countSegments(String s) {
        if (s.length() ==0) return 0;
        String[] ss = s.split("\\s+");
        int res = 0;
        for (String rs : ss) {
            if (rs.length() > 0) res++;
        }
        return res;
    }
}
