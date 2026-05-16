import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej18Escribir {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/ej18prueba.txt"))){
            writer.write("hola todos");
            writer.newLine();
            writer.write(4545);
        } catch (IOException e) {
            System.out.println("No se pudo abrir el archvio");
        }
    }
}
