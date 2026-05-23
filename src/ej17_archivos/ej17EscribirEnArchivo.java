package ej17_archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ej17EscribirEnArchivo {
    public static void main(String[] args){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/ej17_archivos/ej17xarchivo.txt"))) {
            writer.write("Hola mundo");
            writer.newLine();
            writer.write("Segunda línea");
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

    }
}
