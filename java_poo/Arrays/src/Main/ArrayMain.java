package Main;

import Entitys.Array;
import Serivices.ArrayServices;

public class ArrayMain {
    public static void main(String[] args) {
        ArrayServices as = new ArrayServices();
        Array a1 = as.createArray();

        as.minToMaxA(a1);
        as.first10AOrderedToB(a1);


    }
}
