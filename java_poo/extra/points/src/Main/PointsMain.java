package Main;

import java.util.Scanner;

public class PointsMain {


    public static void main(String[] args) {
        Scanner R = new Scanner(System.in);
        int x1, x2, y1, y2;

        double dis;

        System.out.println("Insert X1 point");
        x1 = R.nextInt();
        System.out.println("Insert y1 point");
        y1 = R.nextInt();
        System.out.println("Insert X2 point");
        x2 = R.nextInt();
        System.out.println("Insert Y2 point");
        y2 = R.nextInt();

        dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("distance between " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + dis);


    }
}
