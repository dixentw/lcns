package idv.lc.amazon;

public class UniqleDigit {
    public void method (int n) {
        for (int i=1; i<=n; i++) {
            if (all_uniqle_digit(i)) {
                System.out.println(i);
            }
        }
    }
    public boolean all_uniqle_digit(int n) {
        int[] digits = new int[10];
        while (n > 0) {
            int d  = n % 10;
            digits[d]++;
            n = n / 10;
        }
        for (int i=0; i<=9; i++) {
            if (digits[i] > 1) {
                return false;
            }
        }
        return true;
    }
}
