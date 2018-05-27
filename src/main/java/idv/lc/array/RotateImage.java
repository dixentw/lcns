package idv.lc.array;

import java.util.*;

class RotateImage {
    public void rotate(int[][] matrix) {
        int len = matrix[0].length-1;
        int[][] a = new int[len+1][len+1];
        for(int i=0; i<=len; i++){
            for(int j=0; j<=len; j++){
                a[j][len-i] = matrix[i][j];
            }
        }
        for(int i=0; i<=len; i++){
            for(int j=0; j<=len; j++){
                matrix[i][j] = a[i][j];
            }
        }
    }
}
