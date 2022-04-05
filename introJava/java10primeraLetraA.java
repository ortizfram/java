
package introjava_;

import java.util.Scanner;

/**
pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class java10primeraLetraA {
    
  static void primeraLetra(String frase,String letraInicio){
      letraInicio = frase.substring(0);
      if (letraInicio.equals("a")){
          System.out.println("CORRECTO la frase empieza con 'a'");
      }
  }
    public static void main(String [] args) {
    Scanner leer = new Scanner(System.in);
    
    String frase;
    String letraInicio = " ";
    
        System.out.println("ingrese frase para validar primera letra=...");
        frase = leer.next();
        
        primeraLetra(frase,letraInicio);
  
    }
}
