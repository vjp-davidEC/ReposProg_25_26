/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01tema12;

/**
 *
 * @author alumno
 */
public class Contacto {
    //Atributos
    private String nombre;
    private int edad;
    private int numeroMovil;
    
    //Constructores
    public Contacto() {
        nombre = "";
        edad = 0;
        numeroMovil = 0;
    }

    public Contacto(String nombre, int edad, int numeroMovil) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMovil = numeroMovil;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(int numeroMovil) {
        this.numeroMovil = numeroMovil;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Contacto con nombre " + nombre + ", edad " + edad + " y telefono movil " + numeroMovil + '}';
    }
}