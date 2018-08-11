package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SortColorTest {
    SortColor s = new SortColor();
    @Test
    public void test1(){
        int[] arr = new int[]{2,0,2,1,1,0};
        s.sortColors(arr);
        assertEquals("[0, 0, 1, 1, 2, 2]", Arrays.toString(arr));
    }
    @Test
    public void test2(){
        int[] arr = new int[]{2,2,1,1,0};
        s.sortColors(arr);
        assertEquals("[0, 1, 1, 2, 2]", Arrays.toString(arr));
    }
    @Test
    public void test5(){
        int[] arr = new int[]{1,1,2,2,0};
        s.sortColors(arr);
        assertEquals("[0, 1, 1, 2, 2]", Arrays.toString(arr));
    }
    @Test
    public void test3(){
        int[] arr = new int[]{2,0,1};
        s.sortColors(arr);
        assertEquals("[0, 1, 2]", Arrays.toString(arr));
    }
    @Test
    public void test4(){
        int[] arr = new int[]{1,2,0};
        s.sortColors(arr);
        assertEquals("[0, 1, 2]", Arrays.toString(arr));
    }
}
