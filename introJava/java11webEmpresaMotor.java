
package introjava_;

import java.util.Scanner;

/**
Definir una variable tipoMotor y permitir que el
* usuario ingrese un valor entre 1 y 4.
El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
existe un valor válido para tipo de bomba”
Bucles y sentencias de salto break y continue
 */
public class java11webEmpresaMotor {
    
    static void siTipoMotor(int motor){
        switch(motor){
            case 1 :
                System.out.println("La bomba "+motor +
"es BOMBA DE AGUA");
            break;    
            case 2 :
                System.out.println("La bomba "+motor +
"es BOMBA DE GASOLINA");
            break;    
            case 3 :
                System.out.println("La bomba "+motor +
"es BOMBA DE HORMIGON");
            break;
            case 4 :
                System.out.println("La bomba "+motor +
"es BOMBA DE PASTA ALIMENTICIA");
            break;
            
            default:
                System.out.println("Motor INVALIDO");
  
        }
    
    }
    
    public static void main(String [] args){
    Scanner leer = new Scanner(System.in);
    
    int motor;
    
        System.out.println("ingrese tipo de MOTOR(1,2,3 o 4)=>...");
        motor = leer.nextInt();
        
        siTipoMotor(motor);
    }
}
