package Serivicio;

import Entidates.Rectangulo;
import java.util.Scanner;

public class RectanguloServ {

    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese Base del rectangulo");
        r1.setBase(leer.nextFloat());
        System.out.println("Ingrese Altura del rectangulo");
        r1.setAltura(leer.nextFloat());

        return r1;
    }

    public void Perimetro(Rectangulo r1, float base, float altura) {
        float perimetro = ((r1.getBase() + r1.getAltura()) * 2);
        r1.setPerimetro(perimetro);
        System.out.println("Perimetro = " + r1.getPerimetro());
    }

    public void Superficie(Rectangulo r1, float base, float altura) {
        float superficie = (r1.getBase() * r1.getAltura());
        r1.setSuperficie(superficie);
        System.out.println("Superficie = " + r1.getSuperficie());
    }

    public void dibujar(Rectangulo r1, int base, int altura) {
        System.out.println("--------------" + "\t");
        base = (int) r1.getBase();
        altura = (int) r1.getAltura();
        for (int i = 0; i <= base ; i++) {//top
            for (int j = 0; j <= altura ; j++) {
                if (i == 0 || j == 0 || i == base || j == altura) {
                    System.out.print("* ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
