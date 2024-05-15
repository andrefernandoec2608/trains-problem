package org.andre.trains.service.load;

import org.andre.trains.data.Ruta;
import org.andre.trains.service.indicacion.Indicacion;
import org.andre.trains.utility.TipoCarga;

/**
 *  Carga la informacion.
 * <p>
 * {@code @allumiquinga}
 */
import java.util.List;

abstract public class ManejadorCarga {

    public static final TipoCarga TIPO_CARGA = TipoCarga.DUMMY;

    private static ManejadorCarga INSTANCE;
    private List<String> ciudadesListado;
    private List<Ruta> rutasListado;
    private List<Indicacion> indicacionesListado;

    protected ManejadorCarga() {
        cargarCiudades();
        cargarRutas();
        cargarIndicaciones();
    }

    public static ManejadorCarga getInstance() {
        if(INSTANCE == null) {
            INSTANCE = manejadorInstancia();
        }
        return INSTANCE;
    }

    private static ManejadorCarga manejadorInstancia() {
        switch (TIPO_CARGA){
            case DUMMY : return new DummyCarga();
            case NETWORK : return new NetworkCarga();
            case FILE : return new FileCarga();
            default: return null;
        }
    }

    public abstract void cargarCiudades();
    public abstract void cargarRutas();
    public abstract void cargarIndicaciones();

    public List<Ruta> getRutasListado() {
        return rutasListado;
    }

    public void setRutasListado(List<Ruta> rutasListado) {
        this.rutasListado = rutasListado;
    }

    public List<Indicacion> getIndicacionesListado() {
        return indicacionesListado;
    }

    public void setIndicacionesListado(List<Indicacion> indicacionesListado) {
        this.indicacionesListado = indicacionesListado;
    }

    public List<String> getCiudadesListado() {
        return ciudadesListado;
    }

    public void setCiudadesListado(List<String> ciudadesListado) {
        this.ciudadesListado = ciudadesListado;
    }
}