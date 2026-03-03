/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebatema5;

/**
 *
 * @author alumno
 */
public class Propietario {
    
    //Atributos
    private String nombre;
    private int edad;
    
    //Constructores
    public Propietario(){
        this.nombre = "";
        this.edad = 0;
    }
    
    public Propietario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
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
    
    //Mostrar/toString
    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}