package idv.lc.string;

import java.util.*;

public class ComplexNumMultiply {
    public String complexNumberMultiply(String a, String b) {
        int[] ca = parseComplex(a);
        int[] cb = parseComplex(b);
        int lead  = ca[0] * cb[0];
        int tail = ca[1] * cb[1] * (-1);
        int middle = (ca[0] * cb[1]) + (ca[1] * cb[0]);
        return String.valueOf(lead+tail) + "+" + String.valueOf(middle)+"i";
    }

    public int[] parseComplex (String s) {
        String[] d = s.split("\\+");
        int[] res = new int[2];
        res[0] = Integer.parseInt(d[0]);
        res[1] = Integer.parseInt(d[1].substring(0, d[1].length()-1));
        return res;
    }
}
