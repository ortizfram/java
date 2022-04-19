package Entidades;

public class CuentaBancaria {

    int DNI;
    float salgoActual;
    int numeroCuenta;
    float interes;
    float ingreso;
    float egreso;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int DNI, float salgoActual, int numeroCuenta, float interes) {
        this.DNI = DNI;
        this.salgoActual = salgoActual;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;

    }

    public CuentaBancaria(float ingreso) {
        this.ingreso = ingreso;
    }

    public float getIngreso() {
        return ingreso;
    }

    public void setIngreso(float ingreso) {
        this.ingreso = ingreso;
    }

    public float getEgreso() {
        return egreso;
    }

    public void setEgreso(float egreso) {
        this.egreso = egreso;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public float getSalgoActual() {
        return salgoActual;
    }

    public void setSalgoActual(float salgoActual) {
        this.salgoActual = salgoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "DNI=" + DNI + ", salgoActual=" + salgoActual + ", numeroCuenta=" + numeroCuenta + ", interes=" + interes + ", ingreso=" + ingreso + ", egreso=" + egreso + '}';
    }

}
