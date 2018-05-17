package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MedianOfTwoArraysTest{
    MedianOfTwoArrays s = new MedianOfTwoArrays();
    @Test
    public void test0(){
        int[] num1 = new int[]{1,2};
        int[] num2 = new int[]{3,4};
        assertEquals(1, s.helper2(num1, num2, 0));
        assertEquals(2, s.helper2(num1, num2, 1));
        assertEquals(3, s.helper2(num1, num2, 2));
        assertEquals(4, s.helper2(num1, num2, 3));
    }
    public void test1(){
        int[] num1 = new int[]{2,3,6,7,9};
        int[] num2 = new int[]{1,4,8,10};
        assertEquals(1, s.helper2(num1,  num2, 0));
        assertEquals(2, s.helper2(num1,  num2, 1));
        assertEquals(3, s.helper2(num1,  num2, 2));
        assertEquals(4, s.helper2(num1,  num2, 3));
        assertEquals(6, s.helper2(num1,  num2, 4));
        assertEquals(7, s.helper2(num1,  num2, 5));
        assertEquals(8, s.helper2(num1,  num2, 6));
        assertEquals(9, s.helper2(num1,  num2, 7));
        assertEquals(10, s.helper2(num1, num2, 8));
    }
    @Test
    public void test2(){
        int[] num1 = new int[]{1,3};
        int[] num2 = new int[]{2};
        assertEquals(2.0, s.findMedianSortedArrays(num1, num2), 0.0001);
        num1 = new int[]{1,2};
        num2 = new int[]{3,4};
        assertEquals(2.5, s.findMedianSortedArrays(num1, num2), 0.0001);

    }
    @Test
    public void test3(){
        System.out.println("--------------");
        int[] num1 = new int[]{3};
        int[] num2 = new int[]{1,2,4};
        assertEquals(1, s.helper2(num1, num2, 0));
        assertEquals(2, s.helper2(num1, num2, 1));
        assertEquals(3, s.helper2(num1, num2, 2));
        assertEquals(4, s.helper2(num1, num2, 3));
    }
    @Test
    public void test4(){
        System.out.println("--------------");
        int[] num1 = new int[]{4, 6};
        int[] num2 = new int[]{1,2,3,5,7,8};
        assertEquals(1, s.helper2(num1, num2, 0));
        assertEquals(2, s.helper2(num1, num2, 1));
        assertEquals(3, s.helper2(num1, num2, 2));
        assertEquals(4, s.helper2(num1, num2, 3));
        assertEquals(5, s.helper2(num1, num2, 4));
        assertEquals(6, s.helper2(num1, num2, 5));
        assertEquals(7, s.helper2(num1, num2, 6));
        assertEquals(8, s.helper2(num1, num2, 7));
    }
}
