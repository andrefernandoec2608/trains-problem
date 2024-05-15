package org.andre.trains.service.indicacion;

/**
 *  Indicacion para calcular las posibles rutas con distancias mejor a la proporcionada.
 * <p>
 * {@code @allumiquinga}
 */
public class RutasIndicacion implements Indicacion {

    private String ciudadOrigen;
    private String ciudadDestino;
    private int distancia;

    public RutasIndicacion(String ciudadOrigen, String ciudadDestino, int distancia) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.distancia = distancia;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public int getDistancia() {
        return distancia;
    }

    @Override
    public String toString() {
        return "Calcular el numero de rutas entre la ciudad de origen: " + this.ciudadOrigen + " y la ciudad de destino: " + this.ciudadDestino + ", con distancia menor a: " + this.distancia;
    }
}
