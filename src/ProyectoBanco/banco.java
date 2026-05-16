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
        int menu = 987;
        do {
            try {
            System.out.println("Que quieres hacer? \n1-Ingresar\n2-Retirar\n3-Ver saldo\n4-Ver historialn\n5-Ver informacion\n7-Salir");
                menu = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("No es un numero");
                continue;}
                switch (menu) {
                    case 1:
                        System.out.println("Cuanto quieres ingresar? ");
                        double dinIngresar = Double.parseDouble(sc.nextLine());
                        nuevaCuenta.ingresarDin(dinIngresar);
                        continue;
                    case 2:
                        System.out.println("Cuanto quieres retirar? ");
                        double dinRetirar = Double.parseDouble(sc.nextLine());
                        nuevaCuenta.retirarDin(dinRetirar);
                        continue;
                    case 3:
                        System.out.println(nuevaCuenta.getSaldo());
                        continue;
                    case 4:
                        System.out.println(nuevaCuenta.historial);
                        continue;
                    case 5:
                        nuevaCuenta.info();
                        continue;
                    case 7:
                        System.out.println("Cerrando");
                        break;
                    case 987:
                        continue;
                    default:
                        System.out.println("No es un numero valido");
                        continue;
                }
            }while (menu!= 7);
        }
        }//while (true);