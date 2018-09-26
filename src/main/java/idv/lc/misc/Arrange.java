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
                if (i+1 > m) total--;
                if (j-1 < 0) total--;
                if (j+1 > n) total--;
                seats[i][j] = total;
                so.add(new Integer[]{total, i, j});
            }
        }
        Collections.sort(so, (Integer[] a, Integer[] b) -> b[0] - a[0]);
        for (int i=0; i<m*n-people; i++) { //要拿掉的部分
            Integer[] data = so.get(i);
            int x = data[1];
            int y = data[2];
            seats[x][y] = 0;
            if (x-1 >=0) seats[x-1][y]--;
            if (x+1 < m) seats[x+1][y]--;
            if (y-1 >=0) seats[x][y-1]--;
            if (y+1 < n) seats[x][y+1]--;
        }
        int sum = 0;
        for (int i=0; i<m; i++) {
            System.out.println(Arrays.toString(seats[i]));
            for (int j=0; j<n; j++) {
                sum += seats[i][j];
            }
        }
        return sum/2;
    }
}
