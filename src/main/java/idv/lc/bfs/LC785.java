package idv.lc.bfs;

import java.util.*;

public class LC785 {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for (int i=0; i<graph.length; i++) {
            if (color[i] != 0) continue;
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            color[i] = 1;
            while (!q.isEmpty()) {
                Integer currNode = q.poll();
                for (Integer child : graph[currNode]){
                    if (color[child] == 0) {
                        color[child] = - color[currNode];
                        q.offer(child);
                    } else {
                        if (color[child] == color[currNode]) return false;
                    }
                }
            }
        }
        return true;
    }
}
