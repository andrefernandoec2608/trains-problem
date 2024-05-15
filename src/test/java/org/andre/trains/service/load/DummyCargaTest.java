package org.andre.trains.service.load;

import junit.framework.TestCase;
import org.andre.trains.data.Ruta;
import org.andre.trains.service.indicacion.DistanciaIndicacion;
import org.andre.trains.service.indicacion.Indicacion;
import org.andre.trains.service.indicacion.MinimaDistanciaIndicacion;
import org.andre.trains.service.indicacion.ViajeIndicacion;

import java.util.List;

public class DummyCargaTest extends TestCase {
    private DummyCarga  dummyCarga = new DummyCarga();

    public void testCargarRutas() {
        List<Ruta> rutas = dummyCarga.getRutasListado();
        assertNotNull(rutas);
        assertEquals(4, rutas.size());

        Ruta ruta1 = rutas.get(0);
        assertEquals("A", ruta1.getCiudadOrigen());
        assertEquals("B", ruta1.getCiudadDestino());
        assertEquals(5, ruta1.getDistancia());

        Ruta ruta2 = rutas.get(1);
        assertEquals("B", ruta2.getCiudadOrigen());
        assertEquals("C", ruta2.getCiudadDestino());
        assertEquals(4, ruta2.getDistancia());

        Ruta ruta3 = rutas.get(2);
        assertEquals("C", ruta3.getCiudadOrigen());
        assertEquals("D", ruta3.getCiudadDestino());
        assertEquals(8, ruta3.getDistancia());

        Ruta ruta4 = rutas.get(3);
        assertEquals("D", ruta4.getCiudadOrigen());
        assertEquals("C", ruta4.getCiudadDestino());
        assertEquals(8, ruta4.getDistancia());}

    public void testCargarIndicaciones() {
        List<Indicacion> indicaciones = dummyCarga.getIndicacionesListado();
        assertNotNull(indicaciones);
        assertEquals(7, indicaciones.size());

        assertTrue(indicaciones.get(0) instanceof DistanciaIndicacion);
        assertTrue(indicaciones.get(1) instanceof DistanciaIndicacion);
        assertTrue(indicaciones.get(2) instanceof ViajeIndicacion);
        assertTrue(indicaciones.get(3) instanceof ViajeIndicacion);
        assertTrue(indicaciones.get(4) instanceof MinimaDistanciaIndicacion);
        assertTrue(indicaciones.get(5) instanceof MinimaDistanciaIndicacion);
    }
}