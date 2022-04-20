package Main;

import Entitys.CoffeeMaker;
import Services.CoffeeMakerServ;
import java.util.Scanner;

public class CoffeeMAkerMain {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CoffeeMakerServ cs = new CoffeeMakerServ();
        CoffeeMaker c1 = cs.isCoffeeMaker();
        int option;
        option = 0;

        do {
            System.out.println("***Choose an option***");
            System.out.println("\n"
                    + "1. Refill MAchine to the top" + "\n"
                    + "2. Make Coffee" + "\n"
                    + "3. Clean Machine Filter" + "\n"
                    + "4. Add Coffee to Machine " + "\n"
                    + "\t" + "\n"
                    + "5. ~EXIT~");

            option = read.nextInt();
            switch (option) {
                case 1:
                    cs.fillWithCoffee(c1, 0, 0);
                    break;
                case 2:
                    cs.fillCup(c1);
                    break;
                case 3:
                    cs.emptyMachine(c1, 0, 0);
                    break;
                case 4:
                    cs.addCoffee(c1);
                    break;

            }
        } while (option != 5);
        System.out.println("Thank You, See you soon :) ");

    }

}
