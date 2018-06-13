package idv.lc.array;

import java.util.*;

class ToeplitzMatrix {
    // 其實可以不用考慮開頭，因為不管在哪邊開，都要符合i+1, j+1都依樣才行
    // 更簡潔的是，對matrix所有的元素而言，只要i+1, j+1不等於自己，就是false
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length-1; i++){
            for(int j=0; j<matrix[0].length-1; j++){
                if(matrix[i][j]!=matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
    public boolean isToeplitzMatrix_old(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            int x = i;
            int y = 0;
            while(x<matrix.length-1 && y<matrix[i].length-1) {
                if(matrix[x][y]!=matrix[x+1][y+1]){
                    return false;
                }
                x++;
                y++;
            }
        }
        for(int j=0; j<matrix[0].length; j++){
            int x = 0;
            int y = j;
            while(x<matrix.length-1 && y < matrix[0].length-1){
                if(matrix[x][y]!=matrix[x+1][y+1]){
                    return false;
                }
                x++;
                y++;
            }
        }
        return true;
    }
}
