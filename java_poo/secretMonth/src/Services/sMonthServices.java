package Services;
import Entitys.sMonth;
import java.util.Scanner;
public class sMonthServices {

    public sMonth createM() {
        Scanner read = new Scanner(System.in);
        sMonth m1 = new sMonth();

        int cont = 0;
        String secMonth = m1.getSecretMonth();
//        System.out.println(secMonth);
        String tryy;

        System.out.println("Try to guess secret Month: ");
        do {
            System.out.print("Insert Month: ");
            tryy = read.next().toLowerCase();
            if (!tryy.equals(secMonth)) {
                System.out.println("you failed, try again\n");
                cont++;
            }
        } while (!tryy.equals(secMonth));
        System.out.println("you got it !!, you had tried " + cont + " times");


        return m1;
    }

}