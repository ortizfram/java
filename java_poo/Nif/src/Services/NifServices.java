package Services;

import Entitys.Nif;

import java.util.Scanner;

public class NifServices {
    Scanner read = new Scanner(System.in);

    public Nif askDni() {
        Nif p1 = new Nif();

        System.out.println("Insert your DNI");
        p1.setDNI(read.nextInt());

        int NIF = (int) (p1.getDNI() % 23);

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        p1.setLetra(letras[NIF]);
        return p1;
    }

    public void showNif(Nif p1){
        System.out.println(p1.getDNI() + "-" + p1.getLetra());

    }

}
