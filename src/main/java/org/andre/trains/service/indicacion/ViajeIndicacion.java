package org.andre.trains.service.indicacion;

import org.andre.trains.utility.Condicion;

/**
 *  Indicacion para calcular el numero de viajes.
 * <p>
 * {@code @allumiquinga}
 */
public class ViajeIndicacion implements Indicacion {
    private Condicion condicion;
    private int parametroCondicion;
    private String ciudadOrigen;
    private String ciudadDestino;

    public ViajeIndicacion(Condicion condicion, int parametroCondicion, String ciudadOrigen, String ciudadDestino) {
        this.condicion = condicion;
        this.parametroCondicion = parametroCondicion;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public int getParametroCondicion() {
        return parametroCondicion;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    @Override
    public String toString() {
        return "Calcular los viajes entre la ciudad de origen: " + this.ciudadOrigen + " y la ciudad de destino: " + this.ciudadDestino + ", con la condicion: " + this.condicion + " y el termino de la condicion: " + this.parametroCondicion;
    }
}