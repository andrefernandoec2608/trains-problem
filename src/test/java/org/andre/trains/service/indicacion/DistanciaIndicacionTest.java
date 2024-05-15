package org.andre.trains.service.indicacion;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class DistanciaIndicacionTest extends TestCase {

    List<String> ciudades = Arrays.asList("A", "B", "C");
    public void testGetCiudades() {
        DistanciaIndicacion distanciaIndicacion = new DistanciaIndicacion(ciudades);

        assertNotNull(distanciaIndicacion);
        assertEquals(ciudades, distanciaIndicacion.getCiudades());
    }

    public void testTestToString() {
        DistanciaIndicacion distanciaIndicacion = new DistanciaIndicacion(ciudades);

        String expected = "Calcular la distancia de la siguiente ruta: Primera parada: A, siguiente parada: B, siguiente parada: C";
        assertEquals(expected, distanciaIndicacion.toString());
    }
}