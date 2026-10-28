package archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej17LeerEnArchivo {
    public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(new FileReader("src/archivos/ej17xarchivo.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
