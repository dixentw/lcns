package idv.lc.array;

import java.util.*;

public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int maxLen = 0;
        for (int i=0; i<nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            int tmpLen = 0;
            int k = i;
            while (!visited[k]) {
                visited[k] = true;
                k = nums[k];
                tmpLen++;
            }
            maxLen = Math.max(tmpLen, maxLen);
        }
        return maxLen;
    }
}
