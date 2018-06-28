package idv.lc.array;

import java.util.*;

class BitChar {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        while(i < bits.length-1) {
            if (bits[i]==1) {
                i += 2;
            }else{
                i++;
            }
            if(i==bits.length){
                return false;
            }
        }
        return true;
    }
}
