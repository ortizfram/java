/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author franco
 */
public class Mascota {

    public String nombre;
    public String apodo;
    public String tipo;
    public boolean getNombre;

//make a new set //void cause it dont give info
    public void setNombre(String nombre) {
        this.nombre = nombre; //SETTER
    }
//inser all setters: ALT + INSRT

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//GETTER inside the entitie
    public String getNombre() {
        return nombre;
    }
}
