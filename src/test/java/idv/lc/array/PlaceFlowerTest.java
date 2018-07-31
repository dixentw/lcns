package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PlaceFlowerTest {
    PlaceFlower s = new PlaceFlower();
    @Test
    public void test1(){
        assertTrue(s.canPlaceFlowers(new int[]{0}, 1));
        assertFalse(s.canPlaceFlowers(new int[]{1}, 1));
        assertFalse(s.canPlaceFlowers(new int[]{1,0}, 1));
        assertFalse(s.canPlaceFlowers(new int[]{0,1}, 1));
        assertTrue(s.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        assertFalse(s.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }
}
