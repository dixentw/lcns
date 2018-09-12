package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CodecTest {
    Codec s = new Codec();
    @Test
    public void test1(){
        String str = s.encode(Arrays.asList(new String[]{"abcd", "efgd"}));
        List<String> ret =  s.decode(str);
        assertEquals("abcd", ret.get(0));
        assertEquals("efgd", ret.get(1));
    }
}
