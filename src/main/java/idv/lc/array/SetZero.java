package idv.lc.array;

import java.util.*;

public class SetZero {
    public void setZeroes(int[][] matrix) {
        boolean col1 = false;
        //set header of column
        for (int i=0; i<matrix.length; i++) {
            if (matrix[i][0] == 0) col1 = true;
            for (int j=1; j<matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        for (int i=matrix.length-1; i>=0; i--) {
            for (int j=1; j <matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col1) matrix[i][0] = 0;
        }
    }

    public void setZeroes_1(int[][] matrix) {
        boolean col1 = false;
        for (int i=0; i<matrix.length; i++) {
            if (matrix[i][0] == 0) {
                col1 = true;
            }
        }
        boolean row1 = false;
        for (int j=0; j<matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                row1 = true;
            }
        }
        for (int i=1; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                }
            }
        }
        for (int j=1; j<matrix[0].length; j++) {
            for (int i=1; i<matrix.length; i++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (col1) {
            for (int i=0; i<matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if (row1) {
            for (int j=0; j<matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
