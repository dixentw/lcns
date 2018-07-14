package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MaxChunkTest {
    MaxChunk s = new MaxChunk();
    @Test
    public void test1(){
        assertEquals(1, s.maxChunksToSorted(new int[]{4,3,2,1,0}));
        assertEquals(4, s.maxChunksToSorted(new int[]{1,0,2,3,4}));
        assertEquals(2, s.maxChunksToSorted(new int[]{1,2,0,3}));
        assertEquals(1, s.maxChunksToSorted(new int[]{2,0,1}));
        assertEquals(2, s.maxChunksToSorted(new int[]{0,4,5,2,1,3}));
    }
}
