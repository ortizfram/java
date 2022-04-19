package Serivcio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancServicio {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        Scanner leer = new Scanner(System.in);
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("Ingrese DNI de cuenta :");
        c1.setDNI(leer.nextInt());
        System.out.println(" Ingrese Numero de Cuenta:");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese Saldo : ");
        c1.setSalgoActual(leer.nextFloat());
        return c1;
    }

    public void Ingresar(CuentaBancaria c1, float salgoActual) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Monto a INGRESAR $$$");
        c1.setIngreso(leer.nextFloat());
        c1.setIngreso(c1.getSalgoActual() + c1.getIngreso());
        System.out.println("Saldo de : " + c1.getIngreso());
    }

    public void Retirar(CuentaBancaria c1, float salgoActual) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Monto a RETIRAR -$$$");
        c1.setEgreso(leer.nextFloat());
        if (c1.getSalgoActual() > 0) {
            c1.setEgreso(c1.getSalgoActual() - c1.getEgreso());
            System.out.println("Saldo de : " + c1.getEgreso());
        } else {
            System.out.println("Saldo = 0");
        }
    }

    /**
     *
     * permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque
     * más del 20%.
     */
    public void ExtraccionRapida(CuentaBancaria c1, float salgoActual) {
        /**
         * porcentaje : egreso * 100 / saldoActual;
         */
        System.out.println("Monto a retirar : ");
        c1.setEgreso(leer.nextFloat());
        c1.setInteres((c1.getEgreso() * 100) / c1.getSalgoActual());
        if (c1.getEgreso() <= 20) {
            System.out.println("***egreso menor al 20%, no es posible" + "\n"
                    + "realizar la extraccion");
        } else {
            System.out.println("Interes de Extraccion R: " + c1.getInteres());
            if (c1.getSalgoActual() > 0) {
                c1.setEgreso(c1.getSalgoActual() - c1.getEgreso());
                System.out.println("Saldo de : " + c1.getEgreso());
            } else {
                System.out.println("Saldo = 0");
            }
        }
    }

    public void mostrarSaldo(CuentaBancaria c1, float salgoActual) {
        System.out.println("Su saldo es de : " + c1.getEgreso());
    }

    public void mostrarDatos(CuentaBancaria c1, int DNI, int numeroCuenta, float salgoActual) {
        System.out.println("DNI : " + c1.getDNI());
        System.out.println("numero Cuenta : " + c1.getNumeroCuenta());
        System.out.println("Saldo : " + c1.getEgreso());
    }

}
