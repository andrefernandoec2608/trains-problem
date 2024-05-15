package org.andre.trains.service.indicacion;

import junit.framework.TestCase;
import org.andre.trains.utility.Condicion;

public class ViajeIndicacionTest extends TestCase {
    ViajeIndicacion viajeIndicacion = new ViajeIndicacion(Condicion.MAX_PARADAS,30,"A", "B");

    public void testGetCondicion() {
        assertEquals(Condicion.MAX_PARADAS, viajeIndicacion.getCondicion());
    }

    public void testGetParametroCondicion() {
        assertEquals(30, viajeIndicacion.getParametroCondicion());
    }

    public void testGetCiudadOrigen() {
        assertEquals("A", viajeIndicacion.getCiudadOrigen());
    }

    public void testGetCiudadDestino() {
        assertEquals("B", viajeIndicacion.getCiudadDestino());
    }

    public void testTestToString() {
        String expected = "Calcular los viajes entre la ciudad de origen: A y la ciudad de destino: B, con la condicion: MAX_PARADAS y el termino de la condicion: 30";
        assertEquals(expected, viajeIndicacion.toString());
    }
}