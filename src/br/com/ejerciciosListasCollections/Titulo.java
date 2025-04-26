package br.com.ejerciciosListasCollections;

import com.sun.source.doctree.EntityTree;

public class Titulo implements Comparable<Titulo> {
    private String nombre;

    public Titulo(String otroTitulo) {
        this.nombre = otroTitulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    @Override
    public int compareTo(Titulo nuevoTitulo) {

        return this.getNombre().compareTo(nuevoTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "\n- " + getNombre();
    }
}
