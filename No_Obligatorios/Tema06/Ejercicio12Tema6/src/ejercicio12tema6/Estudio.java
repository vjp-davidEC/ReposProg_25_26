/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12tema6;

/**
 *
 * @author DAVID
 */
public class Estudio {
    //Atributo
    private String nombre;
    private String ultimoLanzamiento;
    
    //Constructores
    public Estudio(){
        nombre = "";
        ultimoLanzamiento = "";
    }
    
    public Estudio(String nombre, String ultimoLanzamiento){
        this.nombre = nombre;
        this.ultimoLanzamiento = ultimoLanzamiento;
    }
    
    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUltimoLanzamiento() {
        return ultimoLanzamiento;
    }

    public void setUltimoLanzamiento(String ultimoLanzamiento) {
        this.ultimoLanzamiento = ultimoLanzamiento;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Estudio{" + "nombre=" + nombre + ", ultimoLanzamiento=" + ultimoLanzamiento + '}';
    }
}