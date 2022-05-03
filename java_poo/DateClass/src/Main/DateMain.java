package Main;

import Entitys.DateClass;
import Services.DateServices;

import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        DateServices ds = new DateServices();
        DateClass d1 = ds.createDate();
    }
}