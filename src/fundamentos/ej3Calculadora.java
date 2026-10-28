package fundamentos;

import java.util.Scanner;

public class ej3Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Dime 2 numeros para realizar las operacioens: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("Dime que operacion quieres hacer:");
        System.out.println("1-Suma\n2-Resta\n3-Multiplicacion\n4-Division");
        int tipoOperacion = sc.nextInt();
        sc.nextLine();
        if (tipoOperacion == 1) {
            System.out.println("La respuesta es " + (num1 + num2));
        } else if (tipoOperacion == 2) {
            System.out.println("La respuesta es " + (num1 - num2));
        } else if (tipoOperacion == 3) {
            System.out.println("La respuesta es " + (num1 * num2));
        } else if (tipoOperacion == 4) {
            if (num1 == 0|| num2 == 0){
                System.out.println("Ningun numero puede ser 0 en la division");
            }
            else { System.out.println("Quieres que tenga resto? pon \"si\" o \"no\"");
                String restosiono = sc.nextLine();
                if (restosiono.equals("si")){
                    float resto = num1 % num2;
                    System.out.println("La respuesta es " + ((int)(num1 / num2))+ " y el resto es "+ ((int)resto));
                }
                else if(restosiono.equals("no")){
                    System.out.println("La respuesta es " + (num1 / num2));
            }   }
        }
        else{
            System.out.println("No es un numero valido");
        }
    }
}
