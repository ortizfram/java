/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petApp_services;

import entities.Mascota;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class service_mascota {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //.useDelimiter("\n");  para espacios en String sin que tire error 
//SERVICES : to create logic 
    public Mascota crearMascota() {

        System.out.println("introducir nombre");
        String nombre = leer.next();

        System.out.println("introducir apodo");
        String apodo = leer.next();

        System.out.println("introducir tipo");
        String tipo = leer.next();

        return new Mascota(nombre, apodo, tipo);

    }
}
