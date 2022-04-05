
package introjava_;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java7parImpar {


    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int numero ;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un n entero");
        numero = leer.nextInt();

       
        if (esPar(numero)) {
            System.out.println("Sí es par");
        } else {
            System.out.println("No es par");
        }
    }

}
    
    

