/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 */
package introjava_;

/**
 *
 * @author franco
 */
public class java22vectorCuantos2Digitos {

    public static void main(String[] args) {

        int count = 0;
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }//conteo digitos
        for (int i = 0; i < arr.length; i++) {
            i /= 10;
            count++;
            System.out.println(count);

        }
    }

}
