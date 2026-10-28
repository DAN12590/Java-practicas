package funciones;

import java.util.Scanner;

public class ej9Funciones {
    static int sumar(int a, int b) {
        return a + b;
    }
    static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }
    public static void main(String[] args) {
        System.out.println(sumar(3, 5)); // 8
        saludar("David");
    }
}
