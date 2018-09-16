package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CheckRecordTest {
    CheckRecord s = new CheckRecord();
    @Test
    public void test1(){
        assertTrue(s.checkRecord("PPALLP"));
        assertFalse(s.checkRecord("PPALLL"));
        assertTrue(s.checkRecord("LALL"));
    }
}
