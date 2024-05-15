package org.andre.trains.service.trainroute;

import junit.framework.TestCase;
import org.andre.trains.service.load.ManejadorCarga;
import org.andre.trains.source.grafo.GrafoBuilder;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DistanciaObserverTest extends TestCase {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    ManejadorCarga manejadorCarga = ManejadorCarga.getInstance();
    Observer disObserver = new DistanciaObserver(GrafoBuilder.getDefaultGraph(manejadorCarga), manejadorCarga.getIndicacionesListado());

    protected void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    protected void tearDown() {
        System.setOut(originalOut);
    }
    public void testProcesar() {
        disObserver.procesar();
        assertTrue("Respuesta: 9", outContent.toString().contains("Respuesta: 9"));
        assertTrue("Respuesta: 5", outContent.toString().contains("Respuesta: 5"));
        assertTrue("Respuesta: 13", outContent.toString().contains("Respuesta: 13"));
        assertTrue("Respuesta: 22", outContent.toString().contains("Respuesta: 22"));
    }
}