package idv.lc.math;

import java.util.*;

public class LC400 {
    public int findNthDigit__(int n){
         // For 1, 2 .., 9, return the result directly
        if(n <= 9){
            return n;
        }
        int base = 1;
        while(n > 9 * Math.pow(10, base - 1) * base)
        {
            System.out.println(9 * (int)Math.pow(10, base - 1) * base);
            n = n - 9 * (int)Math.pow(10, base - 1) * base;
            System.out.println(n);
            base++;
        }
        System.out.printf("base : %d, n: %d\n", base, n);
        int number = (int)Math.pow(10, base - 1) + (n - 1) / base;
        System.out.println(number);
        int index = (n - 1) % base;
        System.out.println(index);
        // The answer is the index-th digit of the variable number
        return Integer.toString(number).charAt(index) - '0';
    }
    public int findNthDigit(int n) {
        long base = 9;
        long digits = 1;
        while (n > base*digits) {
            n -= (int) base*digits;
            base *= 10;
            digits++;
        }
        //get the number, we count from 10, so the n should minus 1
        long num = (long) Math.pow(10, digits-1) + (n-1)/digits;
        //get the digit
        int idx = (n-1) % (int)digits;
        for (int i=idx; i<digits-1; i++) {
            num /= 10;
        }
        return (int)num % 10;
    }
}
