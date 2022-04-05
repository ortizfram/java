/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava_;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java21RellenarVectAleatorioYencontrarX {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int key = 0;

        //crear arr aleatorio 
        int[] arr = new int[10];//largo de array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);//rango de random 
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//------------
        System.out.println("que n desea encontrar");
        key = leer.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println(key + " esta en posicion " + i);
            }else{System.out.println("no existe");}
        }

    }
}
