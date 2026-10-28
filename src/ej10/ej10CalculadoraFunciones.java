package ej10;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class ej10CalculadoraFunciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int modo;
        do {
            System.out.println("Dime el primer numero");
            float num1 = Float.parseFloat(sc.nextLine());
            System.out.println("Dime el segundo numero");
            float num2 = Float.parseFloat(sc.nextLine());
            System.out.println("Que modo quieres elegir? 0 para salir \n1-Suma\n2-Resta\n3-Multiplicacion\n4-Division");
            modo = Integer.parseInt(sc.nextLine());
            switch (modo){
                case 1:
                    System.out.println("La suma es: " + sumar(num1,num2));
                    continue;
                case 2:
                    System.out.println("La resta es: " + restar(num1,num2));
                    continue;
                case 3:
                    System.out.println("La multiplicacion es: " + multiplicar(num1,num2));
                    continue;
                case 4:
                    float resultado = divid(num1,num2);
                    if (Float.isNaN(resultado)){
                        System.out.println("No se puede dividir entre cero");}
                    else{
                        System.out.println("La division es: " + resultado);
                    }
                    continue;
                case 0:
                    System.out.println("Saliendo...");
                    continue;
                default:
                    error();
                    continue;

            }

        } while (modo != 0);
    }

    static float sumar(float num1, float num2){
        return num1 + num2;
    }
    static float restar(float num1, float num2){
        return num1 - num2;
    }
    static float multiplicar(float num1, float num2){
        return num1 * num2;
    }
    static float divid(float num1, float num2){
        if (num1==0 || num2==0) {
            return Float.NaN;
        }
        else{
            return num1/num2;
        }
    }
    static void error() {
        System.out.println("Numero no disponible");;
    }

}

