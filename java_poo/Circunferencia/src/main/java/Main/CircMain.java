package Main;

import Entidades.Circunferencia;
import Servicio.CircServicio;

public class CircMain {

    public static void main(String[] args) {
        CircServicio cs = new CircServicio();
        Circunferencia c1 = cs.crearCircunferencia();

        cs.area(c1);
        cs.perimetro(c1);
        System.out.println(c1);

    }
}
