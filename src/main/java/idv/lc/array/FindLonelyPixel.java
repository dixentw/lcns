package idv.lc.array;

import java.util.*;

public class FindLonelyPixel {
    public int findLonelyPixel(char[][] picture) {
        int[] rowCnt = new int[picture.length];
        int[] colCnt = new int[picture[0].length];
        for (int i=0; i<picture.length; i++) {
            for (int j=0; j<picture[0].length; j++) {
                if (picture[i][j] == 'B') {
                    rowCnt[i] += 1;
                    colCnt[j] += 1;
                }
            }
        }
        int res = 0;
        for (int i=0; i<rowCnt.length; i++) {
            for (int j=0; j<colCnt.length; j++) {
                if (picture[i][j]=='B' && rowCnt[i]==1 && colCnt[j]==1) res++;
            }
        }
        return res;
    }
}
