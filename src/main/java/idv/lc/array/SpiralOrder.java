package idv.lc.array;

import java.util.*;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int iStart = 0;
        int jStart = 0;
        int iEnd = matrix.length-1;
        int jEnd = matrix[0].length-1;
        while (iStart<=iEnd || jStart<=jEnd ) {
            for (int k=jStart; k<=jEnd; k++) {
                res.add(matrix[iStart][k]);
            }
            iStart++;
            if (iStart > iEnd) break;
            for (int k=iStart; k<=iEnd; k++) {
                res.add(matrix[k][jEnd]);
            }
            jEnd--;
            if (jStart > jEnd) break;
            for (int k=jEnd; k>=jStart; k--) {
                res.add(matrix[iEnd][k]);
            }
            iEnd--;
            if (iStart > iEnd) break;
            for (int k=iEnd; k>=iStart; k--) {
                res.add(matrix[k][jStart]);
            }
            jStart++;
            if (jStart > jEnd) break;
        }
        return res;
    }
}
