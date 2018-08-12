package idv.lc.array;

import java.util.*;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int start = 0;
        int end = matrix[0].length * (matrix.length-1) + matrix[0].length-1;
        while (start <= end) {
            int mid = (start + end) /2;
            int i = mid / matrix[0].length;
            int j = mid % matrix[0].length;
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
