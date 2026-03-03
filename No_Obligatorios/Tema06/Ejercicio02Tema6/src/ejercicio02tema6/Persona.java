/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02tema6;

/**
 *
 * @author DAVID
 */
public abstract class Persona {
    //Atributo
    private String nombre;
    
    //Constructores
    public Persona() {
        nombre = "";
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter/Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    //Método abstracto
    public abstract String saludar();
}