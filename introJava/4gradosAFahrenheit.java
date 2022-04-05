package introjava_;

import java.util.Scanner;

/*Dada una cantidad de grados centígrados 
se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente
es: F = 32 + (9 * C / 5).
 */
public class gradosAFahrenheit {

    public static void main(String[] args) {

        int grados, fa, conver;

        Scanner Leer = new Scanner(System.in);

        System.out.println("ingrese GRADOS:");
        grados = Leer.nextInt();

        conver = (grados * 9 / 5) + 32;
        fa = conver;

        System.out.println(grados + " grados son " + fa + " Fahrenheit");
    }

}
