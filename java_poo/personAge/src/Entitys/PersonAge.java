package Entitys;

import java.util.Date;

public class PersonAge {
    String name;
    int year;
    int day;
    int month;
    Date aDate;
    Date aDate2;

    public PersonAge() {
    }

    public PersonAge(String name, int year, int day, int month, Date aDate, Date aDate2) {
        this.name = name;
        this.year = year;
        this.day = day;
        this.month = month;
        this.aDate = aDate;
        this.aDate2 = aDate2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }

    public Date getaDate2() {
        return aDate2;
    }

    public void setaDate2(Date aDate2) {
        this.aDate2 = aDate2;
    }

    @Override
    public String toString() {
        return "PersonAge{" + "name='" + name + '\'' + ", year=" + year + ", day=" + day + ", month=" + month + ", aDate=" + aDate + ", aDate2=" + aDate2 + '}';
    }
}
