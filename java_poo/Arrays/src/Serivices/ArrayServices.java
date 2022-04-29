package Serivices;

import Entitys.Array;

public class ArrayServices {
    public Array createArray() {
        //one to create one to show
        int i = 0;

        Array a = new Array();


        double array[] = a.getArray();
        double array2[] = a.getArray2();
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
            ;
        }
        System.out.println("\n");
        System.out.println("Array B : " + " \n ");
        for (i = 0; i < array2.length; i++) {
            System.out.print("[ " + array2[i] + " ]");

            ;
        }

        return a;
    }

    public void first10MaxtoMin(Array a) {
        int i = 0;
        System.out.println("\n");
        double array[] = a.getArray();
        double array2[] = a.getArray2();

        //SHOW.....................................
        System.out.println("Array A first.10 Max_MIn: " + " \n ");
//
        for (i = 0; i < array.length - 40; i++) {

//            System.out.print("[ " + Math.max(array[i],)+" ]");
            ;
        }


    }

}
