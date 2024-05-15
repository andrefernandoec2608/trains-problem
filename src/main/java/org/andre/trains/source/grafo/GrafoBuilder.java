package org.andre.trains.source.grafo;

import org.andre.trains.data.Ruta;
import org.andre.trains.service.load.ManejadorCarga;

public class GrafoBuilder {

    public static GrafoDirigido getDefaultGraph(ManejadorCarga manejadorCarga) {
        final GrafoDirigido routeGraph = new GrafoDirigido();
        for (String ciudad : manejadorCarga.getCiudadesListado()) {
            routeGraph.anadirNodo(ciudad);
        }
        for (Ruta ciudad : manejadorCarga.getRutasListado()) {
            routeGraph.anadirArista(ciudad.getCiudadOrigen(), ciudad.getCiudadDestino(), ciudad.getDistancia());
        }
        return routeGraph;
    }
}
