package Services;

import Entitys.DateClass;

import java.util.Date;
import java.util.Scanner;

public class DateServices {
    Scanner read = new Scanner(System.in);

    public DateClass createDate() {
        int day=0;
        int month=0;
        int year=0;
        int day2=0;
        int month2=0;
        int year2=0;

        System.out.println("Insert day");
        day = read.nextInt();
        System.out.println("Insert month");
        month = read.nextInt();
        System.out.println("insert year");
        year = read.nextInt();
        System.out.println("********************" +"\n"+
                "Insert Actual Date---");
        System.out.println("Insert day");
        day2 = read.nextInt();
        System.out.println("Insert month");
        month2 = read.nextInt();
        System.out.println("insert year");
        year2 = read.nextInt();

        Date d = new Date(day,month,year);
        Date aD = new Date(day2,month2,year2);

        int calc = year - year2;
        System.out.println("There are "+calc+" years between Date1 and Today");

        return null;

    }
}