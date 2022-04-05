/*
 * estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package introjava_;

import java.util.Scanner;

public class java19conversorMoneda {

    static void libras(int euro) {
        double libras = (euro * 0.86);
        System.out.println(euro + "euros a libras : " + libras);
    }

    static void dolares(int euro) {
        double dolares = (euro * 1.28611);
        System.out.println(euro + "euros a dolares : " + dolares);
    }

    static void yenes(int euro) {
        double yenes = (euro * 129.852);
        System.out.println(euro + "euros a yenes : " + yenes);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int euro = 0;
        System.out.println("ingrese cantidad de euros a convertir :");
        euro = leer.nextInt();

        System.out.println("el cambio de divisas es :");
        libras(euro);
        dolares(euro);
        yenes(euro);

    }
}
