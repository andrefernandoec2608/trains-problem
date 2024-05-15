package org.andre.trains.service.trainroute;

import org.andre.trains.service.indicacion.Indicacion;
import org.andre.trains.service.indicacion.ViajeIndicacion;
import org.andre.trains.source.grafo.GrafoDirigido;

import java.util.ArrayList;
import java.util.List;

public class ViajeObserver implements Observer {

    private final GrafoDirigido grafoRutas;
    private List<ViajeIndicacion> indicacionObserver = new ArrayList<>();

    public ViajeObserver(GrafoDirigido grafoRutas, List<Indicacion> indicacionList) {
        this.grafoRutas = grafoRutas;
        for (Indicacion indicacion : indicacionList) {
            if (indicacion instanceof ViajeIndicacion) {
                indicacionObserver.add((ViajeIndicacion) indicacion);
            }
        }
        if (indicacionObserver.isEmpty())
            throw new UnsupportedOperationException();
    }

    @Override
    public void procesar() {
        System.out.println("***ViajeObserver");
        for (ViajeIndicacion indicacion : indicacionObserver) {
            System.out.println("---->" + indicacion);
        }
    }
}