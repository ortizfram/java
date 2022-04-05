/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package introjava_;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java12nota0y10sinoPedir {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int nota = 0;
        
        do{
            System.out.println("ingrese nota");
            nota = leer.nextInt();
            
        }while ( nota <=0 || nota>= 10 );
      
    
    }
}
