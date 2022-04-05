package introjava_;

import java.util.Scanner;

/*ea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de 
ese número. Nota: investigar la función
Math.sqrt().
 */
public class e5dobleTripleRaiz {

    public static void main(String[] args) {
        int n, doble, triple, raiz;

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un n entero");
        n = leer.nextInt();
        
        pasarDobleTripleRaiz(n);
        
    }

    public static void pasarDobleTripleRaiz(int n) {
        int doble = n * 2;
        int triple = n * 3;
        double raiz = Math.sqrt(n);
        
        System.out.println("doble "+doble+" triple "+triple+" raiz "+raiz);
         
    }
}
