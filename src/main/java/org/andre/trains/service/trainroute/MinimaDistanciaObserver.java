package org.andre.trains.service.trainroute;

import org.andre.trains.service.indicacion.MinimaDistanciaIndicacion;
import org.andre.trains.service.indicacion.Indicacion;
import org.andre.trains.source.grafo.GrafoDirigido;

import java.util.ArrayList;
import java.util.List;

public class MinimaDistanciaObserver implements Observer {

    private final GrafoDirigido grafoRutas;
    private List<MinimaDistanciaIndicacion> indicacionObserver = new ArrayList<>();

    public MinimaDistanciaObserver(GrafoDirigido grafoRutas, List<Indicacion> indicacionList) {
        this.grafoRutas = grafoRutas;
        for (Indicacion indicacion : indicacionList) {
            if (indicacion instanceof MinimaDistanciaIndicacion) {
                indicacionObserver.add((MinimaDistanciaIndicacion) indicacion);
            }
        }
        if (indicacionObserver.isEmpty())
            throw new UnsupportedOperationException();
    }

    @Override
    public void procesar() {
        System.out.println("***MinimaDistanciaObserver");
        for (MinimaDistanciaIndicacion indicacion : indicacionObserver) {
            System.out.println("---->" + indicacion);
        }
    }

}