package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SimilarRGBTest {
    SimilarRGB s = new SimilarRGB();
    @Test
    public void test1(){
        assertEquals(9, s.hexToVal("09"));
        assertEquals("#11ee66", s.similarRGB("#09f166"));
    }
}
