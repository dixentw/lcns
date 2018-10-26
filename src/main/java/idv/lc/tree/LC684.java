package idv.lc.tree;

import java.util.*;

public class LC684 {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parents = new int[edges.length+1];
        for (int i=0; i<parents.length; i++) parents[i] = -1;
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            int px = find(parents, x);
            int py = find(parents, y);
            if (px == py) return edge;
            parents[px] = py;
        }
        return new int[2];
    }
    public int find(int[] parents, int i) {
        if (parents[i] == -1) return i;
        return find(parents, parents[i]);
    }
}
