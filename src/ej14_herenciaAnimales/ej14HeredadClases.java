package ej14_herenciaAnimales;

import java.util.Scanner;

public class ej14HeredadClases {
    public static void main(String[] args) {
        Ej14zPerroHeredado perro = new Ej14zPerroHeredado("Rex", 3, "Labrador");
        Ej14zGatoHeredado gato = new Ej14zGatoHeredado("Misi", 2);

        perro.comer();   // heredado de Animal
        perro.ladrar();  // propio de Perro
        System.out.println(perro.getRaza());  // propio de perro
        System.out.println(perro.getNombre());
        gato.comer();    // heredado de Animal
        gato.maullar();  // propio de Gato
    }
}
