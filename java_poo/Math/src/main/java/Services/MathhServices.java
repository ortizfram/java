package Services;

import Entitys.Mathh;

public class MathhServices {

    public Mathh createN() {
        Mathh m = new Mathh();
        m.setN1(Math.random() * 10);
        m.setN2(Math.random() * 10);
//         double roundDbl = Math.round(d*100.0)/100.0;
        double n1 = m.getN1();
        double n2 = m.getN2();
        m.setN1(Math.round(n1 * 10.0) / 10.0);
        m.setN2(Math.round(n2 * 10.0) / 10.0);
        double num1 = m.getN1();
        double num2 = m.getN2();
        System.out.println("numbers were created = " + num1 + " | " + num2);
        System.out.println("\n");
        return m;

    }

    public void returnBigger(Mathh m) {
        double num1 = m.getN1();
        double num2 = m.getN2();

        System.out.println("Math.max(" + num1 + " | " + num2 + ")=" + Math.max(num1, num2));
        System.out.println("\n");
    }

    public void powerMaxxMin(Mathh m) {
        double num1 = m.getN1();
        double num2 = m.getN2();
        double pow = Math.pow(Math.max(num1, num2), Math.min(num1, num2));
        System.out.println("Max Powered Min = " + pow);
        System.out.println("\n");
    }

    public void calculateRatioMin(Mathh m) {
//         System.out.println("Math.abs(" + x + ")=" + Math.abs(x));
        double num1 = m.getN1();
        double num2 = m.getN2();
        double abs = Math.abs(Math.min(num1, num2));
        System.out.println("Absolute Min N = " + abs);//before ratio we need absolute n
        double sqrt = Math.sqrt(abs);
        System.out.println("Squared Min Root = " + sqrt);
        System.out.println("\n");
    }

}
