package ej14;

public class Ej14zGatoHeredado extends Ej14zAnimalHeredar{
    public Ej14zGatoHeredado(String nombre, int edad){
        super(nombre, edad);
    }
    public void maullar(){
        System.out.println(getNombre()+ " dice: MIAU!");
    }
    }

