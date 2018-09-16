package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SplitLoopedStringTest {
    SplitLoopedString s = new SplitLoopedString();
    @Test
    public void test1(){
        assertEquals("zyxcba", s.splitLoopedString(new String[]{"abc", "xyz"}));
        assertEquals("zfewafewafwaezdaefffawezfewafawe", s.splitLoopedString(new String[]{"awef","eawf","zdaeff","awefzewaf","awefzewaf"}));
    }
}
