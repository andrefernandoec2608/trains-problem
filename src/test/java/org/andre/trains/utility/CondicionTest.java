package org.andre.trains.utility;

import junit.framework.TestCase;

public class CondicionTest extends TestCase {

    public void testValues() {
        Condicion[] expectedValues = {Condicion.MAX_PARADAS, Condicion.EXAC_PARADAS,};
        Condicion[] actualValues = Condicion.values();
        assertEquals(expectedValues.length, actualValues.length);

        for (Condicion value : expectedValues) {
            assertTrue(containsValue(actualValues, value));
        }
    }

    private boolean containsValue(Condicion[] values, Condicion value) {
        for (Condicion v : values) {
            if (v == value) {
                return true;
            }
        }
        return false;
    }

    public void testValueOf() {
        assertEquals(Condicion.MAX_PARADAS, Condicion.valueOf("MAX_PARADAS"));
        assertEquals(Condicion.EXAC_PARADAS, Condicion.valueOf("EXAC_PARADAS"));
    }
}