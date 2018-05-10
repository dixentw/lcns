package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ContainerTest {
    Container c = new Container();
    @Test
    public void test1(){
        assertEquals(16, c.maxArea(new int[]{1,4,1,1,1,9}));
    }
}
