package ProyectoBanco;

import java.util.Scanner;

public class CuentaCorriente extends CuentaBancaria {
    double limiteNeg = -500;
    public CuentaCorriente(String titular, double saldo, int numCuenta) {
        super(titular, saldo, numCuenta);
    }

    @Override
    public void retirarDin(double cantidad) {
        if (cantidad >= 0) {
            if (getSaldo()-cantidad >= limiteNeg){

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
}

