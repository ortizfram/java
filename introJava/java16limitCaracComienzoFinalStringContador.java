/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava_;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java16limitCaracComienzoFinalStringContador {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int countMal = 0;
        int count = 0;
        String cadena = " ";
        int largoCadena = cadena.length();

        while (!cadena.equals("&&&&&")) {
            //pedir dato
            System.out.println("ingrese cadenas");
            cadena = leer.next();
            if (!cadena.equals("&&&&&")) {
                if (largoCadena == 5 && cadena.substring(0, 1).toUpperCase().equals('x') && cadena.substring(4, 5).toUpperCase().equals('o')) {
                    System.out.println("correcto");
                    count++;
                } else {
                    System.out.println("incorrecto");
                    countMal++;
                }

            }
        }
    }
}
