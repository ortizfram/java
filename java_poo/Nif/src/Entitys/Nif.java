package Entitys;

public class Nif {

    private int DNI;
    private String letra;

    public Nif() {
    }

    public Nif(int DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Nif{" + "DNI=" + DNI + ", letra='" + letra + '\'' + '}';
    }
}