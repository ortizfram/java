/*
lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package introjava_;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java14suma20nHasta0yNoNegaivos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, n = 0;
        double sumar = 0;

        System.out.println("ingrese 20 N \n"
                + " el 0 corta la secuencia \n"
                + " N negativo no se sumara "
                + " :...");

        for (i = 0; i <= 3; i++) {
            n = leer.nextInt();
            if (n >= 0) {
                sumar += n;
            }
            
            if (n == 0) {
                System.out.println("secuencia terminada con '0': ");
                break;

            }
            System.out.println("la suma es : " + sumar);

        }

    }

}
