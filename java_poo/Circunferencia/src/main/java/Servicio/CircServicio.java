package Servicio;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CircServicio {

    public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        //instanciar
        Circunferencia c1 = new Circunferencia();
        //llenar
        System.out.println("Ingrese radio");
        c1.setRadio(leer.nextDouble());

        return c1;
    }

    public void area(Circunferencia c1) {
        Scanner leer = new Scanner(System.in);
        //calcular area de circunferencia
        c1.setArea(3.14 * c1.getRadio() * c1.getRadio());
        System.out.println("el Area de Circunferencia es : " + c1.getArea());
    }

    public void perimetro(Circunferencia c1) {
        c1.setPerimetro(2 * 3.14 * c1.getRadio());
        System.out.println("el Perimetro de la Circunferencia es : " + c1.getPerimetro());

    }
}
