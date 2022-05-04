package Main;

import Entitys.Raices;
import Services.RaicesServices;

import java.util.Scanner;

public class RaicesMain {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        RaicesServices rs = new RaicesServices();
        Raices r = rs.makeRaiz();

        System.out.println("" + "1.Calcular Discriminante" + "\n" + "2.Verificar si tiene raices" + "\n" + " 3.Verificar si tiene raiz" + "\n" + "4.Obtiene raices" + "\n" + "5.Obtener raiz" + "\n" + "6.Calcular" + "\n" + "7.Salir");

        int opcion;

        do {

            System.out.println("Ingrese una opción");

            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    rs.getDiscriminante(r);
                case 2:
                    rs.tieneRaices(r);
                case 3:
                    rs.tieneRaiz(r);
                case 4:
                    rs.obtenerRaices(r);
                case 5:
                    rs.obtenerRaiz(r);
                case 6:
                    rs.calcular(r);
                case 7:
                    System.out.println("Usted salió");
                default:
                    System.out.println("La opcion ingresada no es valida");
            }

        } while (opcion != 7);

    }
}
