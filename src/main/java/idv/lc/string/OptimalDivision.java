package idv.lc.string;

import java.util.*;

public class OptimalDivision {
    // 給了一個list of number, 都不下括號的話，原始form 是 n1/n2/n3/n4
    // 我們要安插括號進去讓解答是最大
    // * 除數越小越大 N1 / ( N2/N3/N4...) 看起來是最好的
    // * 有什麼反例嗎?
    public String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(nums[0]));
        if (nums.length == 1) return sb.toString();
        if (nums.length == 2) return sb.append("/").append(String.valueOf(nums[1])).toString();
        sb.append("/(");
        for (int i=1; i<nums.length; i++) {
            sb.append(String.valueOf(nums[i])).append("/");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(")");
        return sb.toString();
    }
}
