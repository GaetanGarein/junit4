package junit.tests.framework;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.junit.ComparisonFailure;

public class AssertTest extends TestCase {

    /* In the tests that follow, we can't use standard formatting
      * for exception tests:
      *     try {
      *         somethingThatShouldThrow();
      *         fail();
      *     catch (AssertionFailedError e) {
      *     }
      * because fail() would never be reported.
      */
    public void testFail() {
        // Also, we are testing fail, so we can't rely on fail() working.
        // We have to throw the exception manually.
        try {
            fail();
        } catch (AssertionError e) {
            return;
        }
        throw new AssertionFailedError();
    }

    public void testAssertionFailedErrorToStringWithNoMessage() {
        // Also, we are testing fail, so we can't rely on fail() working.
        // We have to throw the exception manually.
        try {
            fail();
        } catch (AssertionError e) {
            assertEquals("java.lang.AssertionError", e.toString());
            return;
        }
        throw new AssertionFailedError();
    }

    public void testAssertionFailedErrorToStringWithMessage() {
        // Also, we are testing fail, so we can't rely on fail() working.
        // We have to throw the exception manually.
        try {
            fail("woops!");
        } catch (AssertionError e) {
            assertEquals("java.lang.AssertionError: woops!", e.toString());
            return;
        }
        throw new AssertionFailedError();
    }

    public void testAssertEquals() {
        Object o = new Object();
        assertEquals(o, o);
        try {
            assertEquals(new Object(), new Object());
        } catch (AssertionError e) {
            return;
        }
        fail();
    }

    public void testAssertEqualsNull() {
        assertEquals((Object) null, (Object) null);
    }

    public void testAssertStringEquals() {
        assertEquals("a", "a");
    }

    public void testAssertNullNotEqualsString() {
        try {
            assertEquals(null, "foo");
            fail();
        } catch (AssertionError e) {
        }
    }

    public void testAssertStringNotEqualsNull() {
        try {
            assertEquals("foo", null);
            fail();
        } catch (AssertionError e) {
            e.getMessage(); // why no assertion?
        }
    }

    public void testAssertNullNotEqualsNull() {
        try {
            assertEquals(null, new Object());
        } catch (AssertionError e) {
            e.getMessage(); // why no assertion?
            return;
        }
        fail();
    }

    public void testAssertNull() {
        assertNull(null);
        try {
            assertNull(new Object());
        } catch (AssertionError e) {
            return;
        }
        fail();
    }

    public void testAssertNotNull() {
        assertNotNull(new Object());
        try {
            assertNotNull(null);
        } catch (AssertionError e) {
            return;
        }
        fail();
    }

    public void testAssertTrue() {
        assertTrue(true);
        try {
            assertTrue(false);
        } catch (AssertionError e) {
            return;
        }
        fail();
    }

    public void testAssertFalse() {
        assertFalse(false);
        try {
            assertFalse(true);
        } catch (AssertionError e) {
            return;
        }
        fail();
    }

    public void testAssertSame() {
        Object o = new Object();
        assertSame(o, o);
        try {
            assertSame(new Integer(1), new Integer(1));
        } catch (AssertionError e) {
            return;
        }
        fail();
    }

    public void testAssertNotSame() {
        assertNotSame(new Integer(1), null);
        assertNotSame(null, new Integer(1));
        assertNotSame(new Integer(1), new Integer(1));
        try {
            Integer obj = new Integer(1);
            assertNotSame(obj, obj);
        } catch (AssertionError e) {
            return;
        }
        fail();
    }

    public void testAssertNotSameFailsNull() {
        try {
            assertNotSame(null, null);
        } catch (AssertionError e) {
            return;
        }
        fail();
    }
}