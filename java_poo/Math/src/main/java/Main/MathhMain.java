package Main;

import Entitys.Mathh;
import Services.MathhServices;

public class MathhMain {
    
    public static void main(String[] args) {
        MathhServices ms = new MathhServices();
        Mathh m1 = ms.createN();
        ms.returnBigger(m1);
        ms.powerMaxxMin(m1);
        ms.calculateRatioMin(m1);
    }
}
