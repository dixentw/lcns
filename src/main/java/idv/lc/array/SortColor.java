package idv.lc.array;

import java.util.*;

public class SortColor {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        for (int i=0; i<nums.length; i++) {
            int v = nums[i];
            nums[i] = 2;
            if (v < 2) {
                nums[one++] = 1;
            }
            if (v == 0) {
                nums[zero++] = 0;
            }
        }
    }
}
