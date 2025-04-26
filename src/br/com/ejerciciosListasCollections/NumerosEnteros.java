package br.com.ejerciciosListasCollections;

public class NumerosEnteros {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NumerosEnteros(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nN° " + getNumero();
    }
}
