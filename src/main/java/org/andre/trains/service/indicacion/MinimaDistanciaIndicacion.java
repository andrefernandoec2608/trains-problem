package org.andre.trains.service.indicacion;

/**
 *  Indicacion para cacular la minima distancia de la ruta.
 * <p>
 * {@code @allumiquinga}
 */
public class MinimaDistanciaIndicacion implements Indicacion {
    private String ciudadOrigen;
    private String ciudadDestino;

    public MinimaDistanciaIndicacion(String ciudadOrigen, String ciudadDestino) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    @Override
    public String toString() {
        return "Calcular la minima distancia entre la ciudad de origen: " + this.ciudadOrigen + " y la ciudad de destino: " + this.ciudadDestino;
    }
}
