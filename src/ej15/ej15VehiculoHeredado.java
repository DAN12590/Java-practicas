package ej15;

import java.util.Scanner;

public class ej15VehiculoHeredado {
    public static void main(String[] args) {
        Ej15zVehiculo coche = new Ej15zVehiculo("audi", 144);
        coche.info();
        System.out.println();
        Ej15zMotoHeredado moto = new Ej15zMotoHeredado("kawasaki", 222, false );
        moto.info();
        System.out.println();
        moto.tieneSidercar();
    }
}