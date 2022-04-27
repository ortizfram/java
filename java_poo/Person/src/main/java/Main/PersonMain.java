package Main;

import Entitys.Person;
import Service.PersonService;

public class PersonMain {

    public static void main(String[] args) {
        PersonService ps = new PersonService();
        Person p1 = ps.makeHuman();
        ps.plus18(p1);
        int c1 = ps.calculateW(p1);
        System.out.println("--------------");
        Person p2 = ps.makeHuman();
        ps.plus18(p2);
        int c2 = ps.calculateW(p2);
        System.out.println("--------------");
        Person p3 = ps.makeHuman();
        ps.plus18(p3);
        int c3 = ps.calculateW(p3);
        System.out.println("--------------");
        Person p4 = ps.makeHuman();
        ps.plus18(p4);
        int c4 = ps.calculateW(p4);
        /**
         * ****************************************************************
         * percent pluss less 18
         */
        int countP = 0;
        int countL = 0;
///P1
        if (p1.getAge() > 18) {//pluss 18
            countP++;
        } else if (p1.getAge() < 18) {//less 18
            countL++;
        }
//p2
        if (p2.getAge() > 18) {
            countP++;
        } else if (p2.getAge() < 18) {
            countL++;
        }
//P3
        if (p3.getAge() > 18) {
            countP++;
        } else if (p3.getAge() < 18) {
            countL++;
        }

        if (p4.getAge() > 18) {
            countP++;
        } else if (p4.getAge() < 18) {
            countL++;
        }
        System.out.println(("Percentage of Plus 18 is " + (countP * 100) / 4) + ("%"));
        System.out.println(("Percentage of Less 18 is " + (countL * 100) / 4) + ("%"));
//****************************************************************************************
        /**
         * percentage of ideal W, over W, low W
         */
//c1,c2,c3,c4 (peopple)
//0,1,-1 (weight)
        int countOver = 99;
        int countLess = 99;
        int countIdeal = 99;
//Count Ideal
        if (c1 == 0) {
            countIdeal++;
        }

        if (c2 == 0) {
            countIdeal++;
        }

        if (c3 == 0) {
            countIdeal++;
        }

        if (c4 == 0) {
            countIdeal++;
        }
//Count Over
        if (c1 == 1) {
            countOver++;
        }
        if (c2 == 1) {
            countOver++;
        }
        if (c3 == 1) {
            countOver++;
        }
        if (c4 == 1) {
            countOver++;
        }
//count Les
        if (c1 == -1) {
            countLess++;
        }
        if (c2 == -1) {
            countLess++;
        }
        if (c3 == -1) {
            countLess++;
        }
        if (c4 == -1) {
            countLess++;
        }
//WEIGHT PERCENTAGE////////////////////////
System.out.println(("IDEAL W peopple : " + (countIdeal * 100) / 4) + ("%"));
System.out.println(("OVER W peopple : " + (countOver * 100) / 4) + ("%"));
System.out.println(("LESS W peopple : " + (countLess * 100) / 4) + ("%"));
    }
}
