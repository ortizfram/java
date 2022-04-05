/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 */
package introjava_;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Ejercicio22Contabilizar {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int cantidad = 0;

        System.out.println("Ingrese el tamaño del vector");

        int n = leer.nextInt();

        int[] vector = new int[n];

        System.out.println("Ingrese numeros de 1 a 5 digitos");

        for (int i = 0; i < n; i++) { ///Podemos utilizar la funcion Math.ramdom()

            vector[i] = leer.nextInt();

        }

        for (int i = 0; i < n; i++) {

            System.out.print("El numero " + vector[i]);

            cantidad = 0;

            do {

                vector[i] = vector[i] / 10; ///cuenta decimales mientras sean mayor a 0
                //y los suma a cantidad
                cantidad++;

            } while (vector[i] > 0);

            System.out.println(" tiene " + cantidad + " digitos");
        }

    }
}
