package org.andre.trains.utility;

public class RutaException extends RuntimeException {

    public RutaException(final String ciudadOrigen, final String ciudadDestino) {
        super("No existe la ruta entre la ciudad origen: " + ciudadOrigen + " y la ciudad destino: " + ciudadDestino);
    }

    public RutaException(String mensaje) {
        super(mensaje);
    }
}
