package idv.lc.misc;

import java.util.*;

public class Arrange {
    public int getMinArrange(int m, int n, int people) {
        int[][] seats = new int[m][n];
        List<Integer[]> so = new ArrayList<>();
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                int total = 4;
                if (i-1 < 0) total--;
                if (i+1 >= m) total--;
                if (j-1 < 0) total--;
                if (j+1 >= n) total--;
                seats[i][j] = total;
                so.add(new Integer[]{total, i, j});
            }
        }
        for (int i=0; i<m*n-people; i++) { //要拿掉的部分
            int max = 0;
            int mX = 0;
            int mY = 0;
            for (int j=0; j<m; j++) {
                for (int k=0; k<n; k++) {
                    if (seats[j][k] > max) {
                        max = seats[j][k];
                        mX = j;
                        mY = k;
                    }
                }
            }
            seats[mX][mY] = 0;
            if (mX-1 >=0 && seats[mX-1][mY]>0) seats[mX-1][mY]--;
            if (mX+1 < m && seats[mX+1][mY]>0) seats[mX+1][mY]--;
            if (mY-1 >=0 && seats[mX][mY-1]>0) seats[mX][mY-1]--;
            if (mY+1 < n && seats[mX][mY+1]>0) seats[mX][mY+1]--;
        }
        int sum = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                sum += seats[i][j];
            }
        }
        return sum/2;
    }
}
