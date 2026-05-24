package ProyectoBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double  saldo;
    private int numCuenta;
    static private int iva=21;
    public ArrayList<String> historial;

    public CuentaBancaria(String titular, double saldo, int numCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
        this.historial = new ArrayList<>();
    }
    public void ingresarDin(double cantidad){
        if (cantidad >= 0) {
            saldo += cantidad;
            historial.add("Ingreso: +"+cantidad+" || Saldo actual: "+getSaldo()+"\n");
        }
        else {
            System.out.println("No puedes ingresar dinero negativo");
        }
        }
    public void retirarDin(double cantidad){
        if (cantidad >= 0) {
            if (getSaldo()-cantidad >= 0){

            setSaldo(getSaldo()-cantidad);
            historial.add("Retirada: -"+cantidad+" || Saldo actual: "+getSaldo()+"\n");
            }
            else {
                System.out.println("No tienes suficiente dinero para retirar");
            }
        }
        else {
            System.out.println("No puedes retirar dinero negativo");
        }
    }

    public static int getIva() {
        return iva;
    }

    public String getTitular() {
        return titular;}

    public void setTitular(String titular) {
        this.titular = titular;}

    public double getSaldo() {
        return saldo;}

    public void setSaldo(double saldo) {
        this.saldo = saldo;}

    public int getNumCuenta() {
        return numCuenta;}

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;}

    public void info(){
        System.out.println(getTitular());
        System.out.println(getSaldo());
        System.out.println(getNumCuenta());
    }

}

