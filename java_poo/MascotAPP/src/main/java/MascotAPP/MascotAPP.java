package MascotAPP;

import Entidades.Mascota;
import Servicios.ServicioMascota;
import java.util.Scanner;

public class MascotAPP {

    public static void main(String[] args) {

        ServicioMascota sm = new ServicioMascota();

        Mascota m1 = sm.crearMascota();

        System.out.println(m1);

        m1 = null; //garbige collector

    }

}
