package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ToeplitzMatrixTest {
    ToeplitzMatrix s = new ToeplitzMatrix();
    @Test
    public void test1(){
        assertFalse(s.isToeplitzMatrix(new int[][]{
            {22,0,94,45,46,96},
        }));
        assertTrue(s.isToeplitzMatrix(new int[][]{
            {1,2,3,4},
            {5,1,2,3},
            {9,5,1,2}
        }));
        assertFalse(s.isToeplitzMatrix(new int[][]{
            {22,0,94,45,46,96},
            {10,22,80,94,45,46}
        }));
    }
}
