package org.andre.trains.service.trainroute;

import java.util.List;

public interface Observable {
    public void anadirObservador(Observer observador);
    public void borrarObservador(Observer observador);
    public void anadirDefaultObservadores();
    public void procesarObservadores();
}
