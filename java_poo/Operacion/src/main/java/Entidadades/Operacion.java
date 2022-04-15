package Entidadades;

public class Operacion {

    private int numero1;
    private int numero2;
    private double sumar;
    private double restar;
    private double multiplicar;
    private double dividir;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2, double sumar, double restar, double multiplicar, double dividir) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.sumar = sumar;
        this.restar = restar;
        this.multiplicar = multiplicar;
        this.dividir = dividir;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public double getSumar() {
        return sumar;
    }

    public void setSumar(double sumar) {
        this.sumar = sumar;
    }

    public double getRestar() {
        return restar;
    }

    public void setRestar(double restar) {
        this.restar = restar;
    }

    public double getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(double multiplicar) {
        this.multiplicar = multiplicar;
    }

    public double getDividir() {
        return dividir;
    }

    public void setDividir(double dividir) {
        this.dividir = dividir;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", sumar=" + sumar + ", restar=" + restar + ", multiplicar=" + multiplicar + ", dividir=" + dividir + '}';
    }

}
