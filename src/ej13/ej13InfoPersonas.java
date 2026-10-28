package ej13;

public class ej13InfoPersonas {
    public static void main(String[] args) {
        Ej13zInfoPersonas persona = new Ej13zInfoPersonas("Pedro", 54, "Hola@gmail.com");
        Ej13zInfoPersonas persona2 = new Ej13zInfoPersonas("Ana", 22, "ana@gmail.com");
        persona.presentarse();
        persona2.presentarse();
    }
}
