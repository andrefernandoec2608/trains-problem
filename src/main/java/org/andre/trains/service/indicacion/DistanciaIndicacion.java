package org.andre.trains.service.indicacion;

import java.util.List;

/**
 *  Indicacion para calcular la distancia de la ruta.
 * <p>
 * {@code @allumiquinga}
 */
public class DistanciaIndicacion implements Indicacion {

    /**
     * Ciudades para calcular la distancia entre ellas.
     */
    private List<String> ciudades;

    public DistanciaIndicacion(List<String> ciudades) {
        this.ciudades = ciudades;
    }

    public List<String> getCiudades() {
        return ciudades;
    }

    /**
     * @return Impresion personalizada de la indicacion.
     */
    @Override
    public String toString() {
        StringBuilder listaCiudades = new StringBuilder();
        boolean primerCiudad = true;
        for(String ciudad : this.ciudades) {
            if(primerCiudad) {
                listaCiudades.append("Primera parada: ");
                primerCiudad = false;
            } else {
                listaCiudades.append(", siguiente parada: ");
            }
            listaCiudades.append(ciudad);

        }
        return "Calcular la distancia de la siguiente ruta: " + listaCiudades;
    }
}