/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava_;

/**
 *
 * @author melon
 */
public class Ejercicio23MatrizTraspuesta {
///TRASPUESTA= las filas pasan a ser columnas

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        System.out.println("matriz es :");
        rellenarMatriz(matriz); 
        System.out.println("");
        imprimirMatriz(matriz);
        System.out.println("");
        System.out.println("la traspuesta es");
        traspuesta(matriz);

    }

    static void rellenarMatriz(int matriz[][]) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    static void imprimirMatriz(int matriz[][]) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(matriz[i][j] + " \t ");
            }//salto
            System.out.println("");
        }
    }

    static void traspuesta(int matriz[][]) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                matriz[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(matriz[j][i] + "\t"); //la t lo divide 

            }
            System.out.println("");
        }
    }
}
