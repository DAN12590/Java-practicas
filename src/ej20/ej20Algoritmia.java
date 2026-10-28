package ej20;

import java.util.ArrayList;
import java.util.Scanner;

public class ej20Algoritmia {

    /*public static int primos(int num){
        boolean primo = true;
        for (int i = 2; i < num+1; i++) {
            primo = true;
            for (int j = 2; j <i; j++) {
                if (i% j==0){
                    primo = false;
                    break;
                }
            }
            if (primo) {
                return i;
            }
        }
    }*/

    public static long factorial(int num){
        long res=1;
        for (int i = 1; i < num+1; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime hasta que numero quieres revisar los primos: ");
        int quenum = sc.nextInt();
        System.out.println(factorial(quenum));
    }
}
/*System.out.println(Math.pow(2, 10));
        System.out.println(Math.sqrt(144));
        boolean primo = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime hasta que numero quieres revisar los primos: ");
        int quenum = sc.nextInt();
        for (int i = 2; i < quenum+1; i++) {
            primo = true;
            for (int j = 2; j <i; j++) {
                if (i% j==0){
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("El numero " + i + " es primo");
            }
        }*/