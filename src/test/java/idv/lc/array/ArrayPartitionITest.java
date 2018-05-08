package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ArrayPartitionITest{
    ArrayPartitionI a = new ArrayPartitionI();
    @Test
    public void test1(){
        int[] arr = new int[]{1,4,3,2};
        assertEquals(4, a.arrayPairSum(arr));
        assertEquals(4, a.arrayPairSumV2(arr));
    }
}
