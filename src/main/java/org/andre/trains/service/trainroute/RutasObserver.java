package org.andre.trains.service.trainroute;

import org.andre.trains.service.indicacion.RutasIndicacion;
import org.andre.trains.service.indicacion.Indicacion;
import org.andre.trains.source.grafo.GrafoDirigido;

import java.util.ArrayList;
import java.util.List;

public class RutasObserver implements Observer {

    private final GrafoDirigido grafoRutas;
    private List<RutasIndicacion> indicacionObserver = new ArrayList<>();

    public RutasObserver(GrafoDirigido grafoRutas, List<Indicacion> indicacionList) {
        this.grafoRutas = grafoRutas;
        for (Indicacion indicacion : indicacionList) {
            if (indicacion instanceof RutasIndicacion) {
                indicacionObserver.add((RutasIndicacion) indicacion);
            }
        }
        if (indicacionObserver.isEmpty())
            throw new UnsupportedOperationException();
    }

    @Override
    public void procesar() {
        System.out.println("***RutasObserver");
        for (RutasIndicacion indicacion : indicacionObserver) {
            System.out.println("---->" + indicacion);
        }

    }

}
