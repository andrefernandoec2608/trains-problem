package org.andre.trains.data;

/**
 *  Entidad que define una ruta.
 * <p>
 * {@code @allumiquinga}
 */
public class Ruta {
    private String ciudadOrigen;
    private String ciudadDestino;
    private int distancia;

    /**
     * Datos de una ruta.
     *
     * @param ciudadOrigen
     * @param ciudadDestino
     * @param distancia Distancia entre la @param ciudadOrigen y la @param ciudadDestino
     */
    public Ruta(String ciudadOrigen, String ciudadDestino, int distancia) {
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

    /**
     * @return Impresion personalizada de la ruta.
     */
    @Override
    public String toString() {
        return "Ciudad Origen: '" + this.ciudadOrigen + "', Ciudad Destino: '" + this.ciudadDestino + "', Distancia entre ciudades: '" + this.distancia + "'";
    }
}
