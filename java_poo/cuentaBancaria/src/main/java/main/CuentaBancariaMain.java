package main;

import Entidades.CuentaBancaria;
import Serivcio.CuentaBancServicio;
import java.util.Scanner;

public class CuentaBancariaMain {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancServicio cs = new CuentaBancServicio();
        CuentaBancaria c1 = cs.crearCuenta();
        
        int opcion = 0;
        
        cs.Ingresar(c1, 0);
        System.out.println("-----------\t");
        do {
            System.out.println("Ingrese del 1 al 5 " + "\n"
                    + "1 = Ingreso" + "\n"
                    + "2 = Retiro" + "\n"
                    + "3 = Extracc Rapida" + "\n"
                    + "4 = mostrar Saldo" + "\n"
                    + "5 = mostrar Datos" + "\t"
                    + "6 = SALIR");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    cs.Ingresar(c1, opcion);
                    System.out.println("---------\t");
                    break;
                
                case 2:
                    cs.Retirar(c1, opcion, opcion);
                    System.out.println("---------\t");
                    break;
                
                case 3:
                    System.out.println("Extraccion Rapida");
                    cs.ExtraccionRapida(c1, opcion, opcion);
                    System.out.println("----------\t");
                    break;
                
                case 4:
                    cs.mostrarSaldo(c1, opcion);
                    System.out.println("----------\t");
                    break;
                
                case 5:
                    cs.mostrarDatos(c1, opcion, opcion, opcion);
                    System.out.println("----------\t");
                    break;
            }
        } while (opcion != 6);
        System.out.println("OPERACION FINALIZADA");
        
    }
}
