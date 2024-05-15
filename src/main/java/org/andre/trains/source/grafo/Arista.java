package org.andre.trains.source.grafo;

import java.util.Objects;

public class Arista {

    private final String nodoInicial;
    private final String nodoFinal;
    private final int peso;

    public Arista(final String nodoInicial, final String nodoFinal, final int peso) {
        this.nodoInicial = nodoInicial;
        this.nodoFinal = nodoFinal;
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arista a = (Arista) o;
        return nodoFinal == a.nodoFinal; // Dos personas son iguales si tienen el mismo id
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodoFinal);
    }

    public String getNodoInicial() {
        return nodoInicial;
    }

    public String getNodoFinal() {
        return nodoFinal;
    }

    public int getPeso() {
        return peso;
    }

}
