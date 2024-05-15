package org.andre.trains.service.indicacion;

import junit.framework.TestCase;

public class RutasIndicacionTest extends TestCase {

    RutasIndicacion rutasIndicacion = new RutasIndicacion("A", "B", 5);

    public void testGetCiudadOrigen() {
        assertEquals("A", rutasIndicacion.getCiudadOrigen());
    }

    public void testGetCiudadDestino() {
        assertEquals("B", rutasIndicacion.getCiudadDestino());
    }

    public void testGetDistancia() {
        assertEquals(5, rutasIndicacion.getDistancia());
    }

    public void testTestToString() {
        String expected = "Calcular el numero de rutas entre la ciudad de origen: A y la ciudad de destino: B, con distancia menor a: 5";
        assertEquals(expected, rutasIndicacion.toString());
    }
}