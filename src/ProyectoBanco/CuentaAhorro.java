package ProyectoBanco;

import java.util.Scanner;

public class CuentaAhorro extends CuentaBancaria{
    double interesAnual = 0.02;
    public CuentaAhorro(String titular, double saldo, int numCuenta) {
        super(titular, saldo, numCuenta);
    }
    public void aplicarInteres(){
        setSaldo(getSaldo()+(getSaldo()*interesAnual));
        System.out.println("Intereses añadidos");

    }
}
