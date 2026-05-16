import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej18Leer {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/ej18prueba.txt"))){
            String lectura;
            int num=0;
            for (String frases: reader.readAllLines()){
                num +=1;
                System.out.println(frases+" " +num);
            }
        }catch (IOException e){
            System.out.println("Error al abrir archivo");
        }
    }
}
