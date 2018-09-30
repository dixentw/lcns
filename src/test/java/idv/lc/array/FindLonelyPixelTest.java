package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindLonelyPixelTest {
    FindLonelyPixel s = new FindLonelyPixel();
    @Test
    public void test1(){
        int res = s.findLonelyPixel(new char[][]{
            {'B', 'W', 'W'},
            {'W', 'B', 'W'},
            {'W', 'W', 'B'},
        });
        assertEquals(3, res);
    }
}
