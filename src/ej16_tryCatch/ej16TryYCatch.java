package ej16_tryCatch;

import java.util.Scanner;

public class ej16TryYCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Introduce un número: ");
                numero = Integer.parseInt(sc.nextLine());
                valido = true; // si llega aquí es que no hubo error
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número, intenta de nuevo");
            }
        }

        System.out.println("El número es: " + numero);
    }
}
