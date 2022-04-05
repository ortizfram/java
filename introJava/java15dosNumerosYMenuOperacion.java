/*
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
 */
package introjava_;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java15dosNumerosYMenuOperacion {

    static void sumar(int n1, int n2) {
        System.out.println("la suma de " + n1 + " + " + n2 + " es : " + (n1 + n2));

    }

    static void restar(int n1, int n2) {
        System.out.println("la resta de " + n1 + " - " + n2 + " es : " + (n1 - n2));

    }

    static void multiplicar(int n1, int n2) {
        System.out.println("la multiplicacion de " + n1 + " * " + n2 + " es : " + (n1 * n2));

    }

    static void division(int n1, int n2) {
        System.out.println("la division de " + n1 + " / " + n2 + " es : " + (n1 / n2));

    }
//INICIO MENU----------------------------------------------------------------

    static void menu(int n1, int n2) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("-----------------------------------\n"
                    + "INGRESE OPCION A OPERAR\n"
                    + "--  --   --   --  -- --\n"
                    + "1. Suma\n"
                    + "2. Resta\n"
                    + "3. Multiplicacion\n"
                    + "4. Division\n"
                    + "5. SALIR");
            opcion = leer.nextInt();

            if (opcion <= 4 && opcion >= 1) {

                switch (opcion) {
                    case 1:
                        sumar(n1, n2);
                        break;
                    case 2:
                        restar(n1, n2);
                        break;
                    case 3:
                        multiplicar(n1, n2);
                        break;
                    case 4:
                        division(n1, n2);
                        break;

                    default:
                        System.out.println("===OPCION INVALIDA===");
                }

            }

        } while (opcion != 5);
        String yn = " ";
        //////////SI RESPUESTA ES 5, Y/N :
        if (opcion == 5) {
            System.out.println("Esta seguro que desea salir ? \n"
                    + "( Y / N ) :");
            yn = leer.next();

            if (yn.equals("y")) {
                System.out.println("===========\n"
                        + "HA TERMINADO LA SECUENCIA");
            }else{
            menu(n1,n2);
            }
        }
    }//fin menu funcion
    //-----------------------------------------

///MAIN
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2 = 0;

        System.out.println("ingrese 2 numeros para realizar la operacion :");
        n1 = leer.nextInt();
        n2 = leer.nextInt();

        menu(n1, n2);

    }

}
//fin main
