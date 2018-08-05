package idv.lc.array;

import java.util.*;

public class UniquePath2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] DP = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i=0; i<DP.length; i++) {
            for (int j=0; j<DP[0].length; j++) {
                if (i == 0 && j == 0) {
                    DP[i][j] =  1;
                } else if (i == 0) {
                    DP[i][j] = DP[i][j-1];
                } else if (j == 0) {
                    DP[i][j] = DP[i-1][j];
                } else {
                    DP[i][j] = DP[i-1][j]+ DP[i][j-1];
                }
                DP[i][j] = obstacleGrid[i][j] == 1 ? 0 : DP[i][j];
            }
        }
        return DP[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
