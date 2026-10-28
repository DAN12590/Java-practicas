package clases;

public class Ej11zPerro {
    // atributos (las características)
    String nombre;
    int edad;
    String raza;

    // constructor (se ejecuta al crear el objeto)
    Ej11zPerro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    // métodos (las acciones)
    void ladrar() {
        System.out.println(nombre + " dice: Guau!");
    }

    void info() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Raza: " + raza);
    }
}
