package org.junit.samples;

import static org.junit.Assert.assertEquals;

import junit.framework.JUnit4TestAdapter;
import org.junit.Before;
import org.junit.Test;

/**
 * Some simple tests.
 *
 * <p>This test is expected to fail.
 */
public class SimpleTest {
    protected int fValue1;
    protected int fValue2;

    @Before
    public void setUp() {
        fValue1 = 2;
        fValue2 = 3;
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(SimpleTest.class);
    }

    public int unused;

    @Test
    public void divideByZero() {
        int zero = 0;
        int result = 8 / zero;
        unused = result; // avoid warning for not using result
    }

    @Test
    public void testEquals() {
        int int1 = 12;
        int int2 = 12;
        long long1 = 12;
        long long2 = 12;
        assertEquals(int1, int2);
        assertEquals(long1, long2);
        assertEquals(new Long(12), new Long(12));

        assertEquals("Size", 12, 13);
        assertEquals("Capacity", 12.0, 11.99, 0.0);
    }

}