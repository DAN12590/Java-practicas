package ej7_switch;

import java.util.Scanner;

public class ej7SwitchEquivMatch {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dime un numero, 7 para salir");
            num = Integer.parseInt(sc.nextLine());
            switch (num){
                case 1:
                    System.out.println("Caso 1");
                    continue;
                case 2:
                    System.out.println("Caso 2");
                    continue;
                case 3:
                    System.out.println("Caso 3");
                    continue;
                case 4:
                    System.out.println("Caso 4");
                    continue;
                case 7:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Todos los demas casos");
                    continue;
            }

        }while (num !=7);
    }
}
