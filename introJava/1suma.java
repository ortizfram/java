package introjava_;
import java.lang.*; //llamar a todas libreria lang
import java.io.*;  //io entrada y salida de usao de datos
import java.util.*;
////ALT + SHIFT + F => identar
public class suma {

    public static void main(String[] args) {
        double n1,n2,resultado;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println ("ingrese num 1");
        n1 = Teclado.nextDouble();
        
        System.out.println ("ingrese num 2");
        n2 = Teclado.nextDouble();
        
        resultado = n1 + n2;
         System.out.println ("resultado es : "+ resultado);
    }
    
}
