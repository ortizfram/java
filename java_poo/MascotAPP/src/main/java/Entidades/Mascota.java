package Entidades;

public class Mascota {

    //ATRIBUTOS
    private String nombre;
    private String apodo;
    //Conejo, Gato, Perro, Loro , Carpincho
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;

    private int energia;

    //C.DEFAULT (inicializar variables aca)
    public Mascota(int energia) {
        energia = 1000;
    }

    //CONSTRUCTOR ARGUMENTOS
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza, int energia) {
        this.nombre = nombre;
        this.apodo = apodo;

        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo")) {
            this.tipo = tipo;
        }
        this.energia = 1000;

        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }


    //SET (inferir atributo)le tengo que pasar
    //ingrediente nombre
    //es una licuadora
    public void setNombre(String nombre) {
        if (nombre.length() > 0) {//si mayor  a 0 settear 
            this.nombre = nombre;
        }

    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

//GET
    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    public int getEnergia() {
        return energia;
    }

    /**
     * metodo Pasear
     *
     * @param energiaRestar
     * @return energia
     */
//metodo pasear  
    public int pasear(int energiaRestar) {

        energia -= energiaRestar;

        return energia;
    }

    /**
     * metodo Pasear x vueltas
     *
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
//metodo pasear  //+sobrecarga VUELTAS
    public int pasear(int energiaRestar, int vueltas) {

        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }

        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }

    

}
