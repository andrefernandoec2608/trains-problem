package org.andre.trains.service.load;

import junit.framework.TestCase;

public class NetworkCargaTest extends TestCase {

    public void testCargarRutas() {
        try {
            NetworkCarga carga = new NetworkCarga();
            carga.cargarRutas();
            fail("Se esperaba UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Excepción esperada
        }
    }

    public void testCargarIndicaciones() {
        try {
            NetworkCarga carga = new NetworkCarga();
            carga.cargarIndicaciones();
            fail("Se esperaba UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Excepción esperada
        }
    }
}