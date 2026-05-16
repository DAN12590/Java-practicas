public class Ej14zAnimalHeredar {
    private String nombre;
    private int edad;

    public Ej14zAnimalHeredar(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo");
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
}