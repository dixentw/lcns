package idv.lc.array;

import java.util.*;

public class FindBlackPixel {
    public int findBlackPixel(char[][] picture, int N) {
        int[] rowCnt = new int[picture.length];
        int[] colCnt = new int[picture[0].length];
        for (int i=0; i<picture.length; i++) {
            for (int j=0; j<picture[0].length; j++) {
                if (picture[i][j]=='B') {
                    rowCnt[i]++;
                    colCnt[j]++;
                }
            }
        }
        int res = 0;
        for (int i=0; i<rowCnt.length; i++) {
            for (int j=0; j<colCnt.length; j++) {
                if (rowCnt[i] == N && colCnt[j] == N && picture[i][j]=='B') {
                    boolean broke = false;
                    String curr = Arrays.toString(picture[i]);
                    for (int k=0; k<picture.length; k++) {
                        if (picture[k][j] == 'B' && !curr.equals(Arrays.toString(picture[k]))) {
                            broke = true;
                        }
                    }
                    if (!broke) res++;
                }
            }
        }
        return res;
    }
}
