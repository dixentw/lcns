package idv.lc.array;

import java.util.*;

class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1; i>=0; i--) {
            if(digits[i] + carry >= 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = digits[i] + carry;
                carry = 0;
            }
        }
        if (carry == 1) {
            int[] extended = new int[digits.length+1];
            extended[0] = carry;
            for(int i=0; i<digits.length;i++){
                extended[i+1] = digits[i];
            }
            return extended;
        } else {
            return digits;
        }
    }
    public int[] plusOneV2(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }
}
