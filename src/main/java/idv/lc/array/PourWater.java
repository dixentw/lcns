package idv.lc.array;

import java.util.*;

public class PourWater {
    public int[] pourWater(int[] heights, int V, int K) {
        while (V-- > 0) {
            // find lowest
            int lowest = K;
            for (int i=K-1; i>=0; i--) {
                if (heights[i] > heights[lowest]) {
                    break;
                } else if (heights[i] < heights[lowest]) {
                    lowest = i;
                }
            }
            if (lowest != K) {
                heights[lowest]++;
            } else {
                for (int i=K+1; i<heights.length; i++) {
                    if (heights[i] > heights[lowest]) {
                        break;
                    } else if (heights[i] < heights[lowest]) {
                        lowest = i;
                    }
                }
                heights[lowest]++;
            }
        }
        return heights;
    }
}
