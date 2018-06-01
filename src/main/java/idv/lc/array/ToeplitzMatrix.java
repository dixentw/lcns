package idv.lc.array;

import java.util.*;

class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
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
