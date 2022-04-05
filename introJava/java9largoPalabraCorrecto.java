
package introjava_;

import java.util.Scanner;

/**

 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
public class java9largoPalabraCorrecto {
    
    static void validarLargo(String frase,int cont) {
      cont = frase.length();
      if (cont <= 8){ 
          System.out.println("CORRECTO "+" ( "+frase.length()+ " )");
      }else{
          System.out.println("INCORRECTO "+" ( "+frase.length()+ " )");
      }
        
}
    
    public  static void main(String [] args) {
         Scanner leer = new Scanner(System.in);
         String frase ;
         
         System.out.println("ingrese frase para validar su largo");
         frase = leer.next();
        int cont = 0;
         
         validarLargo(frase, cont);
    }
    
}
