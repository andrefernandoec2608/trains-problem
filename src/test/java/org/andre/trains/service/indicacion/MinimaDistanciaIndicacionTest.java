package org.andre.trains.service.indicacion;

import junit.framework.TestCase;

public class MinimaDistanciaIndicacionTest extends TestCase {

    MinimaDistanciaIndicacion minimaDistanciaIndicacion = new MinimaDistanciaIndicacion("A","B");
    public void testGetCiudadOrigen() {
        assertEquals("A", minimaDistanciaIndicacion.getCiudadOrigen());
    }

    public void testGetCiudadDestino() {
        assertEquals("B", minimaDistanciaIndicacion.getCiudadDestino());
    }

    public void testTestToString() {
        String expected = "Calcular la minima distancia entre la ciudad de origen: A y la ciudad de destino: B";
        assertEquals(expected, minimaDistanciaIndicacion.toString());
    }
}