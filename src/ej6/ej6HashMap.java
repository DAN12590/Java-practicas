package ej6;

import java.util.HashMap;
import java.util.Scanner;

public class ej6HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> agenda = new HashMap<>(); //El primero es String, el segundo INT

// Añadir
        agenda.put("Ana", 612345678);   // put = meter
        agenda.put("Pedro", 698765432);
        agenda.put("Juan", 55555555);
        agenda.put("Manuel", 3333333);

// Leer
        agenda.get("Ana");  // devuelve 612345678, por si solo no hace nada
        System.out.println(agenda.get("Ana"));

// Comprobar si existe
        agenda.containsKey("Luis");  // false, no está, por si solo no hace nada
        System.out.println(agenda.containsKey("Luis"));
        System.out.println(agenda.containsKey("Ana"));

// Eliminar
        agenda.remove("Ana");

// Tamaño
        agenda.size();  // cuántos contactos hay, por si solo no hace nada
        System.out.println(agenda.size());



// Recorrer
        for (String nombres : agenda.keySet()){
        System.out.println(nombres + " y su numero es: " + agenda.get(nombres));
    }}
}
