package Service;

import Entitys.Person;
import java.util.Scanner;

public class PersonService {

    Scanner read = new Scanner(System.in);

    public Person makeHuman() {
        Person pers = new Person();
        System.out.println("Insert Person name  :");
        pers.setName(read.next());
        /**
         * if not F or M ask again
         */

        System.out.println("Insert Person Sex (f/m/o):");
        pers.setSex(read.next());

        while (pers.getSex() == "f" || pers.getSex() == "m" || pers.getSex() == "o") {
            System.out.println("try with (f/m/o)");
            pers.setSex(read.next());

        }

//
        System.out.println("Insert Age :");
        pers.setAge(read.nextInt());
        System.out.println("Insert weight :");
        pers.setWeight(read.nextFloat());
        System.out.println("Insert Height");
        pers.setHeight(read.nextFloat());
        return pers;
    }//End make human method
//*************************************************************************

    public int calculateW(Person pers) {
        double wh = pers.getWeight();
        double ht = pers.getHeight();
        double MC = wh / (Math.pow(ht, 2));
        int value = 9999;

        if (MC > 25) {//over
            value = 1;
        }
        if (MC >= 20 && MC <= 25) {//ideal
            value = 0;
        }
        if (MC < 20) {
            value = (-1); //lowwer
        }

        System.out.println(value);
        return value;

    }

    //*****************************************************************88888
    public boolean plus18(Person pers) {
        boolean bool;
        if (pers.getAge() > 18) {
            bool = true;
        } else {
            bool = false;
        }
        System.out.println("is plus 18 ? " + bool);
        return bool;
    }

}
