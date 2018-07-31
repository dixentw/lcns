package idv.lc.array;

import java.util.*;

public class PlaceFlower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i=0; i<flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean prev = (i==0) ? true : flowerbed[i-1] == 0;
                boolean next = (i==flowerbed.length-1) ? true : flowerbed[i+1] == 0;
                if (prev && next) {
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }
        return n <= 0;
    }

    public boolean canPlaceFlowersV1(int[] flowerbed, int n) {
        for (int i=0; i<flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0 && i == flowerbed.length - 1) {
                    n--;
                    flowerbed[i] = 1;
                    continue;
                }
                if (i == 0 ) {
                    if (flowerbed[i+1] == 0) {
                        n--;
                        flowerbed[i] = 1;
                    }
                    continue;
                }
                if (i == flowerbed.length-1 ) {
                    if (flowerbed[i-1] == 0) {
                        n--;
                        flowerbed[i] = 1;
                    }
                    continue;
                }
                if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }
        return n <= 0;
    }
}
