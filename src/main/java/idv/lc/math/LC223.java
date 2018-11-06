package idv.lc.math;

import java.util.*;

public class LC223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int s1 = (C-A) * (D-B);
        int s2 = (G-E) * (H-F);
        int left = Math.max(A, E);
        int right = Math.min(G, C);
        int bottom = Math.max(B, F);
        int top = Math.min(D, H);
        if (right > left && top  > bottom) { //overlap
            return s1 + s2 - ((right-left) * (top-bottom));
        } else {
            return s1 + s2;
        }
    }
}
