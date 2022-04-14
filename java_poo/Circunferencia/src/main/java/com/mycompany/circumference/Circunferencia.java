
import java.util.Scanner;

/*
 *  Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia ( Area = π ∗ radio ! ).
e) Método perimetro(): 
para calcular el perímetro 
( Perimetro = 2 ∗ π ∗ radio )
.lates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
package com.mycompany.circumference;

/**
 *
 * @author melon
 */
public class Circunferencia {

    Scanner leer = new Scanner(System.in);

    //atributos
    private float radio;

//meth . construcctor    inicializa
    public Circunferencia(float radio) {
        this.radio = radio;
    }

//get y set
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }

}
