/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio2;

import Entidades.Circunferencia;
import Servicios.ServiciosCircunferencia;

/**
 *
 * @author melon
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        ServiciosCircunferencia serv = new ServiciosCircunferencia();
        Circunferencia circ = serv.crearCircunferencia();
        
  
        System.out.println("El area es: " + serv.area(circ.getRadio()));

        System.out.println("El perimtro es: "+ serv.perimetro(circ.getRadio()));

    }
}
