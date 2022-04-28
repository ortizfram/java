
package Entitys;

public class Mathh {
    double n1;
    double n2;

    public Mathh() {
    }

    public Mathh(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Mathh{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }
    
    
}
