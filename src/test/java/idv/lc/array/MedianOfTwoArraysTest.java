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
        assertEquals(1, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 0));
        assertEquals(2, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 1));
        assertEquals(3, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 2));
        assertEquals(4, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 3));
    }
    public void test1(){
        int[] num1 = new int[]{2,3,6,7,9};
        int[] num2 = new int[]{1,4,8,10};
        assertEquals(1, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 0));
        assertEquals(2, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 1));
        assertEquals(3, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 2));
        assertEquals(4, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 3));
        assertEquals(6, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 4));
        assertEquals(7, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 5));
        assertEquals(8, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 6));
        assertEquals(9, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 7));
        assertEquals(10, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 8));
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
        assertEquals(1, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 0));
        assertEquals(2, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 1));
        assertEquals(3, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 2));
        assertEquals(4, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 3));
    }
    @Test
    public void test4(){
        System.out.println("--------------");
        int[] num1 = new int[]{4, 6};
        int[] num2 = new int[]{1,2,3,5,7,8};
        assertEquals(1, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 0));
        assertEquals(2, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 1));
        assertEquals(3, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 2));
        assertEquals(4, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 3));
        assertEquals(5, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 4));
        assertEquals(6, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 5));
        assertEquals(7, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 6));
        assertEquals(8, s.helper(num1, 0, num1.length-1, num2, 0, num2.length-1, 7));
    }
}
