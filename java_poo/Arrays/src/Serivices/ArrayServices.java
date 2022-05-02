package Serivices;

import Entitys.Array;

import java.util.Arrays;

public class ArrayServices {
    public Array createArray() {
        //one to create one to show
        int i = 0;

        Array a = new Array();


        double[] array = a.getArray();
        double[] array2 = a.getArray2();
//        a.setArray(Math.round(array[] * 10.0 / 10.0)) ;


        for (i = 0; i < array.length; i++) {
            array[i] = Math.random() * 10;
        }

        for (i = 0; i < array2.length; i++) {
            array2[i] = Math.random() * 10;
        }
        //SHOW.....................................
        System.out.println("Array A : " + " \n ");

        for (i = 0; i < array.length; i++) {
            System.out.print("[ " + array[i] + " ]");
        }
        System.out.println("\n");
        System.out.println("Array B : " + " \n ");
        for (i = 0; i < array2.length; i++) {
            System.out.print("[ " + array2[i] + " ]");

        }

        return a;
    }

    public void minToMaxA(Array a) {

        int i = 0;
        System.out.println("\n");
        double[] array = a.getArray();


        System.out.println("min to max = ");
        Arrays.sort(array);// order number max to min
        //
        for (i = 0; i < array.length; i++) {// order number max to min
            //.....if min to max is = || array.lenght-1; i>=0 ;i--
            System.out.print("[ " + array[i] + " ]");//show
        }
    }

    public void first10AOrderedToB(Array a) {
//        10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
//        elementos con el valor 0.5
        int i = 0;
        System.out.println("\n");
        double[] array = a.getArray();
        double[] arrayB = a.getArray2();

        System.out.println("first 10 A[] Ordered + B(0.5) [] =");
        Arrays.sort(array);// order number max to min
        for (i = 0; i < array.length - 40; i++) {// order number max to min
            //.....if min to max is = || array.lenght-1; i>=0 ;i--

            System.out.print("[ " + array[i] + " ]");//show
        }
            for (i = 0; i < arrayB.length-10; i++) {
                arrayB[i] = 0.5;
                System.out.print("[ " + arrayB[i] + " ]");//show
            }
//            //SHOW BOTH*****************************************************
//            for (i = 0; i < arrayB.length; i++)
//                System.out.print("[ " + array[i] + " ]" + "[ " + arrayB[i] + " ]");//show

    }
}


