package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class UniqlePathTest {
    UniqlePath s = new UniqlePath();
    @Test
    public void test1(){
        assertEquals(3, s.uniquePaths(3,2));
    }
}
