/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioampliacioni10;

/**
 *
 * @author alumno
 */
public class Actividad {
    //Atributos
    private String nombre;
    private String tipo;
    private boolean familiar;
    
    //Constructores
    public Actividad() {
        nombre = "";
        tipo = "";
        familiar = false;
    }

    public Actividad(String nombre, String tipo, boolean familiar) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.familiar = familiar;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isFamiliar() {
        return familiar;
    }

    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }

    //Mostrar
    @Override
    public String toString() {
        return "- Nombre: " + nombre + "\n- Tipo: " + tipo + "\n- Familiar: " + familiar;
    }
}