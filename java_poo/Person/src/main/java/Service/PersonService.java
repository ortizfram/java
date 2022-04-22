package Service;

import Entitys.Person;
import java.util.Scanner;

public class PersonService {

    Scanner read = new Scanner(System.in);

    public Person makeHuman() {
        Person p1 = new Person();
        System.out.println("Insert Person name  :");
        p1.setName(read.next());
        /**
         * if not F or M ask again
         */

        System.out.println("Insert Person Sex (f/m/o):");
        p1.setSex(read.next());

        while (p1.getSex() == "f" || p1.getSex() == "m" || p1.getSex() == "o") {
            System.out.println("try with (f/m/o)");
            p1.setSex(read.next());
        }
//
        System.out.println("Insert Age :");
        p1.setAge(read.nextInt());
        System.out.println("Insert weight :");
        p1.setWeight(read.nextFloat());
        System.out.println("Insert Height");
        p1.setHeight(read.nextFloat());
        return p1;
    }//End make human method

    public int idealWeight(Person p1, float weight, float height) {
//       (weight in kg/(height^2 in mt2))
//------------------------------------------------------------
//         * if result > 20 = lowwer ideal weight, function equals -1
//         * if result >= 20 || result <= 25 = is in ideal weight , function gives 0
//         *if result > 25 = overweight , function gives 1
        int idealW = (int) (p1.getWeight() / (p1.getHeight() * p1.getHeight()));

        if (idealW > 20) {
            System.out.println("ideal weight");
            return -1;
        } else if (idealW >= 25) {
            System.out.println("overweight");
            return 0;
        } else if (idealW > 25) {
            System.out.println("lowwer than ideal");
            return 1;
        }
    }

    public void over18(Person p1, int age) {
        boolean over18 = false;
        if (p1.getAge() > 18) {
            over18 = true;
            System.out.println("Is Over 18 ? " + over18);
        } else {
            System.out.println("Is Over 18 ? " + over18);
        }
    }
}
