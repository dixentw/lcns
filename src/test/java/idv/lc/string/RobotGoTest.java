package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RobotGoTest {
    RobotGo s = new RobotGo();
    @Test
    public void test1(){
        assertTrue(s.judgeCircle("UD"));
        assertFalse(s.judgeCircle("LL"));
    }
}
