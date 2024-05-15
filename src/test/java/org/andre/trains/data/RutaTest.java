package org.andre.trains.data;

import junit.framework.TestCase;

public class RutaTest extends TestCase {

    Ruta ruta = new Ruta("A", "B", 5);

    public void testGetCiudadOrigen() {
        assertEquals("A", ruta.getCiudadOrigen());
    }

    public void testGetCiudadDestino() {
        assertEquals("B", ruta.getCiudadDestino());
    }

    public void testGetDistancia() {
        assertEquals(5, ruta.getDistancia());
    }

    public void testTestToString() {
        String expected = "Ciudad Origen: 'A', Ciudad Destino: 'B', Distancia entre ciudades: '5'";
        assertEquals(expected, ruta.toString());
    }
}