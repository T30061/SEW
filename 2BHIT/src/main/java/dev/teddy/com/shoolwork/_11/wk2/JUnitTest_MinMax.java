package dev.teddy.com.shoolwork._11.wk2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitTest_MinMax {

    private MinMaxImpl mm;

    @BeforeEach
    void setUp() {
        mm = new MinMaxImpl();
    }

    @Test
    void testMin3() {
        assertEquals(3, mm.min3(5, 3, 7), "min3 should return the minimum using Math.min");
        assertEquals(-10, mm.min3(-10, 0, 5), "min3 should handle negative numbers");
        assertEquals(5, mm.min3(5, 5, 5), "min3 of equal numbers");
        assertEquals(2, mm.min3(2, 2, 5), "min3 with two equal minimums");
        assertEquals(-1, mm.min3(-1, -1, 0), "min3 with negative minimum repeated");
        assertEquals(-5, mm.min3(-5, 0, 5), "min3 with mixed signs");
        assertEquals(Integer.MIN_VALUE, mm.min3(Integer.MIN_VALUE, 0, 100), "min3 with Integer.MIN_VALUE");
        assertEquals(-100, mm.min3(-100, -50, -10), "min3 with all negative numbers");
    }

    @Test
    void testMax3() {
        assertEquals(7, mm.max3(5, 3, 7), "max3 should return the maximum using Math.max");
        assertEquals(20, mm.max3(20, 0, 5), "max3 should handle positive numbers");
        assertEquals(5, mm.max3(5, 5, 5), "max3 of equal numbers");
        assertEquals(5, mm.max3(2, 5, 5), "max3 with two equal maximums");
        assertEquals(0, mm.max3(-1, 0, 0), "max3 with zero as maximum repeated");
        assertEquals(5, mm.max3(-5, 0, 5), "max3 with mixed signs");
        assertEquals(Integer.MAX_VALUE, mm.max3(Integer.MAX_VALUE, 0, -100), "max3 with Integer.MAX_VALUE");
        assertEquals(-10, mm.max3(-100, -50, -10), "max3 with all negative numbers");
    }

    @Test
    void testEdgeCases() {
        assertEquals(Integer.MIN_VALUE, mm.min3(Integer.MIN_VALUE, Integer.MAX_VALUE, 0), "min3 with min and max int");
        assertEquals(Integer.MAX_VALUE, mm.max3(Integer.MIN_VALUE, Integer.MAX_VALUE, 0), "max3 with min and max int");
        assertEquals(0, mm.min3(0, 0, 5), "min3 with zeros");
        assertEquals(5, mm.max3(0, 0, 5), "max3 with zeros");
    }
}
