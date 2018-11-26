package idv.lc.math;

import java.util.*;

public class LC65 {
    public boolean isNumber(String s) {
        s = s.trim();
        return s.matches("[\\+\\-]?([0-9]*\\.[0-9]+|[0-9]+\\.?)([eE][+-]?[0-9]+)?");
    }
}
