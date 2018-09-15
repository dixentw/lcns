package idv.lc.array;

import java.util.*;

class RotateImage {
    /*
     * 開另外一個array的做法是不及格的
     * 
     * 首先要先知道，rotate一個array要先把row reverse
     * 再來才是交換i, j方可rotate
     *
     *  ex : 1, 2, 3     7, 8, 9    7, 4, 1
     *       4, 5, 6  >  4, 5, 6 >  8, 5, 2
     *       7, 8, 9     1, 2, 3    9, 6, 3
     *  [FAIL] - 置換對角線一次就好了，不能全跑，不然又換回來了
     */
    public void rotate(int[][] matrix) {
        int start = 0;
        int end = matrix.length-1;
        while(start < end) {
            int[] row = matrix[start];
            matrix[start] = matrix[end];
            matrix[end]  = row;
            start++;
            end--;
        }
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (i>j) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
        }
    }
    public void rotateOLD(int[][] matrix) {
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
