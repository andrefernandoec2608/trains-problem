package org.andre.trains.source.grafo;

import org.andre.trains.utility.RutaException;

import java.util.HashMap;
import java.util.Map;

public class GrafoDirigido {

    private final Map<String, Map<String, Integer>> nodos = new HashMap<>();

    public void anadirNodo(String nodo) {
        if (!this.nodos.containsKey(nodo)) {
            this.nodos.put(nodo, new HashMap<>());
        }
    }

    public void anadirArista(String desde, String hacia, int peso) {
        validacionesGrafo(desde, hacia);
        //this.nodos.get(desde).add(new Arista(desde, hacia, peso));
        this.nodos.get(desde).put(hacia, peso);
    }

    private void validacionesGrafo(String desde, String hacia) {
        // Ciudad origen igual a ciudad destino
        if (desde.equals(hacia)) {
            throw new RutaException("La ciudad origen no puede ser igual a la ciudad destino.");
        }
        // No existe la ciudad origen
        if (!this.nodos.containsKey(desde)) {
            throw new RutaException(desde, hacia);
        }
        // No existe la ciudad origen
        if (!this.nodos.containsKey(hacia)) {
            throw new RutaException(desde, hacia);
        }
        //
        //Arista validacion = new Arista(desde, hacia, 0);
        if(this.nodos.get(desde).containsKey(hacia)){
            throw new RutaException("No se puede definir 2 rutas iguales.");
        }
    }

    public Map<String, Map<String, Integer>> getNodos() {
        return nodos;
    }
}
