package org.andre;

import org.andre.trains.service.load.ManejadorCarga;
import org.andre.trains.service.trainroute.TrainRoute;

public class App {
    public static void main(String[] args) {
        //  Carga
        ManejadorCarga manejadorCarga = ManejadorCarga.getInstance();
        // Rutas de tren
        TrainRoute trainRoute = new TrainRoute(manejadorCarga);
        trainRoute.anadirDefaultObservadores();
        trainRoute.procesarObservadores();
    }
}