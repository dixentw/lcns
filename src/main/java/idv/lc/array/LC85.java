package idv.lc.array;

import java.util.*;

public class LC85 {
    public int maximalRectangle(char[][] matrix) {
        /*
        if (matrix.length==0) return 0;
        int[] left = new int[matrix[0].length];
        int[] right = new int[matrix[0].length];
        int [] height = new int[matrix[0].length];
        //why?
        Arrays.file(right, matrix[0].length);
        int area = 0;
        for (int i=0; i<matrix.length; i++) {
            int currLeft = 0;
            int currRight = matrix[0].length;

            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j]=='1') height[j]++;
                else height[j] = 0;
            }
            for (int j=0; j<matrix[0].length, j++) {
                if (matrix[i][j]=='1') {
                    left[j] = Math.max(currLeft, left[j]);
                } else {
                    left[j] = 0;
                    currLeft = j+1;
                }
            }
        }*/
        return 0;


    }
}
