package ej15;

public class Ej15zCocheHeredado extends Ej15zVehiculo {
    int numPuertas;
    public Ej15zCocheHeredado(String marca, int velocidadMax, int numPuertas) {
        super(marca, velocidadMax);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

}

