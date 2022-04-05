/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package introjava_;

/**
 *
 * @author franco
 */
public class java20funcionRellenarVectorEnteros {
///UN ARREGLO PARA HACER Y UNO PARA MOSTRAR

    public static void main(String[] args) {
        int i = 0;

        int[] vector = new int[100]; //crear vector y asignar dimension
        for (i = 0; i <= 100 - 1; i++) {
            vector[i] = i + 1;
        }
        System.out.println("el arreglo es : ");
        for(i=0;i<=100-1;i++){
            System.out.println(vector[i]);
        }
    }
}
