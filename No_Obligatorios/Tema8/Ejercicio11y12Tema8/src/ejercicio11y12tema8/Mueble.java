/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11y12tema8;

/**
 *
 * @author alumno
 */
public class Mueble {
    //Atributos
    private double precio;
    private String descripcion;
    
    //Constructores
    public Mueble(){
        precio = 0;
        descripcion = "";
    }

    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    //Getters/Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Mueble{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    }
}