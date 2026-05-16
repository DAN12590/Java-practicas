public class Ej14zPerroHeredado extends Ej14zAnimalHeredar{
    private String raza;
    public Ej14zPerroHeredado(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void ladrar(){
        System.out.println(getNombre()+ " dice: GUAU!");
    }
}

