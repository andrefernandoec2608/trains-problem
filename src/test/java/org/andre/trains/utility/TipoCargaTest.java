package org.andre.trains.utility;

import junit.framework.TestCase;

public class TipoCargaTest extends TestCase {

    public void testValues() {
        TipoCarga[] expectedValues = {TipoCarga.DUMMY, TipoCarga.NETWORK, TipoCarga.FILE};
        TipoCarga[] actualValues = TipoCarga.values();
        assertEquals(expectedValues.length, actualValues.length);

        for (TipoCarga value : expectedValues) {
            assertTrue(containsValue(actualValues, value));
        }
    }

    public void testValueOf() {
        assertEquals(TipoCarga.DUMMY, TipoCarga.valueOf("DUMMY"));
        assertEquals(TipoCarga.NETWORK, TipoCarga.valueOf("NETWORK"));
        assertEquals(TipoCarga.FILE, TipoCarga.valueOf("FILE"));
    }

    private boolean containsValue(TipoCarga[] values, TipoCarga value) {
        for (TipoCarga v : values) {
            if (v == value) {
                return true;
            }
        }
        return false;
    }
}