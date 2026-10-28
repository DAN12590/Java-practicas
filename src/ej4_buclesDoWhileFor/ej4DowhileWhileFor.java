package ej4_buclesDoWhileFor;

import java.util.Scanner;

public class ej4DowhileWhileFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Dime un numero del 1 al 10, 777 para modo sumas");
            numero = sc.nextInt();
            sc.nextLine();
            if (numero == 777){
                int resultado = 0;
                while (numero != 0){
                    System.out.println("Dime un numero para sumar, 0 para salir");
                    numero = sc.nextInt();
                    if (numero< 0){
                        System.out.println("Resultado actual: "+ resultado);
                        continue;
                    }
                    else {
                        resultado = resultado + numero;
                        System.out.println("Resultado actual: "+ resultado);
                }
                } break;
            }
            else if (numero<1 || numero>10) {
                System.out.println("Este numero no esta entre el 1 y el 10, vuelve a intentarlo");
            }
            else {
                System.out.println("Tabla de multiplicar del "+ numero);
                for (int i = 0; i <= 10; i++){
                System.out.print((numero * i)+" | ");
            }}
        } while ((numero<1 || numero>10)&& numero !=777);

    }
}
