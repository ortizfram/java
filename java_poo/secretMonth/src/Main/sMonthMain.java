package Main;

import Entitys.sMonth;
import Services.sMonthServices;

public class sMonthMain {
    public static void main(String[] args) {
        sMonthServices ms = new sMonthServices();
        sMonth m = ms.createM();

    }
}
