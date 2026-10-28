package ej12_clasesCoche;

public class Ej12zCoche2 {
    private String marca;
    String modelo;
    int velocidad;

    Ej12zCoche2(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    int acelerar(int cantidad){
        velocidad += cantidad;
        return velocidad;
        }

    int frenar(int cantidad){
        velocidad -= cantidad;
        if (velocidad < 0) velocidad = 0;
        return velocidad;
    }
    void info(){
        System.out.printf("Marca: %s , Modelo:%s , Velocidad: %d km/h\n", marca, modelo, velocidad);

    }
}


