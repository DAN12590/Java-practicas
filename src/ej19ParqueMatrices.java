import java.util.InputMismatchException;
import java.util.Scanner;

public class ej19ParqueMatrices {
    public static void main(String[] args){
         int ranLin;
        int ranCol;
        int cont;
        Scanner sc = new Scanner(System.in);

        int contR; int contB; int contA;
        contA = 0; contR = 0; contB= 0;
        String [][] mapa = new String[10][10];
        for (int i = 0; i< 10; i++){
            for (int f = 0; f<10; f++){
                mapa[i][f] = ". ";
            }
        }
        for (int i= 0; i<10; i++)
            do {
                ranLin = (int)(Math.random()*10);
                ranCol = (int)(Math.random()*10);
                cont = 0;
                if (mapa[ranLin][ranCol] == ". "){
                    cont = 1;
                    mapa[ranLin][ranCol] = "A ";
                }
            }while (cont != 1);

        for (int i= 0; i<5; i++)
            do {
                ranLin = (int)(Math.random()*10);
                ranCol = (int)(Math.random()*10);
                cont = 0;
                if (mapa[ranLin][ranCol] == ". "){
                    cont = 1;
                    mapa[ranLin][ranCol] = "R ";
                }
            }while (cont != 1);

        for (int i= 0; i<3; i++)
            do {
                ranLin = (int)(Math.random()*10);
                ranCol = (int)(Math.random()*10);
                cont = 0;
                if (mapa[ranLin][ranCol] == ". "){
                    cont = 1;
                    mapa[ranLin][ranCol] = "B ";
                }
            }while (cont != 1);


        for (int i = 0; i< 10; i++){
            for (int f = 0; f<10; f++){
                System.out.print(mapa[i][f]);
            }
            System.out.println("");
        }

        for (int i = 0; i< 10; i++){
            for (int f = 0; f<10; f++){
                if (mapa[i][f].equals("A ")){
                contA += 1;
                } else if (mapa[i][f].equals("B ")){
                    contB += 1;
                } else if (mapa[i][f].equals("R ")){
                contR += 1;
            }
            }
        }
        System.out.println(contA+ " Cantidad de As");
        System.out.println(contR+" Cantidad de Rs");
        System.out.println(contB+" Cantidad de Bs");

        int cord1= 0;
        int cord2= 0;

        boolean valido = false;
        while (!valido){
            try {
                System.out.println("Introduce la coordenada Y que quieras analizar: ");
                cord1 = sc.nextInt()-1;
                if (cord1 > 9 || cord1 < 0){
                    System.out.println("Introduce un numero valido del 1 al 10 ");
                }else{
                    valido= true;
                }
            } catch (InputMismatchException e){
            System.out.println("Pon un numero");
            sc.nextLine();
            }
        }
        valido = false;
        while (!valido){
            try {
                System.out.println("Introduce la coordenada X que quieras analizar: ");
                cord2 = sc.nextInt()-1;
                if (cord2 > 9 || cord2 < 0){
                    System.out.println("Introduce un numero valido del 1 al 10 ");
                }else{
                    valido= true;
                }
            } catch (InputMismatchException e){
                System.out.println("Pon un numero");
                sc.nextLine();
            }
        }

        System.out.println(mapa[cord1][cord2]);
    }
}
