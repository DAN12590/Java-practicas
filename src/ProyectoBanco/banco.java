package ProyectoBanco;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class banco {
    public static void main(String[] args) {
        System.out.println(CuentaBancaria.getIva());
        Scanner sc = new Scanner(System.in);
        String nombre;
        int queCuenta=0;
        boolean entradaValida = false;
        CuentaBancaria nuevaCuenta;
        //do {
            System.out.println("Bienvenido al banco, que dime tu nombre");
            nombre = sc.nextLine();
            System.out.println("Hola, "+nombre+", que tipo de cuenta quieres crear?");
            while (!entradaValida){
            try {
                System.out.println("1 Cuenta ahorro \n2 Cuenta corriente");
                queCuenta = Integer.parseInt(sc.nextLine());
                if (queCuenta == 1 || queCuenta == 2){
                    entradaValida = true;
                }
                else {
                    System.out.println("Eso no es un numero valido");
                }
            }catch(NumberFormatException e){
                System.out.println("Eso no es un numero");
            }}
        if (queCuenta==1){
            nuevaCuenta = new CuentaAhorro(nombre, 0, ThreadLocalRandom.current().nextInt(1000,9999));
        }
        else {
            nuevaCuenta = new CuentaCorriente(nombre, 0, ThreadLocalRandom.current().nextInt(1000,9999));
        }
    }
}
