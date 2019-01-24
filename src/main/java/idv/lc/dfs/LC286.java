package idv.lc.dfs;

import java.util.*;

public class LC286 {
    public void wallsAndGates(int[][] rooms) {
        for (int i=0; i<rooms.length; i++) {
            for (int j=0; j<rooms[0].length; j++) {
                if (rooms[i][j]==0) dfs(rooms, i, j, 0);
            }
        }
    }
    public void dfs(int[][] rooms, int i, int j, int d) {
        if (i<0||i>=rooms.length||j<0||j>=rooms[0].length||rooms[i][j]<d) return;
        rooms[i][j] = d;
        dfs(rooms, i, j-1, d+1);
        dfs(rooms, i, j+1, d+1);
        dfs(rooms, i+1, j, d+1);
        dfs(rooms, i-1, j, d+1);
    }
    public void _wallsAndGates(int[][] rooms) {
        if (rooms.length==0) return;
        boolean[][] isVisited = new boolean[rooms.length][rooms[0].length];
        for (int i=0; i<rooms.length; i++) {
            for (int j=0; j<rooms[0].length; j++) {
                for (boolean[] row : isVisited) Arrays.fill(row, false);
                if (rooms[i][j]==Integer.MAX_VALUE) { // is a room
                    rooms[i][j] = findPathToGate(rooms, i, j, isVisited);
                }
            }
        }
    }
    public int findPathToGate(int[][] rooms, int x, int y, boolean[][] isVisited) {
        if (x<0 || x>=rooms.length || y<0 || y>=rooms[0].length) {
            return -1;
        }
        if (isVisited[x][y] || rooms[x][y]==-1) return -1;
        if (rooms[x][y]==0) return 0;
        isVisited[x][y] = true;
        int left = findPathToGate(rooms, x, y-1, isVisited);
        int right = findPathToGate(rooms, x, y+1, isVisited);
        int up = findPathToGate(rooms, x-1, y, isVisited);
        int down = findPathToGate(rooms, x+1, y, isVisited);
        left = left==-1?rooms.length:left;
        right = right==-1?rooms.length: right;
        up = up==-1? rooms[0].length: up;
        down = down==-1? rooms[0].length: down;
        int min = Math.min(Math.min(left, right), Math.min(up, down));
        return min+1;
    }
}
