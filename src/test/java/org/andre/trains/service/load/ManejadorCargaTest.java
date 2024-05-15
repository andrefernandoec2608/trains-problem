package org.andre.trains.service.load;

import junit.framework.TestCase;

public class ManejadorCargaTest extends TestCase {

    public void testGetInstance() {
        ManejadorCarga mockManejador = new DummyCarga();
        assertEquals(mockManejador.getClass(), ManejadorCarga.getInstance().getClass());
    }
}