## LintCode 183

1. [SOLUTION] the point is to binary search on the range of numbers, not the woods length itself.

```java
public class Solution {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {
        //enumerate all possible length between 1 and largest wood
        int end = 0;
        for (int n : L) end = Math.max(n, end);
        int start = 1;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (cuts(L,mid)>=k) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public int cuts(int[] L, int len) {
        int cuts = 0;
        for (int n : L) cuts += n/len;
        return cuts;
    }
}
```

