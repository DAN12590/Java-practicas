package ej5;

import java.util.Scanner;
import java.util.ArrayList;

public class ej5ArraysTeoria {
    public static void main(String[] args) {
         // ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        //     Integer xq es para INT    aqui new ArrayList xq la creamos nueva
        // ArrayList de ints, solo puede guardar INT
        numeros.add(7);
        numeros.add(5);
        numeros.add(83);
        // numeros = [7, 5, 83]  -> equivalente a lo de arriba
        System.out.println(numeros);
        System.out.println(numeros.get(2)); //igual q python, 3ra posicion, cuenta el 0
        System.out.println(numeros.size()); // tamaño, como len() en Python
        numeros.remove(2);
        System.out.println(numeros);
        System.out.println(numeros.size()); // tamaño, como len() en Python
    }
}
