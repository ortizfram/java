package Services;

import Entitys.CoffeeMaker;
import java.util.Scanner;

public class CoffeeMakerServ {

    Scanner read = new Scanner(System.in);

    public CoffeeMaker isCoffeeMaker() {//ok
        CoffeeMaker c1 = new CoffeeMaker();
        System.out.println("WELCOME enjoy @@NESPRESSO");

        return c1;
    }

    public void fillWithCoffee(CoffeeMaker c1, float maximunCap, float actualCap) {//ok
        /**
         * if CoffeeMaker empty, fill (it's full with 2 Grandes)
         */
        if (c1.getActualCap() == 0) {
            c1.setMaximunCap(908);//ml (2Grandes)
            c1.setActualCap(c1.getActualCap() + c1.getMaximunCap());
            System.out.println("~~Machine is FULL");
        }
    }

    public void fillCup(CoffeeMaker c1) {
        System.out.println("Coffee size ? : "
                + "1. Short"
                + "2. Tall"
                + "3. Grande");
        int option = read.nextInt();
        option = 0;
        /**
         * if possible fill it, if not pour what you have and say it
         */
        switch (option) {
            case 1://227ml
                if (c1.getActualCap() >= 227) {
                    c1.setActualCap(c1.getActualCap() - 227);
                    System.out.println("~~CUP FILLED, enjoy your coffee~~");
                } else {
                    c1.setActualCap(c1.getActualCap() - c1.getActualCap());
                    System.out.println("~~FILLED WITH LESS sorry! " + c1.getActualCap());
                    System.out.println("aks the staff for refill");
                }
            case 2: //340ml
                if (c1.getActualCap() >= 340) {
                    c1.setActualCap(c1.getActualCap() - 340);
                    System.out.println("~~CUP FILLED, enjoy your coffee~~");
                } else {
                    c1.setActualCap(c1.getActualCap() - c1.getActualCap());
                    System.out.println("~~FILLED WITH LESS sorry! " + c1.getActualCap());
                    System.out.println("aks the staff for refill");
                }
            case 3://454ml
                if (c1.getActualCap() >= 454) {
                    c1.setActualCap(c1.getActualCap() - 454);
                    System.out.println("~~CUP FILLED, enjoy your coffee~~");
                } else {
                    c1.setActualCap(c1.getActualCap() - c1.getActualCap());
                    System.out.println("~~FILLED WITH LESS sorry! " + c1.getActualCap());
                    System.out.println("aks the staff for refill");
                }
        }
    }

    public void emptyMachine(CoffeeMaker c1, float maximunCap, float actualCap) {//ok
        if (c1.getActualCap() > 0) {
            c1.setActualCap(0);
            System.out.println("~~Coffee Maker NOW EMPTY~~");
        } else {
            System.out.println("~~IT'S ALREADY EMPTY~~");
            c1.setActualCap(0);
        }
    }

    public void addCoffee(CoffeeMaker c1) {//ok
        System.out.println("~~How much do you add ?~~ : "
                + "1. 227ml"
                + "2. 340ml"
                + "3. 454ml"
                + "4. 908ml");
        int option = read.nextInt();
        option = 0;
        switch (option) {
            case 1:
                c1.setActualCap(c1.getActualCap() + 227);//227ml
                System.out.println("227ml ~Added");
            case 2:
                c1.setActualCap(c1.getActualCap() + 340); //340ml
                System.out.println("340ml ~Added");
            case 3:
                c1.setActualCap(c1.getActualCap() + 454);//454ml
                System.out.println("454ml ~Added");
            case 5:
                c1.setActualCap(c1.getActualCap() + 908);//908ml (2 Grandes)
                System.out.println("908ml ~Added");
        }
    }

}
