import java.util.Scanner;

public class ej2IfsYComparaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cual es tu nombre?: ");
        String nombre = sc.nextLine();
        System.out.print("Cual es tu edad?: ");
        String VIP = "Pablo";
        int edad = sc.nextInt();

        if(nombre.equals(VIP)){
            System.out.println("Entrada VIP, buenos dias "+ VIP);;
        }
        else if (edad >= 18){
            System.out.println("Bienvenido," +nombre+", eres mayor de edad");
        }
        else{
            System.out.println("Bienvenido," +nombre+", eres menor de edad");
        }
    }
}
