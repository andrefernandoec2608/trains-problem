package org.andre.trains.service.trainroute;

import org.andre.trains.service.indicacion.DistanciaIndicacion;
import org.andre.trains.service.indicacion.Indicacion;
import org.andre.trains.source.grafo.Arista;
import org.andre.trains.source.grafo.GrafoDirigido;

import java.util.*;

public class DistanciaObserver implements Observer {

    private final GrafoDirigido grafoRutas;
    private List<DistanciaIndicacion> listaIndicaciones = new ArrayList<>();
    private static String NO_SUCH_ROUTE = "NO SUCH ROUTE";

    public DistanciaObserver(GrafoDirigido grafoRutas, List<Indicacion> indicacionList) {
        this.grafoRutas = grafoRutas;
        for (Indicacion indicacion : indicacionList) {
            if (indicacion instanceof DistanciaIndicacion) {
                listaIndicaciones.add((DistanciaIndicacion) indicacion);
            }
        }
        if (listaIndicaciones.isEmpty())
            throw new UnsupportedOperationException();
    }

    @Override
    public void procesar() {
        System.out.println("***DistanciaObserver");
        for (DistanciaIndicacion indicacion : listaIndicaciones) {
            System.out.println("---->" + indicacion);
            System.out.println("Respuesta: " + procesarDistancia(indicacion));
        }
    }

    private String procesarDistancia(DistanciaIndicacion indicacion) {
        int distanciaRecorrida = 0;
        for(int i = 0 ; i < indicacion.getCiudades().size() -1 ; i++) {
            String primeraParada = indicacion.getCiudades().get(i);
            String segundaParada = indicacion.getCiudades().get(i + 1);

            Map<String, Integer> primeraParadaMap = this.grafoRutas.getNodos().get(primeraParada);
            if (primeraParadaMap.containsKey(segundaParada)) {
                distanciaRecorrida += primeraParadaMap.get(segundaParada);
            } else {
                return NO_SUCH_ROUTE;
            }
        }
        return Integer.valueOf(distanciaRecorrida).toString();
    }
}