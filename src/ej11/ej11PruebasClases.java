package ej11;

public class ej11PruebasClases {
    public static void main(String[] args) {
        Ej11zPerro miPerro = new Ej11zPerro("Rex", 3, "Labrador");
        miPerro.ladrar();  // Rex dice: Guau!
        miPerro.info();    // Nombre: Rex, Edad: 3, Raza: Labrador

        Ej11zPerro otroPerro = new Ej11zPerro("Toby", 5, "Bulldog");
        otroPerro.ladrar(); // Toby dice: Guau!
    }
}
