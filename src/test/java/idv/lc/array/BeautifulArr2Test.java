package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BeautifulArr2Test {
    BeautifulArr2 s = new BeautifulArr2();
    /*
    @Test
    public void test1(){
        int[] res = s.constructArray(3, 1);
        assertEquals("[1, 2, 3]", Arrays.toString(res));
    }
    @Test
    public void test2(){
        int[] res = s.constructArray(3, 2);
        assertEquals("[1, 3, 2]", Arrays.toString(res));
    }*/
    @Test
    public void test3(){
        int[] res = s.constructArray(5, 4);
        assertEquals("[1, 5, 2, 4, 3]", Arrays.toString(res));
    }
}
