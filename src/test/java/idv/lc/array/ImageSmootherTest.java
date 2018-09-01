package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ImageSmootherTest {
    ImageSmoother s = new ImageSmoother();
    @Test
    public void test1(){
        int[][] m = new int[][]{
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        int[][] res = s.imageSmoother(m);
        assertEquals("[0, 0, 0]", Arrays.toString(res[0]));
        assertEquals("[0, 0, 0]", Arrays.toString(res[1]));
        assertEquals("[0, 0, 0]", Arrays.toString(res[2]));
    }
}
