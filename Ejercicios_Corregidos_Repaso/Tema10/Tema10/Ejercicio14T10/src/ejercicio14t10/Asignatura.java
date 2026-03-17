/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14t10;

/**
 *
 * @author admin
 */
public class Asignatura {
    // ATRIBUTOS
    private String nombre;
    private float nota;
    
    // CONSTRUCTORES
    public Asignatura(){
        this.nombre = "";
        this.nota = 0;
    }
    
    public Asignatura(String nombre, float nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    // TO STRING
    @Override
    public String toString() {
        return nombre + ": " + nota;
    }    
}
