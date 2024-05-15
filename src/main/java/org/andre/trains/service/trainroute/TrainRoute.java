package org.andre.trains.service.trainroute;

import org.andre.trains.data.Ruta;
import org.andre.trains.service.indicacion.Indicacion;
import org.andre.trains.service.load.ManejadorCarga;
import org.andre.trains.source.grafo.GrafoDirigido;
import org.andre.trains.source.grafo.GrafoBuilder;

import java.util.ArrayList;
import java.util.List;

public class TrainRoute implements Observable{

    private final GrafoDirigido grafoRutas;
    private List<Indicacion> indicacionList;
    private List<Observer> listaObservadores = new ArrayList<>();

    public TrainRoute(ManejadorCarga manejadorCarga) {
        this.grafoRutas = armarGraph(manejadorCarga);
        this.indicacionList = manejadorCarga.getIndicacionesListado();
    }

    @Override
    public void anadirObservador(Observer observador) {
        listaObservadores.add(observador);
    }

    @Override
    public void borrarObservador(Observer observador) {
        listaObservadores.remove(observador);
    }

    @Override
    public void anadirDefaultObservadores() {
        listaObservadores.add(new DistanciaObserver(grafoRutas, indicacionList));
        listaObservadores.add(new ViajeObserver(grafoRutas, indicacionList));
        listaObservadores.add(new MinimaDistanciaObserver(grafoRutas, indicacionList));
        listaObservadores.add(new RutasObserver(grafoRutas, indicacionList));
    }

    @Override
    public void procesarObservadores() {
        System.out.println("***OBSERVERS***");
        if (listaObservadores.isEmpty())
            throw new UnsupportedOperationException();

        for (Observer observer : listaObservadores) {
            observer.procesar();
        }
    }

    private GrafoDirigido armarGraph(ManejadorCarga manejadorCarga) {
        System.out.println("***MAPA DE RUTA***");
        for(Ruta ruta : manejadorCarga.getRutasListado()) {
            System.out.println(ruta);
        }
        return GrafoBuilder.getDefaultGraph(manejadorCarga);
    }
}