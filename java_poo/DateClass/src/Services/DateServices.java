package Services;

import Entitys.DateClass;

import java.util.Scanner;

public class DateServices {
    Scanner read = new Scanner(System.in);
    public DateClass createDate() {
        String day;
        String month;
        int year;
        DateClass d = new DateClass();
        System.out.println("Insert day");
        day = read.next();
        System.out.println("Insert month");
        month = read.next();
        System.out.println("insert year");
        year = read.nextInt();

       d.setDateClass(day+ " / " +month+" / "+year);



        return d;

    }
}
