/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package introjava_;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java18numSeguidoAsteriscos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i = 0;
        int ingreso = 0;
        boolean fin = false;

        while (i != 5) {
            if (ingreso >= 0 && ingreso <= 20) {
                for (i = 1; i <= 5; i++) {
                    System.out.println("Ingrese n enteros para dibujar asteriscos :");
                    ingreso = leer.nextInt();
                    for (i = 1; i <= ingreso; i++) {
                        System.out.print(" * ");
                    }
                }

            } else {
                System.out.println("ERROR: pruebe del 1 al 20");
            }

        }
    }
}
