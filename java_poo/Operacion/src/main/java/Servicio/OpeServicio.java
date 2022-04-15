package Servicio;

import Entidadades.Operacion;
import java.util.Scanner;

public class OpeServicio {

    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in);
        Operacion o1 = new Operacion();
        System.out.println("Ingrese el 1er num : ");
        o1.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo num :");
        o1.setNumero2(leer.nextInt());
        System.out.println("-------------------");

        return o1;
    }

    public void sumar(Operacion o1) {
        o1.setSumar(o1.getNumero1() + o1.getNumero2());
        System.out.println("suma = " + o1.getSumar());
    }

    public void restar(Operacion o1) {
        o1.setRestar(o1.getNumero1() - o1.getNumero2());
        System.out.println("resta = " + o1.getRestar());
    }

    public void multiplicar(Operacion o1) {
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0) {
            System.out.println("ERROR <- multiplicar = " + o1.getMultiplicar());
        } else {
            o1.setMultiplicar(o1.getNumero1() * o1.getNumero2());
            System.out.println("multiplicar = " + o1.getMultiplicar());
        }

    }

    public void dividir(Operacion o1) {
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0) {
            System.out.println("ERROR <- dividir = " + o1.getDividir());
        } else {
            o1.setDividir(o1.getNumero1() / o1.getNumero2());
            System.out.println("dividir = " + o1.getDividir());
        }

    }

}
