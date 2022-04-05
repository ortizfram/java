/*
 *ngrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de 
los números introducidos supere el
límite inicial.
 */
package introjava_;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java13ingresarNHastaSuma {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite = 0, n = 0, i;

        System.out.println("numero limite:");
        limite = leer.nextInt();

        if (limite > 0) {
            for (i = 1; i <= limite; i++) {
                System.out.println("ingrese n hasta llegar al limite:");
                n = leer.nextInt();
                i += n;

            }
            System.out.println("ha llegado al limite");
        } else {
            System.out.println("LA SUMA SOBREPASO EL LIMITE");

        }

    }

}
