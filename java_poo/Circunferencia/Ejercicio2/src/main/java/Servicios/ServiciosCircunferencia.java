/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author melon
 */
public class ServiciosCircunferencia {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {

        Circunferencia c = new Circunferencia();
        System.out.println("ingrese radio :");
        c.setRadio(leer.nextFloat());

        return c;
    }

    public String area(Circunferencia c, float radio) {
        radio = c.getRadio();
        float area = (float) (3.14 * radio * radio);

        return "el area es: "+ area;
    }

    public String perimetro(Circunferencia c, float radio) {
        float radio2 = c.getRadio();
        float perimetro = (float) (2 * 3.14 * radio2);

        return ""+perimetro;
    }

    public String area(float radio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
