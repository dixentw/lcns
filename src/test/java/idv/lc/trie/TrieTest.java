package idv.lc.trie;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class TrieTest{
    Trie t = new Trie();
    @Test
    public void test1(){
        t.insert("ab");
        assertFalse(t.search("a"));
    }
}
