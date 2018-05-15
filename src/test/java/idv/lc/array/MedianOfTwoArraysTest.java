package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MedianOfTwoArraysTest{
    MedianOfTwoArrays s = new MedianOfTwoArrays();
    @Test
    public void test1(){
        int[] num1 = new int[]{1,3};
        int[] num2 = new int[]{2};
        //assertEquals(2.0, s.findMedianSortedArrays(num1, num2), 0.0001);
        num1 = new int[]{1,2};
        num2 = new int[]{3,4};
        assertEquals(2.5, s.findMedianSortedArrays(num1, num2), 0.0001);

    }
}
