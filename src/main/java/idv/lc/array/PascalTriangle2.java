package idv.lc.array;

import java.util.*;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i=0; i<= rowIndex; i++) {
            res.add(1);
            for (int j=i-1; j>=1; j--) {
                res.set(j, res.get(j) + res.get(j-1));
            }
        }
        return res;
    }
}
