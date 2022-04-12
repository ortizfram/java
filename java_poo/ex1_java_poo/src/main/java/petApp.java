
import entities.Mascota;
import entities.Perro;
import java.util.Scanner;
import petApp_services.service_mascota;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author franco
 */
public class petApp {

    public static void main(String[] args) {
        //we can use objects as a matrix to 
        //follow for new objects

        //every entity must have a service 
        service_mascota sm = new service_mascota();

        Mascota m1 = sm.crearMascota();

        System.out.println(m1.toString());

        m1 = null;  //deletes what its not used anymore
        //trash

        m1.nombre = "pepe chiquito"; 
        
        //metodo setter
        m1.setNombre("pepe");
        
        System.out.println(m1.getNombre);

    }

}
