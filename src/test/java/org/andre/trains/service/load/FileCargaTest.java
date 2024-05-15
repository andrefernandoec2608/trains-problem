package org.andre.trains.service.load;

import junit.framework.TestCase;

public class FileCargaTest extends TestCase {

    public void testCargarRutas() {
        try {
            FileCarga fileCarga = new FileCarga();
            fileCarga.cargarRutas();
            fail("Se esperaba UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Excepción esperada
        }
    }

    public void testCargarIndicaciones() {
        try {
            FileCarga fileCarga = new FileCarga();
            fileCarga.cargarIndicaciones();
            fail("Se esperaba UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Excepción esperada
        }
    }
}