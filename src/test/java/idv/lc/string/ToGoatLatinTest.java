package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ToGoatLatinTest {
    ToGoatLatin s = new ToGoatLatin();
    @Test
    public void test1(){
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
                s.toGoatLatin("I speak Goat Latin"));
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                s.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
