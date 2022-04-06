package introjava_;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Ejercicio25matrizMagica {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int po;
        int suma = 0, sumaD1 = 0, sumaD2 = 0;
        int filas, columnas;
        boolean bool = false;

        System.out.println("-----Ingrese el tamaño de la matriz-----");

        System.out.println(" ");

        System.out.println("Ingrese la cantidad de filas");

        filas = leer.nextInt();

        System.out.println("Ingrese la cantidad de columnas");

        columnas = leer.nextInt();

        while (columnas != filas) { /// Validamos que la matriz que se ingrese sea cuadrada

            System.out.println("La matriz debe ser cuadrada!!!");

            System.out.println(" ");

            System.out.println("Ingrese la cantidad de filas");

            filas = leer.nextInt();

            System.out.println("Ingrese la cantidad de columnas");

            columnas = leer.nextInt();

        }

        int arr[][] = new int[filas][columnas];

        suma = filas * columnas;

        

        int vectorColumnas[] = new int[suma];
        int vectorFilas[] = new int[suma];

  ///Rellenamos la matriz, puede ser manual o usando la funcion Math.random();
        System.out.println("Ingrese numeros en la matriz");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                arr[i][j] = leer.nextInt();

            }
        }

        System.out.println("La matriz es: ");

  //Escribimos la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print(arr[i][j] + "\t");

            }

            System.out.println(" ");
        }

  //Inicializamos vectores en 0
        for (int i = 0; i < suma - 1; i++) {

            vectorColumnas[i] = 0;
            vectorFilas[i] = 0;

        }

        //Filas
        for (int i = 0; i < columnas - 1; i++) {
            for (int j = 0; j < filas - 1; j++) {

                vectorFilas[i] += arr[j][i];

            }
        }

        //Columnas
        for (int i = 0; i < filas - 1; i++) {
            for (int j = 0; j < columnas - 1; j++) {

                vectorColumnas[i] += arr[j][i];

            }
        }

        //Diagonal principal
        for (int i = 0; i < columnas - 1; i++) {

            sumaD1 += arr[i][i];

        }

        //Diagonal inversa
        po = columnas - 1;
        for (int i = 0; i < columnas - 1; i++) {

            sumaD2 += arr[i][po];
            po = po - 1;

        }

//Verificacion de todas las filas, columnas y diagonales
        for (int i = 0; i < columnas - 1; i++) {

            if (vectorFilas[i] == vectorColumnas[i] || sumaD1 == sumaD2) {

                bool = true;

            } else {

                bool = false;

            }
        }

        ///Segun el resultado de bool determinamos si es magica o no
        if (bool == true) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");
        }
    }

}
