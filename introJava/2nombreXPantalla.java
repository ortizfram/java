package introjava_;

import java.util.Scanner;

/// shit F6 FORZAR INCIO
public class nombreXPantalla {

    public static void main(String[] args) {
        String nombre;

        Scanner Leer = new Scanner(System.in);

        System.out.println("Hola, como se llama?");
        nombre = Leer.next();

        System.out.println("hola, soy" + nombre);
    }
}
