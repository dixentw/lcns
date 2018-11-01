package idv.lc.math;

import java.util.*;

public class LC60 {

    public String getPermutation(int n, int k) {
        int pos = 0;
        List<Integer> nums = new ArrayList<>();
        int[] factorial = new int[n+1]; // memory facotrial
        StringBuilder sb = new StringBuilder();

        //create factorial table and numbers
        int sum = 1;
        factorial[0] = 1;
        for (int i=1; i<=n; i++) {
            sum *= i;
            factorial[i] = sum;
            nums.add(i);
        }
        k = k-1;
        for (int i=1; i<=n; i++) {
            int idx = k/factorial[n-i];
            sb.append(String.valueOf(nums.get(idx)));
            nums.remove(idx);
            k = k - idx * factorial[n-i];
        }
        return sb.toString();
    }


    public String getPermutationSlow(int n, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=n; i++) {
            sb.append(String.valueOf(i));
        }
        List<String> res = new ArrayList<>();
        helper(sb.toString(), "", res);
        for (String line : res) System.out.println(line);
        return res.get(k-1);
        //return "213";
    }
    public void helper(String nums, String tmp, List<String> res) {
        if (tmp.length() == nums.length()) {
            res.add(tmp);
            return;
        }
        for (int i=0; i<nums.length(); i++) {
            if (tmp.indexOf(nums.charAt(i)) != -1) {
                continue;
            }
            tmp = tmp + String.valueOf(nums.charAt(i));
            helper(nums, tmp, res);
            tmp = tmp.substring(0, tmp.length()-1);
        }
    }
}
