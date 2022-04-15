package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {

    public Vendedor altaVendedor() {

        //instanciar obj tipo vendedor
        Vendedor v1 = new Vendedor();
        //leno de atributos
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre de Vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese DNI de vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el Sueldo Basico");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese dia que comenzo a trabajar");
        int dia = leer.nextInt();
        System.out.println("ingrese mes que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("Ingrese anio que comenzo a trabajar ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }

    public void SueldoMensual(Vendedor v1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ventas totales de vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);//el 15%
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());//traeme para calcular
        System.out.println("-------" + "\n"
                + "el sueldo mensual es: $ " + v1.getSueldoMensual());
    }

    public void vacaciones(Vendedor v1) {//calcular antiguedd
        Date hoy = new Date();//dia de la fecha
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5) {
            System.out.println("le corresponden 14 dias de vacaciones");
        } else if (antiguedad < 10) {
            System.out.println("le corresponden 21 dias de vacaciones");
        } else if (antiguedad < 20) {
            System.out.println("le corresponden 28 dias vacaciones");
        } else if (antiguedad > 20) {
            System.out.println("le corresponden 28 dias vacaciones");
        } else {
            System.out.println("emplreado tiene vacaciones proporcionales");
        }
    }
}
