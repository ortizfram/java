/*
 * aquella cuya matriz transpuesta es igual a la matriz negativa
At = -A
 */
package introjava_;

/**
 *
 * @author franco
 */
public class Ejercicio24MatrizAntisimetrica {

    public static void main(String[] args) {
        boolean band = true;
        int[][] A = new int[4][4];
        int[][] AT = new int[4][4];
        rellenarMatriz(A);
        System.out.println("La traspuesta es :");
        System.out.println("");
        imprimirMatriz(A);
        System.out.println(""
                + "es antisimetrica?");
        antisimetrica(A, AT, band);

    }
///crear metriz traspuesta

    static void rellenarMatriz(int[][] A) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                A[i][j] = (int) (Math.random() * 10);
            }
            System.out.println("");
        }
    }

    static void imprimirMatriz(int[][] A) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(A[j][i] + "\t");
            }
            System.out.println("");
        }
    }
///crear antisimetrica

    static void antisimetrica(int[][] A, int AT[][], boolean band) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                A[j][i] = (-1) * A[j][i]; //matriz negativa
                AT[i][j] = A[j][i]; //traspuesta es = matriz negativa
                A[j][i] = (-1) * A[j][i];
//si traspuesta es diferente a matriz principal
                if (AT[i][j] != A[i][j]) {
                    band = false;
                    i = 3;
                    break;
                }
//si verdadero 
                if (band) {
                    System.out.println("La matriz es antisimetrica");
                } else {
                    System.out.println("La matriz no es antisimetrica");
                }
            }
        }

    }
}
