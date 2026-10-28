package ej8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ej8AgendaContactos {
    public static void main(String[] args) {
        HashMap<String, Integer> agenda = new HashMap<>();
        agenda.put("Carlos", 612345678);
        agenda.put("Laura", 655987321);
        agenda.put("Javier", 699123456);

        ArrayList <String> userBuscado = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numPreg;
        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1 → Buscar un contacto por nombre e imprimir su teléfono\n" +
                    "2 → Mostrar todos los contactos\n" +
                    "3 → Ver el historial de búsquedas\n" +
                    "0 → Salir");
            numPreg= Integer.parseInt(sc.nextLine());
            switch (numPreg){
                case 1 :
                    System.out.println("Dime que nombre quieres buscar");
                    String nombreBuscar = sc.nextLine();
                    userBuscado.add(nombreBuscar);
                    if (agenda.containsKey(nombreBuscar)){
                        System.out.println(nombreBuscar+ " numero telefono: "+ agenda.get(nombreBuscar));
                    }
                    else{
                        System.out.println("Contacto no encontrado");
                    }
                    continue;

                case 2:
                    System.out.println(agenda.keySet());
                    continue;

                case 3:
                    System.out.println(userBuscado);
                    continue;

                case 0:
                    System.out.println("Saliendo.....");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        }while (numPreg!=0);
    }
}
