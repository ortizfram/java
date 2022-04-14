package Servicios;

import Entidades.Mascota;
import java.util.Scanner;

public class ServicioMascota {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {

        System.out.println("introducir nommbre");
        String nombre = leer.next();

        System.out.println("Ingrese apodo");
        String apodo = leer.next();

        System.out.println("Ingrese tipo");
        String tipo = leer.next();


        return  new Mascota(nombre,  apodo,  tipo); 

    }
}
