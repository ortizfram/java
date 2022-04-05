package introjava_;

import java.util.Scanner;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java
*/
public class cammelLower {
    
    public static void main(String[] args){
        String palabra,pMayus,pMinus;
        
        Scanner Leer = new Scanner (System.in);
        
        System.out.println ("escriba una frase");
        palabra = Leer.next();
        
        pMayus = palabra.toUpperCase();
        pMinus = palabra.toLowerCase();
        
        System.out.println ("Cammel <- "+pMayus)
        System.out.println ("Cammel <- "+pMinus)
    }   
}


