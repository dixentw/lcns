package idv.lc.array;

public class MaxAvgSub {
    public double findMaxAverage(int[] nums, int k) {
        if (k > nums.length || nums.length == 0 || k == 0) {
            return 0;
        }
        int segSum = 0;
        for (int i=0; i<k; i++) {
            segSum += nums[i];
        }
        double res = (double)segSum / (double)k;
        for (int i=1; i<= nums.length - k; i++) {
            segSum = segSum - nums[i-1] + nums[i+k-1];
            double tmpAvg = (double)segSum / (double) k;
            res = Math.max(res, tmpAvg);
        }
        return res;
    }
}
