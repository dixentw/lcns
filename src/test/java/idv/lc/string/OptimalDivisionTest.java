package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OptimalDivisionTest {
    OptimalDivision s = new OptimalDivision();
    @Test
    public void test1(){
        assertEquals("1000/(100/10/2)", s.optimalDivision(new int[]{1000,100,10,2}));
    }
}
