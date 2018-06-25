package idv.lc.array;

import java.util.*;

class MaxChunk {
    public int maxChunksToSorted(int[] arr) {
        int[] max = new int[arr.length];
        //邊界條件這樣做比較好
        max[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            max[i] = Math.max(max[i-1],arr[i]);
        }
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(max[i]==i){
                cnt++;
            }
        }
        return cnt;
    }

    public int ffff(int[] arr) {
        int i = arr.length - 1;
        int cnt = 0;
        while (i>=0) {
            if (arr[i]>=i) {
                i--;
                cnt++;
            } else {
                i = arr[i];
            }
        }
        return cnt;
    }
}
