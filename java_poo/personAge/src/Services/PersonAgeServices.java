package Services;

import Entitys.PersonAge;

import java.util.Date;
import java.util.Scanner;

public class PersonAgeServices {
    Scanner read = new Scanner(System.in);

    public PersonAge createPerson() {
        int day2;
        int month2;
        int year2;
        PersonAge p = new PersonAge();
        System.out.println("Insert NAME");
        p.setName(read.next());
        System.out.println("insert Birth Day*************");
        System.out.println("insert Day");
        p.setDay(read.nextInt());
        System.out.println("Insert month");
        p.setMonth(read.nextInt());
        System.out.println("Insert Year");
        p.setYear(read.nextInt());
        System.out.println("INSERT ACTUAL DATE**********");
        System.out.println("insert Day");
        day2 = read.nextInt();
        System.out.println("Insert month");
        month2 = read.nextInt();
        System.out.println("Insert Year");
        year2 = read.nextInt();

        Date aDate = new Date(p.getDay(), p.getMonth(), p.getYear());
        p.setaDate(aDate);
        Date aDate2 = new Date(day2, month2, year2);
        p.setaDate2(aDate2);

        int age =  year2 - p.getYear();
        System.out.println(p.getName() + " is " + age + " years");

        return p;
    }


}
