package Services;

import Entitys.CoffeeMaker;
import java.util.Scanner;

public class CoffeeMakerServ {

    Scanner read = new Scanner(System.in);

    public CoffeeMaker isCoffeeMaker() {//ok
        CoffeeMaker c1 = new CoffeeMaker();
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
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
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.println("~~Machine is now FULL");
        } else {
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.println("~~Machine was FULL");
        }
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    public void fillCup(CoffeeMaker c1) {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        System.out.println("Coffee size ? : " + "\t" + "\n"
                + "1. Short" + "\n"
                + "2. Tall" + "\n"
                + "3. Grande");
        int option = 0;
        option = read.nextInt();

        /**
         * if possible fill it, if not pour what you have and say it
         */
        switch (option) {
            case 1://227ml
                if (c1.getActualCap() >= 227) {
                    c1.setActualCap(c1.getActualCap() - 227);
                    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
                    System.out.println("~~CUP FILLED, enjoy your (short coffee)~~");
                } else {
                    c1.setActualCap(c1.getActualCap() - c1.getActualCap());
                    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
                    System.out.println("~~FILLED WITH LESS sorry! " + c1.getActualCap());
                    System.out.println("aks the staff for refill");
                }
            case 2: //340ml
                if (c1.getActualCap() >= 340) {
                    c1.setActualCap(c1.getActualCap() - 340);
                    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
                    System.out.println("~~CUP FILLED, enjoy your (tall coffee)~~");
                } else {
                    c1.setActualCap(c1.getActualCap() - c1.getActualCap());
                    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
                    System.out.println("~~FILLED WITH LESS sorry! " + c1.getActualCap());
                    System.out.println("aks the staff for refill");
                }
            case 3://454ml
                if (c1.getActualCap() >= 454) {
                    c1.setActualCap(c1.getActualCap() - 454);
                    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
                    System.out.println("~~CUP FILLED, enjoy your (grande coffee)~~");
                } else {
                    c1.setActualCap(c1.getActualCap() - c1.getActualCap());
                    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
                    System.out.println("~~FILLED WITH LESS sorry! " + c1.getActualCap());
                    System.out.println("aks the staff for refill");
                }
        }
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    public void emptyMachine(CoffeeMaker c1, float maximunCap, float actualCap) {//ok
        if (c1.getActualCap() > 0) {
            c1.setActualCap(0);
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.println("~~Coffee Maker NOW EMPTY~~");
        } else {
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.println("~~WAS ALREADY EMPTY~~");
            c1.setActualCap(0);
        }
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

    }

    public void addCoffee(CoffeeMaker c1) {//ok
        System.out.println("~~How much coffee do you add to the machine?~~ : " + "\t" + "\n"
                + "1. 227ml" + "\n"
                + "2. 340ml" + "\n"
                + "3. 454ml" + "\n"
                + "4. 908ml");
        int option = 0;
        option = read.nextInt();
        switch (option) {
            case 1:
                System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
                System.out.println("227ml ~Added to the machine");
                c1.setActualCap(c1.getActualCap() + 227);//227ml
                break;
            case 2:
                System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
                System.out.println("340ml ~Added to the machine");
                c1.setActualCap(c1.getActualCap() + 340); //340ml
                break;
            case 3:
                System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
                System.out.println("454ml ~Added to the machine");
                c1.setActualCap(c1.getActualCap() + 454);//454ml
                break;
            case 5:
                System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
                System.out.println("908ml ~Added to the machine");
                c1.setActualCap(c1.getActualCap() + 908);//908ml (2 Grandes)
                break;
        }
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
