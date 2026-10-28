package archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ej17EditarEnArchivo {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/archivos/ej17xarchivo.txt", true))) {
            writer.write("Linea editada");
            writer.newLine();
            writer.write("Hola todos");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }}