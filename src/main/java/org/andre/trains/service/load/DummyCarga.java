package org.andre.trains.service.load;

import org.andre.trains.data.Ruta;
import org.andre.trains.service.indicacion.*;
import org.andre.trains.utility.Condicion;


import java.util.ArrayList;
import java.util.List;

public class DummyCarga extends ManejadorCarga {

    @Override
    public void cargarCiudades() {
        List<String> ciudadesDummyListado = new ArrayList<>();
        ciudadesDummyListado.add("A");
        ciudadesDummyListado.add("B");
        ciudadesDummyListado.add("C");
        ciudadesDummyListado.add("D");
        ciudadesDummyListado.add("E");
        setCiudadesListado(ciudadesDummyListado);
    }

    @Override
    public void cargarRutas() {
        List<Ruta> rutasDummyListado = new ArrayList<>();
        rutasDummyListado.add(new Ruta("A", "B", 5));
        rutasDummyListado.add(new Ruta("B", "C", 4));
        rutasDummyListado.add(new Ruta("C", "D", 8));
        rutasDummyListado.add(new Ruta("D", "C", 8));
        rutasDummyListado.add(new Ruta("D", "E", 6));
        rutasDummyListado.add(new Ruta("A", "D", 5));
        rutasDummyListado.add(new Ruta("C", "E", 2));
        rutasDummyListado.add(new Ruta("E", "B", 3));
        rutasDummyListado.add(new Ruta("A", "E", 7));
        setRutasListado(rutasDummyListado);
    }

    @Override
    public void cargarIndicaciones() {
        List<Indicacion> indicacionesListado = new ArrayList<>();
        cargarIndicacionesDistancia(indicacionesListado);
        cargarIndicacionesViajes(indicacionesListado);
        cargarIndicacionesMinimasDistancias(indicacionesListado);
        cargarIndicacionesRutas(indicacionesListado);
        setIndicacionesListado(indicacionesListado);
    }

    private void cargarIndicacionesRutas(List<Indicacion> indicacionesListado) {
        // 30 C-C
        RutasIndicacion rutasIndicacion = new RutasIndicacion("C", "C", 30);
        indicacionesListado.add(rutasIndicacion);
    }

    private void cargarIndicacionesMinimasDistancias(List<Indicacion> indicacionesListado) {
        // A-C
        MinimaDistanciaIndicacion minimaDistanciaIndicacion = new MinimaDistanciaIndicacion("A", "C");
        indicacionesListado.add(minimaDistanciaIndicacion);
        // B-B
        minimaDistanciaIndicacion = new MinimaDistanciaIndicacion("B", "B");
        indicacionesListado.add(minimaDistanciaIndicacion);
    }

    private void cargarIndicacionesViajes(List<Indicacion> indicacionesListado) {
        // MAX_PARADAS,3,C-C
        ViajeIndicacion viajeIndicacion = new ViajeIndicacion(Condicion.MAX_PARADAS, 3, "C", "C");
        indicacionesListado.add(viajeIndicacion);
        // EXAC_PARADAS,4,A-C
        viajeIndicacion = new ViajeIndicacion(Condicion.EXAC_PARADAS, 4, "A", "C");
        indicacionesListado.add(viajeIndicacion);
    }

    private void cargarIndicacionesDistancia(List<Indicacion> indicacionesListado) {
        DistanciaIndicacion distanciaIndicacion = null;
        List<String> ciudades = null;
        // A-B-C
        ciudades = new ArrayList<>();
        ciudades.add("A");
        ciudades.add("B");
        ciudades.add("C");
        distanciaIndicacion = new DistanciaIndicacion(ciudades);
        indicacionesListado.add(distanciaIndicacion);
        // A-D
        ciudades = new ArrayList<>();
        ciudades.add("A");
        ciudades.add("D");
        distanciaIndicacion = new DistanciaIndicacion(ciudades);
        indicacionesListado.add(distanciaIndicacion);
        // A-D-C
        ciudades = new ArrayList<>();
        ciudades.add("A");
        ciudades.add("D");
        ciudades.add("C");
        distanciaIndicacion = new DistanciaIndicacion(ciudades);
        indicacionesListado.add(distanciaIndicacion);
        // A-E-B-C-D
        ciudades = new ArrayList<>();
        ciudades.add("A");
        ciudades.add("E");
        ciudades.add("B");
        ciudades.add("C");
        ciudades.add("D");
        distanciaIndicacion = new DistanciaIndicacion(ciudades);
        indicacionesListado.add(distanciaIndicacion);
        // A-D
        ciudades = new ArrayList<>();
        ciudades.add("A");
        ciudades.add("E");
        ciudades.add("D");
        distanciaIndicacion = new DistanciaIndicacion(ciudades);
        indicacionesListado.add(distanciaIndicacion);
    }
}