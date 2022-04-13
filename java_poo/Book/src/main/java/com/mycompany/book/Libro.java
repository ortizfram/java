/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package com.mycompany.book;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Libro {

    Scanner leer = new Scanner(System.in);
//atributos

    private String titulo;
    private int ISBN;
    private String autor;
    private int numPaginas;

    //construcctor
    public Libro(String titulo, int ISBN, String autor, int numPaginas) {

        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.numPaginas = numPaginas;

    }

//construcctor vacio 
    public Libro() {
    }

//metodos  //void no retorna valor
    public void getDatos() {
        System.out.println("ingrese titulo del libro :");
        titulo = leer.next();
        System.out.println("ingrese ISBN :");
        ISBN = leer.nextInt();
        System.out.println("ingrese autor :");
        autor = leer.next();
        System.out.println("ingrese Num de paginas : ");
        numPaginas = leer.nextInt();

    }

    //metodo mostar rsultado
    public void mostrarResultado() {
        System.out.println("Libro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", autor=" + autor + ", numPaginas=" + numPaginas + '}');
    }

//Metodos  return to string
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }

}
