package Services;

import Entitys.Raices;

import java.util.Scanner;

public class RaicesServices {
    Scanner r = new Scanner(System.in);

    public Raices makeRaiz() {
        Raices ra = new Raices();
        System.out.println("Insert a ");
        ra.setA(r.nextDouble());
        System.out.println("insert b");
        ra.setB(r.nextDouble());
        System.out.println("insert c");
        ra.setC(r.nextDouble());

        return null;
    }

    public double getDiscriminante(Raices ra) {
        System.out.println("\n");
        double b = ra.getB();
        double a = ra.getA();
        double c = ra.getC();
        double disc = (b * b) - 4 * a * c;
        System.out.println("Get discriminante = ↓");
        return disc;
    }

    public boolean tieneRaices(Raices ra) {
        if (getDiscriminante(ra) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(Raices ra) {
        System.out.println("\n");
        System.out.println("Tiene raices? = ↓ ");
        if (getDiscriminante(ra) == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void obtenerRaices(Raices ra) {
        double b = ra.getB();
        double a = ra.getA();
        double c = ra.getC();

        if (tieneRaices(ra)) {
            double raiz1 = (-b + Math.sqrt(Math.pow(b, 2) ) - 4 * a * c / (2 * a));
            double raiz2 = (-b - Math.sqrt(Math.pow(b, 2) ) - 4 * a * c / (2 * a));
            System.out.println(raiz1);
            System.out.println(raiz2);
        } else {
            System.out.println("NO TIENE DOS RAICES");
        }
    }

    public void obtenerRaiz(Raices ra) {
        double b = ra.getB();
        double a = ra.getA();
        double c = ra.getC();
        if (tieneRaices(ra)) {
            double raiz = -b / (2 * a);
            System.out.println(raiz);
        } else {
            System.out.println("no tiene una sola raiz");
        }
    }

    public void calcular(Raices ra) {
        if (tieneRaices(ra)) {
            obtenerRaices(ra);
        }else if (tieneRaiz(ra)){
            obtenerRaiz(ra);
        }else{
            System.out.println("no tiene ninguna raiz");
        }
    }
}
