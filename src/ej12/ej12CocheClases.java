package ej12;

public class ej12CocheClases {
    public static void main(String[] args) {
        Ej12zCoche Coche = new Ej12zCoche("audi", "1555", 0);
        System.out.println(Coche.velocidad);
        Coche.acelerar(33);
        System.out.println(Coche.velocidad);
        //System.out.println(Coche.modelo+" "+ Coche.marca);

        Coche.info();

    }
}
