package ej15;

public class Ej15zVehiculo{
    String marca;
    int velocidadMax;

    public Ej15zVehiculo(String marca, int velocidadMax) {
        this.marca = marca;
        this.velocidadMax = velocidadMax;

    }
    public String getMarca() {
        return marca;
    }
    public int getVelocidadMax() {
        return velocidadMax;
    }
    public void info(){
        System.out.printf("Marca: %s  Velocidad maxima: %s", getMarca(),getVelocidadMax());
    }
}
