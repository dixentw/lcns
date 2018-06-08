package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MoveZeroTest {
    MoveZero s = new MoveZero();
    @Test
    public void test1(){
        int[] arr = new int[]{0,1,0,3,12};
        s.moveZeroes(arr);
        assertEquals("[1, 3, 12, 0, 0]", Arrays.toString(arr));
    }
}
